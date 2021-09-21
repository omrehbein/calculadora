package com.pb.calculadora.dto;

import java.util.List;

public class ConfiguracaoDto {

    private List<ConfiguracaoItemDto> configuracaoItens;

    public List<ConfiguracaoItemDto> getConfiguracaoItens() {
        return configuracaoItens;
    }

    public void setConfiguracaoItens(List<ConfiguracaoItemDto> configuracaoItens) {
        this.configuracaoItens = configuracaoItens;
    }
    
}
