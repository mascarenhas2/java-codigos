package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = dados.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = dados.nextDouble();

        double media = (primeiraNota + segundaNota)/2;

        System.out.println("Media: " + media);

        if (media >=7){
            System.out.println("Aprovado");

       } else if (media >=5){
            System.out.println("Verificação Suplimentar");
        } else {
            System.out.println("Reprovado!");
        }   
    }
 }

    

