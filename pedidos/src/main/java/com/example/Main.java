package com.example;

public class Main {
    public static void main(String[] args) {
          
          Resumo resumo = new Resumo("Rua Souto Dalva ", "78", "Ginasio de esportes", "40301065", UnidadeFederativa.SALVADOR,Prato.HAMBURGUER,Bebidas.GUARANA);
        
         System.out.println("Nome: " + resumo.getRua());
         System.out.println("Numero: " + resumo.getNumero());
         System.out.println("Complemento: " + resumo.getComplemento());
         System.out.println("Cep: " + resumo.getCep());
         System.out.println("Cidade: " + resumo.getUf());
         System.out.println("Prato: " + resumo.getPrato());
         System.out.println("Bebida: " + resumo.getBebida());
         
          
    }
}