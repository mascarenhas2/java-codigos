package com.example;

public class Endereco {
     private String rua;
     private double numero;
     private String cep;
     private String estado;
     private String Cidade;
     
    public Endereco(String rua, double numero, String cep, String estado, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
        Cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public double getNumero() {
        return numero;
    }
    public String getCep() {
        return cep;
    }
    public String getEstado() {
        return estado;
    }
    public String getCidade() {
        return Cidade;
    }

}
