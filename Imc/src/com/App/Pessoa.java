package com.App;

public class Pessoa {
	//Atributos
	public double altura;
	public double peso;
	public double Imc;
	
	// Métodos
	public double calcularPeso(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		
		this.Imc = peso / (altura * altura);
		
		return this.Imc;
	}
	public String retornarImc() {
		
		if(this.Imc<18.5)
		return "Você está abaxo do peso";
		else if(this.Imc<25)
			return "Você está no peso ideal";
		else if(this.Imc<30)
			return "Você está com excesso de peso";
		else if(this.Imc>30)
			return "Você está com obesidade";
		else if(this.Imc>30)
			return "Você está com obesidade extrema";
		else
			return "Você está com obesidade mórbida";
	}

}