package com.pb.calculadora.service;

import java.util.List;

import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.entity.MedicamentoEntity;


public interface MedicamentoService {

    List<GrupoMedicamentoDto> grupoMedicamentos();

    List<MedicamentoEntity> medicamentos();

}
