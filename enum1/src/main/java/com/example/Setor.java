package com.example;

public enum Setor {

    FINANCEIRO("Financeiro"),
    RH("Rh"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    String setores;

    private Setor(String setores) {
        this.setores = setores;
    }

    public String getSetores() {
        return setores;
    }
    
}
