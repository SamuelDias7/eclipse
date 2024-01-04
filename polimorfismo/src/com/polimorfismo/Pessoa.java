package com.polimorfismo;

public abstract class Pessoa {
	// Atributos
	public int idPessoa;
	public String email;

	public Pessoa(int IdPessoa) {
		// TODO Auto-generated constructor stub
		this.idPessoa = idPessoa;
	}
	public String apresentar() {
		return "Meu e-mail é:" + this.email + " e meu Id é:" + this.idPessoa + ".";
	}

}
