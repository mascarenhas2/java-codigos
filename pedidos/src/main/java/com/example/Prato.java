package com.example;

public enum Prato {
     HAMBURGUER("Hamburguer"),
     LASANHA("Lasanha"),
     PIZZA("Pizza");

   String texto;

private Prato(String texto) {
    this.texto = texto;
}

public String getTexto() {
    return texto;
}


}
