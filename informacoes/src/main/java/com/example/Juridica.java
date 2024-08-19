package com.example;

 class Juridica extends Pessoa {
    String cnpj;
    String inscricaoEstadual;
    String dataInicio;
    String dataTermino;
    double valorContrato;
    public Juridica(int id, String nome, String telefone, Endereco endereco, String cnpj, String inscricaoEstadual,
            String dataInicio, String dataTermino, double valorContrato) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    public String getDataTermino() {
        return dataTermino;
    }
    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }
    public double getValorContrato() {
        return valorContrato;
    }
    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
    @Override
    public String toString() {
        return "\n Dados da Pessoa juridica =  " + 
        "\n cnpj= " + cnpj + 
        "\n inscricaoEstadual= " + inscricaoEstadual + 
        "\n DataInicio= " + dataInicio + 
        "\n DataTermino= " + dataTermino + 
        "\n valorContrato= " + valorContrato + "";
    
    }
     

}
