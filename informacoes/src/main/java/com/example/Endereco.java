package com.example;

class Endereco extends Pessoa {

      String logradouro;
      String numero;
      String complemento;
      String cep;
      String cidade;
      UnidadeFederativa uf;
    public Endereco(int id, String nome, String telefone, Endereco endereco, String logradouro, String numero,
            String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(id, nome, telefone, endereco);
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public UnidadeFederativa getUf() {
        return uf;
    }
    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    @Override
    public String toString() {
        return " Endereco: " +
        super.toString() +
        "\nlogradouro=" + logradouro + 
        "\n numero=" + numero + 
        "\n complemento=" + complemento + 
        "\n cep=" + cep + 
        "\n cidade=" + cidade + 
        "\n uf=" + uf.getTexto() + uf.getSigla() + "";

    }

      

}
