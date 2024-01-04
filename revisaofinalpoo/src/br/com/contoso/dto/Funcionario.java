package br.com.contoso.dto;

public abstract class Funcionario {
	
	private String nome;
	private String cargo;
	private int idade;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cargo, int idade) {
		this.nome = nome.toUpperCase();
		this.cargo = cargo;
		this.idade = idade;
	}
	
	public Funcionario(String nome, String cargo) {
		this.nome = nome.toUpperCase();
		this.cargo = cargo;
	}
	
	public Funcionario(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void verificarEntradaFunc();

}
