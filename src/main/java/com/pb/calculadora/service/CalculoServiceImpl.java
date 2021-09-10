package com.pb.calculadora.service;

import java.math.BigDecimal;
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
        MedicamentoEntity medicamentoEntity = this.medicamentoRepository.findById(medicamentoId)
            .orElseThrow(() -> new RecordNotFoundException("Medicamento não Encontrado"));
        
        List<DiluicaoConfiguracaoEntity> diluicaoConfiguracaoEntitys = this.diluicaoConfiguracaoRepository.findAllByMedicamentoIdAndViaAdministracaoIdOrderBySequencia(medicamentoId, calculoDto.getViaAdministracaoId());
        
        //medicamentoEntity.get
        for (DiluicaoConfiguracaoEntity diluicaoConfiguracaoEntity : diluicaoConfiguracaoEntitys){

            medicamentoEntity.getConcentracaoInicial();
            
        }

        CalculoResultadoDto calculoResultadoDto = new CalculoResultadoDto();

        calculoResultadoDto.setInfoAdministracao("Resultado da Aspiração é (5,34 ml).");

        calculoResultadoDto.setPassosAdministracao(new ArrayList<String>());
        calculoResultadoDto.setInfoList(new ArrayList<String>());

        calculoResultadoDto.getPassosAdministracao().add("Diluir o pó com 2ml e misturar - IM: 2 ml AD");
        calculoResultadoDto.getPassosAdministracao().add("Em seringa de 20ml, aspirar 2ml do pó diluído e completar com 18ml SF - Aspirar 1 frasco + 18 ml SF = 25 mg/ml");

        calculoResultadoDto.getInfoList().add("É necessário adicionar a permeabilização ao resultado");

        return calculoResultadoDto;
    }
}
