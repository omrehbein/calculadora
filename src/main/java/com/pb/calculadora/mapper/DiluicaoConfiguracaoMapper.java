package com.pb.calculadora.mapper;

import com.pb.calculadora.dto.ConfiguracaoItemDto;
import com.pb.calculadora.entity.DiluicaoConfiguracaoEntity;


import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class DiluicaoConfiguracaoMapper {
    private DiluicaoConfiguracaoMapper() {
		
	}
	
	public static ModelMapper map(ModelMapper modelMapper) {
		modelMapper.addMappings(toMap());
        return modelMapper;
    }
	
	private static PropertyMap<DiluicaoConfiguracaoEntity, ConfiguracaoItemDto> toMap() {
        return new PropertyMap<DiluicaoConfiguracaoEntity, ConfiguracaoItemDto>() {
            @Override
            protected void configure() {
                map(source.getCompId().getViaAdministracao().getNome()).setViaAdministracao(null);
            }
        };
    }
}
