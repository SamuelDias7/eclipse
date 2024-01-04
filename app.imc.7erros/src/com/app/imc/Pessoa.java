package com.app.imc;

public class Pessoa {
	// Atributos
	public double altura;
	public double peso;
	public double imc;
	
	// Métodos
	public Double calcularPeso(double altura, double peso) {
		this.altura = altura;
		this. peso = peso;
		
		// Calcula o IMC
		this.imc = peso / (altura * altura);
		
		return this.imc;
	}
	
	public String retornarImc() {
		if (this.imc < 18.5)		
			return "Você está abaixo do peso.";
		else if (this.imc < 25)
			return "Você está no peso ideal.";
		else if (this.imc < 30)
			return "Você está com excesso de peso.";
		else if (this.imc < 35)
			return "Você está com obesidade.";
		else
			return "Você está com obesidade mórbida.";
	}
}
