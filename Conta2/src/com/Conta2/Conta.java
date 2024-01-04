package com.Conta2;

public abstract class Conta {
	// Atributos
	private String Nome;
	private String sexo;
	private String Nacionalidade;

	public Conta(String nome,String sexo, String Nacionalidade) {
		// TODO Auto-generated constructor stub
		this.Nome = Nome;
		this.sexo = sexo;
		this.Nacionalidade = Nacionalidade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

}
