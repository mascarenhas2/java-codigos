package com.example;

public class Main {
    public static void main(String[] args) {
       
        Funcionario funcionarios = new Funcionario("23232324", "Caio", 4000, Setor.MARKETING,Sexo.MASCULINO, 20);

        System.out.println("Dados do funcionário: ");
        System.out.println("ID: "+ funcionarios.getId());
        System.out.println("Nome: "+ funcionarios.getNome());
        System.out.println("Salário"+ funcionarios.getSalario());
        System.out.println("Setor: " + funcionarios.getSetor().getSetores());
        System.out.println("Sexo: " + funcionarios.getSexo().getTexto());
        System.out.println("Idade:" + funcionarios.getIdade());
       
        
    



    }
}