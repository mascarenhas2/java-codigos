package com.example;

 public abstract class Main {
    public static void main(String[] args) {
         Engenheiro engenheiro = new Engenheiro("Caio", "85775229541","552424244" , 4000, "NSDD2442");
         Medico medico = new Medico("Carlos costa", "5532563253511", "2352525512", 2000,"24ggdfgdbn");
         Motoboy motoboy = new Motoboy("Caio", "52322124", "242224",2000, "GHNNN2424");

         System.out.println(engenheiro);
         System.out.println(medico);
         System.out.println(motoboy);


    }
}