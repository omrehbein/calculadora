package com.pb.calculadora.entity.enums;

public enum EnumEmbalagemApresentada {
    FRASCO("FR", "Frasco"),
    AMPOLA("AM", "Ampola");

    private final String sigla;
    private final String nome;

    EnumEmbalagemApresentada(String sigla, String nome) {
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
