package com.metodos;

public class TiposDeMetodos {
	
	// Atributos
	public String texto;
	public int numInt;
	public double numDouble;
	
	// Métodos
	public String texto(String texto) {
		this.texto = texto;
		
		return this.texto;
	}
	
	public int numInt(int num) {
		this.numInt = num;
		
		return this.numInt;
	}
	
	public double numDecimal(double num) {
		this.numDouble = num;
		return numDouble;
	}

}
