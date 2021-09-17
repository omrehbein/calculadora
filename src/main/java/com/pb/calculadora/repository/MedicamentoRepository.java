package com.pb.calculadora.repository;

import java.util.List;

import com.pb.calculadora.entity.MedicamentoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity, Long> {
    List<MedicamentoEntity> findAllByNomeContainingIgnoreCaseOrderById(String nome);
}
