package com.subtracao;

public class valores {
	// atributos
	public int valor1;
	public int valor2;
	public int resultado1;
	
	// Metodos
	public int resultado(int valor1,int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		
		this.resultado1 = this.valor1 - this.valor2;
		
		return this.resultado1;
	}

}
