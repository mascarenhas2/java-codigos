package com.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Souto Dalva", 78, "40301065", "Bahia", "Salvador");
        Cliente clientes = new Cliente("23344", "Caio", "71991315143", "85775229541",Sexo.MASCULINO, endereco);
    
        System.out.println("Id: "+ clientes.getId());
        System.out.println("Nome: "+ clientes.getNome());
        System.out.println("Telefone: " + clientes.getTelefone());
        System.out.println("Cpf: "+ clientes.getCpf());
        System.out.println("Sexo: " + clientes.getSexo());
        System.out.println("Endereco: " + clientes.getEndereco());
    }
}