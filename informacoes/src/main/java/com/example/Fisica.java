package com.example;

class Fisica extends Pessoa {

     Sexo sexo;
     String cpf;
     String rg;
     String dataNascimento;
     double salario;
    public Fisica(int id, String nome, String telefone, Endereco endereco, Sexo sexo, String cpf, String rg,
            String dataNascimento, double salario) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Pessoa Fisica: " +
         super.toString() +
        "\n sexo=" + sexo + 
        "\n cpf=" + cpf + 
        "\n rg=" + rg + 
        "\n dataNascimento=" + dataNascimento + 
        "\n salario=" + salario + "";
    }
    
     

}
