package com.example;

public enum UnidadeFederativa {

    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de janeiro","RJ");

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
