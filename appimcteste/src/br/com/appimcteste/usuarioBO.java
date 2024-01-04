package br.com.appimcteste;

public class usuarioBO {
	// Atributos
	private double altura;
	private double peso;
	private double imc;
	
	// Metodos
	public double calcularIMC() {

		this.imc = this.peso / this.altura * this.altura;
		
		return this.imc;
	}
	
	public String calcularSituacao() {
		if(this.imc<18.5) {
			return "abaixo do peso";
		}
		else if(this.imc<24.9) {
			return "peso normal";
		}
		else if(this.imc<29.9) {
			return "excesso de peso";
		}
		else if(this.imc>30) {
			return "obesidade";
		}
		else if(this.imc>35) {
			return "obesidade extrema";
		}else {
			return "Obesidade mórbida";
		}
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}



}
