package com.construtor;

public class Pessoa {
	//Atributos
	public int idPessoa;
	public String nome;
	public String genero;
	public String nacionalidade;
	public String profissão;

	public Pessoa(int idPessoa, String genero, String nacionalidade) {
		// TODO Auto-generated constructor stub
		
		//Atribuindo os valores das variáveis aos atributos
		this.idPessoa = idPessoa;
		this.genero = genero;
		this.nacionalidade = nacionalidade;
		}
	
	//Métodos
	public void comprimentar() {
		System.out.println("Olá meu nome é: " + this.nome + " e estes são os meus dados.");
	}
			
		
	

}
