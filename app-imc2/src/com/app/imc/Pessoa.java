package com.app.imc;

public class Pessoa {
	// Atributos
	public Double atual;
	public double passado;
	public Double resultado;
	
	// Métodos
	public Double calcularPeso(Double altura,Double peso) {
		this.atual = altura;
		this.passado = peso;
		
		this.resultado = altura - peso;
		
		return this.resultado;
	}
	
}

