package com.example;

 class Funcionario extends Main {

  protected String nome;
  protected String cpf;
  protected String rg;
  protected double salario;
  
public Funcionario(String nome, String cpf, String rg, double salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.rg = rg;
    this.salario = salario;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}
public String getRg() {
    return rg;
}
public void setRg(String rg) {
    this.rg = rg;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}
@Override
public String toString() {
    return "Funcionario " +
    "\nnome=" + nome + 
    "\n cpf=" + cpf + 
    "\n rg=" + rg + 
    "\n salario=" + salario + "";
}
  


}
