package com.example;

public abstract class Main {
    public static void main(String[] args) {
       
       Fisica fisica = new Fisica(4242424, "Caio", "2124324324", new Endereco("Rua Souto Dalva", "78", "n/a", "2421342314", "Salvador", UnidadeFederativa.BAHIA),Sexo.MASCULINO, "84444242", "11/06/2004","24242425",5000);
       Juridica juridica = new Juridica(23432432, "Lojas % cia", "231432423423", new Endereco("Rua Carlinhos", "78", "n/a", "40301065", "Salvador", 
       UnidadeFederativa.BAHIA), "3242323532", "3242352323", "1211/232/42", "121421412/55252", 23243);
       

       System.out.println(fisica);
       System.out.println(juridica);
    }
}