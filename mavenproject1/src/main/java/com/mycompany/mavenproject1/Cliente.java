package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno.den
 */
 class Cliente extends Fisica{
 
     String protocoloAtendimento;

    public Cliente(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "protocoloAtendimento=" + protocoloAtendimento + '}';
    }
     
}
