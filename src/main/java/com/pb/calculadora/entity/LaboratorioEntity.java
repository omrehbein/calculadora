package com.pb.calculadora.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@Table(name = "laboratorio")
public class LaboratorioEntity {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    @Column(name = "nome")
    private String nome;

}
