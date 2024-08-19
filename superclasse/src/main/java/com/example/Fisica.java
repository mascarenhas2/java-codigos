package com.example;

 class Fisica extends Pessoa {

    private String cpf;
    private String rg;
    private String dataNascimento;
    
    public Fisica(String cpf, String rg, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Fisica \n cpf=" + cpf + 
         "\n rg=" + rg + 
          "\n dataNascimento=" + dataNascimento + "";
    }
    

}
