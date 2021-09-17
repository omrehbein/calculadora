package com.pb.calculadora.controller;

import com.pb.calculadora.dto.Select2Dto;
import com.pb.calculadora.service.CalculoService;
import com.pb.calculadora.service.ViaAdministracaoService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ViaAdministracao")
public class ViaAdministracaoController {

    private final ViaAdministracaoService viaAdministracaoService;

    public ViaAdministracaoController(ViaAdministracaoService viaAdministracaoService) {
        this.viaAdministracaoService = viaAdministracaoService;
    }

    @Operation(summary = "viaAdministracaos")
    @GetMapping(path="/select2")
    public ResponseEntity<Select2Dto> select2(@RequestParam String term) {
        return ResponseEntity.ok(this.viaAdministracaoService.select2(term));
    }

}
