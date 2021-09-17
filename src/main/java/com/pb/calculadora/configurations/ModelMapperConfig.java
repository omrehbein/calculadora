package com.pb.calculadora.configurations;

import com.pb.calculadora.mapper.GrupoMedicamentoMapper;
import com.pb.calculadora.mapper.MedicamentoMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
	@Bean
	public ModelMapper modelMapperDetailed() {
		ModelMapper modelMapper = new ModelMapper();
	    
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		GrupoMedicamentoMapper.map(modelMapper);
		MedicamentoMapper.map(modelMapper);
		
		return modelMapper;
	}
}

