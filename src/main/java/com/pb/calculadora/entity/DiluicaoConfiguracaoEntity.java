package com.pb.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import javax.persistence.*;

import com.pb.calculadora.entity.enums.EnumDiluente;

@Entity
@Data
@NoArgsConstructor
@Table(name = "diluicao_configuracao")
public class DiluicaoConfiguracaoEntity {

    @EmbeddedId
	@EqualsAndHashCode.Include
	private DiluicaoConfiguracaoEntityPK compId;

    @Column(name = "quantidade_aspirada", nullable = true)
    private BigDecimal quantidadeAspirada;

    @Column(name = "quantidade_adicionada")
    private BigDecimal quantidadeAdicionada;

    @Column(name = "concentracao")
    private BigDecimal concentracao;

    @Column(name = "diluente")
    @Enumerated(EnumType.STRING)
    private EnumDiluente diluente;

    @Column(name = "modo_preparo", nullable = true)
    private String modoPreparo;

}
