package com.pb.calculadora.service;

import java.util.List;

import com.pb.calculadora.dto.ConfiguracaoDto;
import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.entity.MedicamentoEntity;


public interface MedicamentoService {

    List<GrupoMedicamentoDto> grupoMedicamentos();

    List<MedicamentoEntity> medicamentos();

    Select2Dto select2(String term);

    ConfiguracaoDto configuracao(Long medicamentoId);

}
