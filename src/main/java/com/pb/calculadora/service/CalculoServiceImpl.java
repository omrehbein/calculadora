package com.pb.calculadora.service;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.CalculoDto;
import com.pb.calculadora.dto.CalculoResultadoDto;
import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.entity.DiluicaoConfiguracaoEntity;
import com.pb.calculadora.entity.GrupoMedicamentoEntity;
import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.exceptions.RecordNotFoundException;
import com.pb.calculadora.repository.DiluicaoConfiguracaoRepository;
import com.pb.calculadora.repository.GrupoMedicamentoRepository;
import com.pb.calculadora.repository.MedicamentoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CalculoServiceImpl implements CalculoService {

    private DiluicaoConfiguracaoRepository diluicaoConfiguracaoRepository;
    private GrupoMedicamentoRepository grupoMedicamentoRepository;
    private MedicamentoRepository medicamentoRepository;
    private ModelMapper modelMapper;
    
    public CalculoServiceImpl(
        DiluicaoConfiguracaoRepository diluicaoConfiguracaoRepository,
        GrupoMedicamentoRepository grupoMedicamentoRepository,
        MedicamentoRepository medicamentoRepository,
        ModelMapper modelMapper
    ){
        this.diluicaoConfiguracaoRepository = diluicaoConfiguracaoRepository;
        this.grupoMedicamentoRepository = grupoMedicamentoRepository;
        this.medicamentoRepository = medicamentoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CalculoResultadoDto calcular(Long medicamentoId, CalculoDto calculoDto) {

        MedicamentoEntity medicamentoEntity = this.medicamentoRepository.findById(medicamentoId).orElseThrow(() -> new RecordNotFoundException("Medicamento não Encontrado"));

        CalculoResultadoDto calculoResultadoDto = new CalculoResultadoDto();
        calculoResultadoDto.setPassosAdministracao(new ArrayList<String>());
        calculoResultadoDto.setInfoList(new ArrayList<String>());

        BigDecimal indicePercentual = this.getIndice(calculoDto.getQuantidadeAdministrar(), medicamentoEntity.getQuantidadeApresentacao() );
        calculoResultadoDto.getPassosAdministracao().add(MessageFormat.format("O indice percentual de {0} sobre {1} é {2}", calculoDto.getQuantidadeAdministrar(), medicamentoEntity.getQuantidadeApresentacao(), indicePercentual));
        
        List<DiluicaoConfiguracaoEntity> diluicaoConfiguracaoEntitys = this.diluicaoConfiguracaoRepository.findAllByMedicamentoIdAndViaAdministracaoIdOrderBySequencia(medicamentoId, calculoDto.getViaAdministracaoId());
        
        BigDecimal volumeAtual = new BigDecimal(0);

        if (medicamentoEntity.getConcentracaoInicial() != null){
            volumeAtual = medicamentoEntity.getConcentracaoInicial().multiply(medicamentoEntity.getQuantidadeApresentacao());//TODO pode ser um campo de volume 
            calculoResultadoDto.getPassosAdministracao().add(MessageFormat.format("Concentracao inicial do medicamento é {0}.", medicamentoEntity.getConcentracaoInicial()));
        }

        for (DiluicaoConfiguracaoEntity diluicaoConfiguracaoEntity : diluicaoConfiguracaoEntitys) {
            if (diluicaoConfiguracaoEntity.getVolumeAspirado() != null){
                calculoResultadoDto.getPassosAdministracao().add(
                    MessageFormat.format(
                        "Aspire {0} ml do processo anterior", 
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
        }

        BigDecimal resultado = volumeAtual.multiply(indicePercentual);

        calculoResultadoDto.setInfoAdministracao(MessageFormat.format("Aspire {0} ml.", resultado));

        return calculoResultadoDto;
    }

    private BigDecimal getIndice(BigDecimal quantidadeAdministrar, BigDecimal quantidadeApresentacao) {
        return quantidadeAdministrar.divide(quantidadeApresentacao);
    }
}
