package com.objetos;

public class Pessoa {
	//atributos
	public String nome;
	public String email;
	public String profissao;
	public int idade;
	
	//Métodos
	public void apresentar() {
		System.out.println("Olá, eu sou " + this.nome + ".");
		System.out.println("Tenho " + this.idade + "anos");
		System.out.println("profissão: " + this.profissao + " e meu email é: " + this.email + ".");
	}
	
}