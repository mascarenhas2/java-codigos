package com.example;

public class Main {
    public static void main(String[] args) {
        
     Endereco enderecos = new Endereco("Rua Souto Dalva", "78", "Ao lado do ginasio", "40301065","Salvador",UnidadeFederativa.BAHIA);
     Pessoa pessoas = new Pessoa(85761, "Caio", 20, "71991315143", "caiovin56@gmail.com", Sexo.MASCULINO, enderecos);

    System.out.println("Dados do colaborador: ");
    System.out.println("ID: " + pessoas.getId());
    System.out.println("Nome:" + pessoas.getNome());
    System.out.println("Idade: "+ pessoas.getIdade());
    System.out.println("Telefone: " + pessoas.getTelefone());
    System.out.println("Email: "+ pessoas.getEmail());
    System.out.println("Sexo: " + pessoas.getSexo());
    System.out.println("Endereco: " + pessoas.getEndereco());
    

    }
}