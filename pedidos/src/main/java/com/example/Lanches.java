package com.example;

public class Lanches {
     private String lasanha;
     private String bife_acebolado;
     private String escondidinho;
     private String caruru;
    
     public Lanches(String lasanha, String bife_acebolado, String escondidinho, String caruru) {
        this.lasanha = lasanha;
        this.bife_acebolado = bife_acebolado;
        this.escondidinho = escondidinho;
        this.caruru = caruru;
    }

    public String getLasanha() {
        return lasanha;
    }

    public void setLasanha(String lasanha) {
        this.lasanha = lasanha;
    }

    public String getBife_acebolado() {
        return bife_acebolado;
    }

    public void setBife_acebolado(String bife_acebolado) {
        this.bife_acebolado = bife_acebolado;
    }

    public String getEscondidinho() {
        return escondidinho;
    }

    public void setEscondidinho(String escondidinho) {
        this.escondidinho = escondidinho;
    }

    public String getCaruru() {
        return caruru;
    }

    public void setCaruru(String caruru) {
        this.caruru = caruru;
    }

    


}
