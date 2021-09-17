package com.pb.calculadora.repository;

import java.util.List;

import com.pb.calculadora.entity.ViaAdministracaoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ViaAdministracaoRepository extends JpaRepository<ViaAdministracaoEntity, Long> {
    List<ViaAdministracaoEntity> findAllByNomeContainingIgnoreCaseOrderById(String nome);
}
