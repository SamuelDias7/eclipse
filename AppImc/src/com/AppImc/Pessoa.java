package com.AppImc;

public class Pessoa {
	// Atributos
	public double altura;
	public double peso;
	public double Imc;
	
	// Metodos
	public double calcularImc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		
		this.Imc = peso / (altura * altura);
		
		return this.Imc;
	}
	public String situação() {
		
		if(this.Imc<18.5)
		return "Você está abaixo do peso";
		else if(this.Imc<25)
			return "Você está no peso ideal";
		else if(this.Imc<30)
			return "Você está com excesso de gordura";
		else if (this.Imc>30)
			return "Você está com obesidade";
		else if(this.Imc>35)
			return "Você está com excesso de obesidade";
		else 
			return "Você está com obesidade mórbida";
	}

}
