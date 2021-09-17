package com.pb.calculadora.mapper;

import com.pb.calculadora.dto.Select2ResultDto;
import com.pb.calculadora.entity.ViaAdministracaoEntity;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class ViaAdministracaoMapper {
    private ViaAdministracaoMapper() {
		
	}
	
	public static ModelMapper map(ModelMapper modelMapper) {
		modelMapper.addMappings(toMap());
        return modelMapper;
    }
	
	private static PropertyMap<ViaAdministracaoEntity, Select2ResultDto> toMap() {
        return new PropertyMap<ViaAdministracaoEntity, Select2ResultDto>() {
            @Override
            protected void configure() {
                map(source.getId()).setId(null);
                map(source.getNome()).setText(null);
            }
        };
    }
}
