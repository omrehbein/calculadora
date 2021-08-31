package com.pb.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@Table(name = "medicamento")
public class MedicamentoEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Column(name = "nome")
    private String nome;

    
    @Column(name = "grupo_medicamento_id", nullable = false, insertable = false, updatable = false)
	private Long grupoMedicamentoId;

    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "grupo_medicamento_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private GrupoMedicamentoEntity grupoMedicamento;

    
    @Column(name = "laboratorio_id", nullable = false, insertable = false, updatable = false)
	private Long laboratorioId;

    @ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "laboratorio_id", referencedColumnName = "id", nullable = false, insertable = true, updatable = true)
	private LaboratorioEntity laboratorio;
    

}
