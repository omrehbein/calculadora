package com.pb.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.persistence.EnumType;

import com.pb.calculadora.entity.enums.EnumEmbalagemApresentada;
import com.pb.calculadora.entity.enums.EnumUnidadeMedida;

@Entity
@Data
@NoArgsConstructor
@Table(name = "medicamento")
public class MedicamentoEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long id;

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

    @Column(name = "quantidade_apresentacao", nullable = false)
    private BigDecimal quantidadeApresentacao;
    
    @Column(name = "concentracao_inicial")
    private BigDecimal concentracaoInicial;

    @Column(name = "embalagem_apresentada", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumEmbalagemApresentada embalagemApresentada;

    @Column(name = "unidade_medida", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumUnidadeMedida unidadeMedida;
    


    @Column(name = "info_sobra")
    private String infoSobra;

    @Column(name = "info_observacao")
    private String infoObservacao;

    @Column(name = "info_tempo_administracao")
    private String infoTempoAdministracao;
}
