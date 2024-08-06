package com.example;

/**
 * Hello world!
 *
 */
public class MetodoString {    
    public static void main( String[] args ) {
    
    String nomeUsuario = "Marta";
    int senha = 123;
    
    boolean resultadoNome = nomeUsuario.equals("Marta");
    boolean resultadoSenha = (senha == 456);

    System.out.println("O nome do usuario esta corrento?" + resultadoNome);
    System.out.println("A senha esta correta?" + resultadoSenha);
    }
}
