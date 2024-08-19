package com.example;

public abstract class Pessoa {
    public static void main(String[] args) {
        
    Fisica fisica = new Fisica("85775229541","162323332", "11/06/2004");
    Juridica juridica = new Juridica("344355366235", "40028922");

    System.out.println("Pessoa Fisica: ");
    System.out.println("Cpf:"+ fisica.getCpf());
    System.out.println("Rg: " + fisica.getRg());
    System.out.println("Data de nascimento: " + fisica.getDataNascimento());
    System.out.println("Pessoa Juridica: ");
    System.out.println("Cnpj: " + juridica.getCnpj());
    System.out.println("Inscrição Estaudal: " + juridica.getInscricaoEstadual());
    

  
    }
}