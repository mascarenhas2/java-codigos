package com.example;

public abstract class Main {
    public static void main(String[] args) {
    Fisica fisica = new Fisica("Caio", "812312","85775229541","162323332", "11/06/2004");
    Juridica juridica = new Juridica("Caio","81212421","344355366235", "40028922");

    
    System.out.println(juridica);
    System.out.println(fisica);
  
    }
}