package com.pb.calculadora.controller;

import com.pb.calculadora.entity.MedicamentoEntity;
import com.pb.calculadora.service.MedicamentoService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Medicamento")
public class MedicamentoController {

    private final MedicamentoService medicamentoService;

    public MedicamentoController(MedicamentoService medicamentoService) {
        this.medicamentoService = medicamentoService;
    }

    @Operation(summary = "medicamentos")
    @GetMapping(path="/listar")
    public ResponseEntity<List<MedicamentoEntity>> listar() {
        List<MedicamentoEntity> result = this.medicamentoService.medicamentos();
        return ResponseEntity.ok(result);
    }

    @PostMapping(path="/criar")
	public @ResponseBody MedicamentoEntity createAgenda (@RequestParam String descricao) {
		return null;//modelMapper.map(this.agendaService.createAgenda(descricao), AgendaDto.class); 
	}


}
