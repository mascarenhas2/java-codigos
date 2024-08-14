package com.example;

public class Resumo {
      private String rua;
      private String numero;
      private String complemento;
      private String cep;
      UnidadeFederativa uf;
      Prato prato;
      Bebidas bebida;

    public Resumo(String rua, String numero, String complemento, String cep, UnidadeFederativa uf, Prato prato, Bebidas bebida) {
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.uf = uf;
        this.prato = prato;
        this.bebida = bebida;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public UnidadeFederativa getUf() {
        return uf;
    }
    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    public Prato getPrato() {
        return prato;
    }
    public void setPrato(Prato prato) {
        this.prato = prato;
    }
    public Bebidas getBebida() {
        return bebida;
    }
    public void setBebida(Bebidas bebida) {
        this.bebida = bebida;
    }
    @Override
    public String toString() {
        return "Resumo rua=" + rua + 
        "\n numero=" + numero + 
        "\n complemento=" + complemento + 
        "\n cep=" + cep + 
        "\n uf=" + uf + 
        "\n prato=" + prato + 
        "\n bebida=" + bebida + 
        "]";
    }


    
}
