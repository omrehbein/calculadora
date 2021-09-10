package com.pb.calculadora.dto;

import java.math.BigDecimal;

public class CalculoDto {
    private BigDecimal quantidadeAdministrar;
    private Long viaAdministracaoId;
    
    public BigDecimal getQuantidadeAdministrar() {
        return quantidadeAdministrar;
    }
    public void setQuantidadeAdministrar(BigDecimal quantidadeAdministrar) {
        this.quantidadeAdministrar = quantidadeAdministrar;
    }
    public Long getViaAdministracaoId() {
        return viaAdministracaoId;
    }
    public void setViaAdministracaoId(Long viaAdministracaoId) {
        this.viaAdministracaoId = viaAdministracaoId;
    }
    
}
