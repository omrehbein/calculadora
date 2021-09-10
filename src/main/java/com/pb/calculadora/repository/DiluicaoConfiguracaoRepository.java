package com.pb.calculadora.repository;

import java.util.List;

import com.pb.calculadora.entity.DiluicaoConfiguracaoEntity;
import com.pb.calculadora.entity.DiluicaoConfiguracaoEntityPK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiluicaoConfiguracaoRepository extends JpaRepository<DiluicaoConfiguracaoEntity, DiluicaoConfiguracaoEntityPK> {

    List<DiluicaoConfiguracaoEntity> findAllByMedicamentoIdAndViaAdministracaoIdOrderBySequencia(Long medicamentoId, Long viaAdministracaoId);
}
