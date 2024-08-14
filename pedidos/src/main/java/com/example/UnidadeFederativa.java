package com.example;

public enum UnidadeFederativa {
    SALVADOR("Salvador, Bahia","BA"),
    GUARULHOS("Guarulhos, São Paulo","SP");

    String texto;
    String sigla;
    private UnidadeFederativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }
    public String getTexto() {
        return texto;
    }
    public String getSigla() {
        return sigla;
    }

}
