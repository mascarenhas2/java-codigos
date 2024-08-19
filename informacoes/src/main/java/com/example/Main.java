package com.example;

public abstract class Main {
    public static void main(String[] args) {
       
       Fisica fisica = new Fisica(4242424, "Caio", "2124324324", new Endereco("Rua Souto Dalva", "78", "n/a", "2421342314", "Salvador", UnidadeFederativa.BAHIA),Sexo.MASCULINO, "84444242", "11/06/2004","24242425",5000);
       Juridica juridica = new Juridica(334343, "Os imbativeis", "345522", "", null, null, null, null, 0);

       System.out.println(fisica);
       System.out.println(juridica);
    }
}