package com.example;

 class Engenheiro extends Funcionario {

   private String crea;

    public Engenheiro(String nome, String cpf, String rg, double salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n Dados do engenheiro: " + 
        super.toString() +
        "\n crea=" + crea;
       
    }
    
    
}
