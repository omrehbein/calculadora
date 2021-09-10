package com.pb.calculadora.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.pb.calculadora.dto.CalculoDto;
import com.pb.calculadora.dto.CalculoResultadoDto;
import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.entity.GrupoMedicamentoEntity;
import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.repository.GrupoMedicamentoRepository;
import com.pb.calculadora.repository.MedicamentoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CalculoServiceImpl implements CalculoService {

    private GrupoMedicamentoRepository grupoMedicamentoRepository;
    private MedicamentoRepository medicamentoRepository;
    private ModelMapper modelMapper;
    
    public CalculoServiceImpl(
        GrupoMedicamentoRepository grupoMedicamentoRepository,
        MedicamentoRepository medicamentoRepository,
        ModelMapper modelMapper
    ){
        this.grupoMedicamentoRepository = grupoMedicamentoRepository;
        this.medicamentoRepository = medicamentoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CalculoResultadoDto calcular(int id, CalculoDto calculoDto) {
        CalculoResultadoDto calculoResultadoDto = new CalculoResultadoDto();

        calculoResultadoDto.setQuantidadeAdministrar(new BigDecimal(10.0));

        return calculoResultadoDto;
    }
}
