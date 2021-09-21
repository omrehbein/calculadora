package com.pb.calculadora.controller;

import com.pb.calculadora.dto.CalculoDto;
import com.pb.calculadora.dto.CalculoResultadoDto;
import com.pb.calculadora.dto.ConfiguracaoDto;
import com.pb.calculadora.dto.ConfiguracaoItemDto;
import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.service.CalculoService;
import com.pb.calculadora.service.MedicamentoService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Medicamento")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;
    private final CalculoService calculoService;

    public MedicamentoController(
        MedicamentoService medicamentoService,
        CalculoService calculoService) {
        this.medicamentoService = medicamentoService;
        this.calculoService = calculoService;
    }

    @Operation(summary = "medicamentos")
    @GetMapping(path="/select2")
    public ResponseEntity<Select2Dto> select2(@RequestParam String term) {
        return ResponseEntity.ok(this.medicamentoService.select2(term));
    }

    @PostMapping(path="{id}/calcular")
	public @ResponseBody CalculoResultadoDto updateGrupoMedicamento (@PathVariable Long id, @RequestBody CalculoDto calculoDto) {
		return this.calculoService.calcular(id, calculoDto); 
	}

    @Operation(summary = "configuracao")
    @GetMapping(path="{id}/configuracao")
    public ResponseEntity<ConfiguracaoDto> configuracao(@PathVariable Long id) {
        return ResponseEntity.ok(this.medicamentoService.configuracao(id));
    }

}
