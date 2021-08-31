package com.pb.calculadora.controller;

import com.pb.calculadora.dto.GrupoMedicamentoDto;
import com.pb.calculadora.entity.GrupoMedicamentoEntity;
import com.pb.calculadora.service.MedicamentoService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/GrupoMedicamento")
public class GrupoMedicamentoController {

    private final MedicamentoService medicamentoService;

    public GrupoMedicamentoController(MedicamentoService medicamentoService) {
        this.medicamentoService = medicamentoService;
    }

    @Operation(summary = "grupoMedicamentos")
    @GetMapping(path="/listar")
    public ResponseEntity<List<GrupoMedicamentoDto>> grupoMedicamentos() {
        List<GrupoMedicamentoDto> result = this.medicamentoService.grupoMedicamentos();
        return ResponseEntity.ok(result);
    }

    @PostMapping(path="/criar")
	public @ResponseBody GrupoMedicamentoEntity createGrupoMedicamento (@RequestParam String descricao) {
		return null;//modelMapper.map(this.agendaService.createAgenda(descricao), AgendaDto.class); 
	}

    @PutMapping(path="{grupoMedicamentId}/atualizar")
	public @ResponseBody GrupoMedicamentoEntity updateGrupoMedicamento (@PathVariable int grupoMedicamentId, @RequestParam GrupoMedicamentoEntity grupoMedicamento) {
		return null;//modelMapper.map(this.agendaService.createAgenda(descricao), AgendaDto.class); 
	}

}
