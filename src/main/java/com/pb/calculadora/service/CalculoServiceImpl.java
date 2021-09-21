package com.pb.calculadora.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import com.pb.calculadora.dto.CalculoDto;
import com.pb.calculadora.dto.CalculoResultadoDto;
import com.pb.calculadora.entity.DiluicaoConfiguracaoEntity;
import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.exceptions.ExceedsConfiguredLimitException;
import com.pb.calculadora.exceptions.RecordNotFoundException;
import com.pb.calculadora.exceptions.UndefinedConcentrationException;
import com.pb.calculadora.repository.DiluicaoConfiguracaoRepository;
import com.pb.calculadora.repository.GrupoMedicamentoRepository;
import com.pb.calculadora.repository.MedicamentoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CalculoServiceImpl implements CalculoService {

    private DiluicaoConfiguracaoRepository diluicaoConfiguracaoRepository;
    private MedicamentoRepository medicamentoRepository;
    
    public CalculoServiceImpl(
        DiluicaoConfiguracaoRepository diluicaoConfiguracaoRepository,
        GrupoMedicamentoRepository grupoMedicamentoRepository,
        MedicamentoRepository medicamentoRepository,
        ModelMapper modelMapper
    ){
        this.diluicaoConfiguracaoRepository = diluicaoConfiguracaoRepository;
        this.medicamentoRepository = medicamentoRepository;
    }

    @Override
    public CalculoResultadoDto calcular(Long medicamentoId, CalculoDto calculoDto) {

        BigDecimal volumeAtual = new BigDecimal(0);
        BigDecimal concentracaoAtual = new BigDecimal(0);
        
        MedicamentoEntity medicamentoEntity = this.medicamentoRepository.findById(medicamentoId).orElseThrow(() -> new RecordNotFoundException("Medicamento não Encontrado"));

        CalculoResultadoDto calculoResultadoDto = this.getCalculoResultadoDto();

        calculoResultadoDto.getPassosAdministracao().add(MessageFormat.format("Prescrição {0} {1}", calculoDto.getQuantidadeAdministrar(), medicamentoEntity.getUnidadeMedida().getSigla()));
        
        List<DiluicaoConfiguracaoEntity> diluicaoConfiguracaoEntitys = this.diluicaoConfiguracaoRepository.findAllByMedicamentoIdAndViaAdministracaoIdOrderBySequencia(medicamentoId, calculoDto.getViaAdministracaoId());

        this.fillInformacao(medicamentoEntity, calculoResultadoDto);

        if (medicamentoEntity.getConcentracaoInicial() != null) {
            volumeAtual = medicamentoEntity.getConcentracaoInicial().multiply(medicamentoEntity.getQuantidadeApresentacao());//TODO pode ser um campo de volume 
            concentracaoAtual = medicamentoEntity.getConcentracaoInicial();
            calculoResultadoDto.getPassosAdministracao().add(MessageFormat.format("Concentracao inicial do medicamento é {0} {1}/ml.", medicamentoEntity.getConcentracaoInicial(), medicamentoEntity.getUnidadeMedida().getSigla()));
        }

        for (DiluicaoConfiguracaoEntity diluicaoConfiguracaoEntity : diluicaoConfiguracaoEntitys) {
            if (diluicaoConfiguracaoEntity.getVolumeAspirado() != null){
                calculoResultadoDto.getPassosAdministracao().add(
                    MessageFormat.format(
                        "Aspire {0} ml do processo anterior;", 
                        diluicaoConfiguracaoEntity.getVolumeAspirado()
                    )
                );
            }

            calculoResultadoDto.getPassosAdministracao().add(
                MessageFormat.format(
                    "Adicione {0} ml de {1} ficando {2} ml com concentracao = {3} {4}/ml.", 
                    diluicaoConfiguracaoEntity.getVolumeAdicionado(),
                    diluicaoConfiguracaoEntity.getDiluente().getNome(),
                    diluicaoConfiguracaoEntity.getVolumeFinal(),
                    diluicaoConfiguracaoEntity.getConcentracao(),
                    medicamentoEntity.getUnidadeMedida().getSigla()
                )
            );
            
            volumeAtual = diluicaoConfiguracaoEntity.getVolumeFinal();
            concentracaoAtual = diluicaoConfiguracaoEntity.getConcentracao();
        }

        if (concentracaoAtual.equals(BigDecimal.ZERO)){
            throw new ExceedsConfiguredLimitException("Concentração não foi definida. Verifique a configuracao!");
        }

        BigDecimal volumeAspirar = calculoDto.getQuantidadeAdministrar().divide(concentracaoAtual, 2, RoundingMode.HALF_UP);

        if (volumeAspirar.compareTo(volumeAtual) > 0){
            throw new UndefinedConcentrationException(MessageFormat.format("Volume a aspirar {0} excede o volume resultante do frasco {1}.", volumeAspirar, volumeAtual));
        }

        calculoResultadoDto.setInfoAdministracao(MessageFormat.format("Aspire {0} ml.", volumeAspirar));

        return calculoResultadoDto;
    }

    private void fillInformacao(MedicamentoEntity medicamentoEntity, CalculoResultadoDto calculoResultadoDto) {
        if (StringUtils.hasText(medicamentoEntity.getInfoSobra())){
            calculoResultadoDto.getInfoList().add(MessageFormat.format("Info Sobra: {0}", medicamentoEntity.getInfoSobra()));
        }

        if (StringUtils.hasText(medicamentoEntity.getInfoTempoAdministracao())){
            calculoResultadoDto.getInfoList().add(MessageFormat.format("Tempo Administracão: {0}", medicamentoEntity.getInfoTempoAdministracao()));
        }

        if (StringUtils.hasText(medicamentoEntity.getInfoObservacao())){
            calculoResultadoDto.getInfoList().add(MessageFormat.format("Observação: {0}", medicamentoEntity.getInfoObservacao()));
        }
    }

    private CalculoResultadoDto getCalculoResultadoDto() {
        CalculoResultadoDto calculoResultadoDto = new CalculoResultadoDto();
        calculoResultadoDto.setPassosAdministracao(new ArrayList<String>());
        calculoResultadoDto.setInfoList(new ArrayList<String>());
        return calculoResultadoDto;
    }
}
