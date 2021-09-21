package com.pb.calculadora.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.ConfiguracaoDto;
import com.pb.calculadora.dto.ConfiguracaoItemDto;
import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.dto.Select2ResultDto;
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
public class MedicamentoServiceImpl implements MedicamentoService {

    private DiluicaoConfiguracaoRepository diluicaoConfiguracaoRepository;
    private GrupoMedicamentoRepository grupoMedicamentoRepository;
    private MedicamentoRepository medicamentoRepository;
    private ModelMapper modelMapper;
    
    public MedicamentoServiceImpl(
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
    public List<GrupoMedicamentoDto> grupoMedicamentos() {
        List<GrupoMedicamentoEntity> grupoMedicamentoEntitys = this.grupoMedicamentoRepository.findAll();
        List<GrupoMedicamentoDto> grupoMedicamentoDtos = grupoMedicamentoEntitys.stream().map( 
            entity -> map(entity) 
        ).collect(Collectors.toList());
        return grupoMedicamentoDtos;
    }

    private GrupoMedicamentoDto map(GrupoMedicamentoEntity entity) {
        return this.modelMapper.map(entity, GrupoMedicamentoDto.class);
    }

    @Override
    public List<MedicamentoEntity> medicamentos() {
        return this.medicamentoRepository.findAll();
    }

    @Override
    public Select2Dto select2(String term) {
        List<MedicamentoEntity> medicamentoEntitys = this.medicamentoRepository.findAllByNomeContainingIgnoreCaseOrderById(term);
        Select2Dto select2Dto = new Select2Dto();
        select2Dto.setResults(
            medicamentoEntitys.stream().map( 
                entity -> {
                    entity.setNome(MessageFormat.format("{0} - {1}{2}", entity.getNome(), entity.getQuantidadeApresentacao(), entity.getUnidadeMedida().getSigla()));
                    return this.modelMapper.map(entity, Select2ResultDto.class);
                }
            ).collect(Collectors.toList())
        );
        return select2Dto;
    }

    @Override
    public ConfiguracaoDto configuracao(Long medicamentoId) {
        ConfiguracaoDto configuracaoDto = new ConfiguracaoDto();
        configuracaoDto.setConfiguracaoItens(new ArrayList<ConfiguracaoItemDto>());

        MedicamentoEntity medicamentoEntity = this.medicamentoRepository.findById(medicamentoId).orElseThrow(() -> new RecordNotFoundException("Medicamento não Encontrado"));

        List<DiluicaoConfiguracaoEntity> diluicaoConfiguracaoEntitys = this.diluicaoConfiguracaoRepository.findAllByMedicamentoIdOrderByViaAdministracaoIdAscSequenciaAsc(medicamentoId);
        
        configuracaoDto.getConfiguracaoItens().addAll(
            diluicaoConfiguracaoEntitys.stream().map( 
                entity -> {
                    return this.modelMapper.map(entity, ConfiguracaoItemDto.class);
                }
            ).collect(Collectors.toList())
        );
        
        return configuracaoDto;
    }
}
