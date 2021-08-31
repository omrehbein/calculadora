package com.pb.calculadora.repository;

import com.pb.calculadora.entity.LaboratorioEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratorioRepository extends JpaRepository<LaboratorioEntity, Long> {
}
