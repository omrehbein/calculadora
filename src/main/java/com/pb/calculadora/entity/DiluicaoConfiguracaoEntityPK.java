package com.pb.calculadora.entity;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
@Data
public class DiluicaoConfiguracaoEntityPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="medicamento_id")
	private Long medicamentoId;

	@Column(name="via_administracao_id")	
    private Long viaAdministracaoId;

    @Column(name="sequencia")	
    private Long sequencia;
}
