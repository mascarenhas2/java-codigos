package com.example;

class Pessoa extends Main{

     protected String nome;
     protected String telefone;

public Pessoa(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}
@Override
public String toString() {
    return "Dados \n nome=" + nome + 
     "\n telefone=" + telefone + "";
}

   

}
