package com.pb.calculadora.entity.enums;

public enum EnumDiluente {
    AD("AD", "Agua Destilada"),
    SF("SF", "Soro Fisiologico"),
    SG("SG", "Soro Glicose");

    private final String sigla;
    private final String nome;

    EnumDiluente(String sigla, String nome) {
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
