package com.polimorfismo;

public final class PessoaFisica extends Pessoa {
	// Atributos
	public String nome;
	public String genero;
	public String nacionalidade;
	

	public PessoaFisica(int IdPessoa,String genero,String nacionalidade) {
		super(IdPessoa);
		// TODO Auto-generated constructor stub
		this.genero = genero;
		this.nacionalidade = nacionalidade;
	}
	
	public String apresentar() {
		return "Ola meu nome é " +  this.nome + "," + this.genero + "," + this.nacionalidade + "," + super.apresentar();
	}

}
