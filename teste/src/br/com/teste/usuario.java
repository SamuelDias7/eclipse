package br.com.teste;

public class usuario {
	
	// Atributos
	private String nome;
	private int idade;
	private int carros;
	private int menos;

	// Metodos
	public int Subtrair() {
		return this.carros - this.menos;
	}
	
	// Calcula a quantodade de carros em um estacionamento
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCarros() {
		return carros;
	}
	public void setCarros(int carros) {
		this.carros = carros;
	}

}
