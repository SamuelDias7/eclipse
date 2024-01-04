package com.AppImc;

public class Pessoa {
	// Atributos
	public double altura;
	public double peso;
	public double Imc;
	
	// Metodos
	public double Imc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
		
		this.Imc = this.peso / (altura * altura);
		
		return this.Imc;
	}
	// Retorna a saúde do usuario
	public String saude() {
		if(this.Imc<18.5)
		return "Baixo Peso";
		else if(this.Imc<24.9)
			return "Peso normal";
		else if(this.Imc<29.9)
			return "Peso normal";
		else if(this.Imc>30)
			return "Obesidade";
		else if(this.Imc>35)
			return "Obesidade extrema";
		else
			return "Obesidade Mórbida";
	}

}
