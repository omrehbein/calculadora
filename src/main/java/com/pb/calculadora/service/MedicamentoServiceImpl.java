package com.pb.calculadora.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.GrupoMedicamentoDto;
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
}
