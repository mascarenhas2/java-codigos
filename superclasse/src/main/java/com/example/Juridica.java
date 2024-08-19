package com.example;

 class Juridica extends Pessoa {

    private String cnpj;
    private String inscricaoEstadual;
    

    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
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
        return "\nDados da Pessoa juridica " +
        "\nNome: " + super.nome +
        "\n Telefone: " + super.telefone + 
        "\n CNPJ: " + cnpj +
        "\n Inscrição Estadual: " + inscricaoEstadual +"" ;
    }

    

}
