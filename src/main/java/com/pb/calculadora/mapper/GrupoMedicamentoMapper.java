package com.pb.calculadora.mapper;

import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.entity.GrupoMedicamentoEntity;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class GrupoMedicamentoMapper {
    private GrupoMedicamentoMapper() {
		
	}
	
	public static ModelMapper map(ModelMapper modelMapper) {
		modelMapper.addMappings(toMap());
        return modelMapper;
    }
	
	private static PropertyMap<GrupoMedicamentoEntity, GrupoMedicamentoDto> toMap() {
        return new PropertyMap<GrupoMedicamentoEntity, GrupoMedicamentoDto>() {
            @Override
            protected void configure() {
                map(source.getId()).setIdentificador(null);
            }
        };
    }
}
