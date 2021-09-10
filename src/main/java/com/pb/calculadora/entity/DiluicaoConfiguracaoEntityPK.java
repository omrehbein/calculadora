package com.pb.calculadora.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
@Data
public class DiluicaoConfiguracaoEntityPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medicamento_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private MedicamentoEntity medicamento;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "via_administracao_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private ViaAdministracaoEntity viaAdministracao;

    @Column(name="sequencia")	
    private Long sequencia;
}
