package com.example;

 class Fisica extends Pessoa {

    private String cpf;
    private String rg;
    private String dataNascimento;
    
 
    

    public Fisica(String nome, String telefone, String cpf, String rg, String dataNascimento) {
        super(nome, telefone);
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
        return "\n Dados da PessoaFisica " +
        "\n Nome: " + super.nome +
        "\n Telefone " + super.telefone +
        "\n cpf= " + cpf + 
         "\n rg= " + rg + 
        "\n dataNascimento= " + dataNascimento + "";
    }
    

}
