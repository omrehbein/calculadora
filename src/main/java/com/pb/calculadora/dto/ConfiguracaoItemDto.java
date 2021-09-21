package com.pb.calculadora.dto;

import java.math.BigDecimal;

public class ConfiguracaoItemDto {

    private String viaAdministracao;

    private Long sequencia;

    private BigDecimal volumeAspirado;

    private BigDecimal volumeAdicionado;

    private BigDecimal volumeFinal;

    private BigDecimal concentracao;

    private String diluente;

    private String modoPreparo;

    public String getViaAdministracao() {
        return viaAdministracao;
    }

    public void setViaAdministracao(String viaAdministracao) {
        this.viaAdministracao = viaAdministracao;
    }

    public Long getSequencia() {
        return sequencia;
    }

    public void setSequencia(Long sequencia) {
        this.sequencia = sequencia;
    }

    public BigDecimal getVolumeAspirado() {
        return volumeAspirado;
    }

    public void setVolumeAspirado(BigDecimal volumeAspirado) {
        this.volumeAspirado = volumeAspirado;
    }

    public BigDecimal getVolumeAdicionado() {
        return volumeAdicionado;
    }

    public void setVolumeAdicionado(BigDecimal volumeAdicionado) {
        this.volumeAdicionado = volumeAdicionado;
    }

    public BigDecimal getVolumeFinal() {
        return volumeFinal;
    }

    public void setVolumeFinal(BigDecimal volumeFinal) {
        this.volumeFinal = volumeFinal;
    }

    public BigDecimal getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(BigDecimal concentracao) {
        this.concentracao = concentracao;
    }

    public String getDiluente() {
        return diluente;
    }

    public void setDiluente(String diluente) {
        this.diluente = diluente;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }
    

    
}
