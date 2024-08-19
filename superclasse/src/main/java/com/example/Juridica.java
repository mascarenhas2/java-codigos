package com.example;

 class Juridica extends Pessoa {

    private String cnpj;
    private String inscricaoEstadual;
    
    public Juridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "\n Juridica [cnpj=" + cnpj + 
        "\n inscricaoEstadual=" + inscricaoEstadual +"" ;
    }

    

}
