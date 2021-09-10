package com.pb.calculadora.entity.enums;

public enum EnumUnidadeMedida {
    MILILITRO("ml", "Mililitro"),
    MILIGRAMA("mg", "Miligrama");

    private final String sigla;
    private final String nome;

    EnumUnidadeMedida(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
}
