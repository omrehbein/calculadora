package com.pb.calculadora.service;

import com.pb.calculadora.dto.CalculoDto;
import com.pb.calculadora.dto.CalculoResultadoDto;

public interface CalculoService {

    CalculoResultadoDto calcular(int id, CalculoDto calculoDto);


}
