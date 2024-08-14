package com.example;

public enum Bebidas {
    SUCO("Suco"),
    GUARANA("Guarana"),
    AGUA("Agua");

    String texto;

    private Bebidas(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    

}
