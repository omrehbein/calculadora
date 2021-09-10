package com.pb.calculadora.dto;

import java.util.List;

public class CalculoResultadoDto {

    private String infoAdministracao;
    private List<String> passosAdministracao;
    private List<String> infoList;
    
    public String getInfoAdministracao() {
        return infoAdministracao;
    }
    public void setInfoAdministracao(String infoAdministracao) {
        this.infoAdministracao = infoAdministracao;
    }
    public List<String> getPassosAdministracao() {
        return passosAdministracao;
    }
    public void setPassosAdministracao(List<String> passosAdministracao) {
        this.passosAdministracao = passosAdministracao;
    }
    public List<String> getInfoList() {
        return infoList;
    }
    public void setInfoList(List<String> infoList) {
        this.infoList = infoList;
    }
    
    
    
}
