package com.pb.calculadora.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.dto.Select2ResultDto;
import com.pb.calculadora.entity.ViaAdministracaoEntity;
import com.pb.calculadora.repository.ViaAdministracaoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ViaAdministracaoServiceImpl implements ViaAdministracaoService {

    private ViaAdministracaoRepository viaAdministracaoRepository;
    private ModelMapper modelMapper;
    
    public ViaAdministracaoServiceImpl(
        ViaAdministracaoRepository viaAdministracaoRepository,
        ModelMapper modelMapper
    ){
        this.viaAdministracaoRepository = viaAdministracaoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Select2Dto select2(String term) {
        List<ViaAdministracaoEntity> viaAdministracaoEntitys = this.viaAdministracaoRepository.findAllByNomeContainingIgnoreCaseOrderById(term);
        Select2Dto select2Dto = new Select2Dto();
        select2Dto.setResults(
            viaAdministracaoEntitys.stream().map( 
                entity -> this.modelMapper.map(entity, Select2ResultDto.class)
            ).collect(Collectors.toList())
        );
        return select2Dto;
    }
}
