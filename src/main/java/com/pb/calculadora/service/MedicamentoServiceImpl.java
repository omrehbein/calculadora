package com.pb.calculadora.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.dto.Select2ResultDto;
import com.pb.calculadora.entity.GrupoMedicamentoEntity;
import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.repository.GrupoMedicamentoRepository;
import com.pb.calculadora.repository.MedicamentoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    private GrupoMedicamentoRepository grupoMedicamentoRepository;
    private MedicamentoRepository medicamentoRepository;
    private ModelMapper modelMapper;
    
    public MedicamentoServiceImpl(
        GrupoMedicamentoRepository grupoMedicamentoRepository,
        MedicamentoRepository medicamentoRepository,
        ModelMapper modelMapper
    ){
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
                entity -> this.modelMapper.map(entity, Select2ResultDto.class)
            ).collect(Collectors.toList())
        );
        return select2Dto;
    }
}
