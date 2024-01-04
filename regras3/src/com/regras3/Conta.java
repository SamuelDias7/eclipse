package com.regras3;

public class Conta implements ContaInterface {
	// Atributos
	private String numerotitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	
	// Metodo construtor
	public Conta(String numeroConta, String numeroAgencia, double valor) {
		// TODO Auto-generated constructor stub
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
	}

	@Override
	public String consultarDados() {
		// TODO Auto-generated method stub
		return "Numero da conta:" + this.numeroConta + "\nAgência:" + this.numeroAgencia + "\nvalor:" + this.saldo;
	}

	@Override
	public double consultarsaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	@Override
	public void depositarValor(double valor) {
		// TODO Auto-generated method stub
		this.saldo = this.saldo + valor;
	}

	@Override
	public double sacarValor(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo> valor)
			this.saldo = this.saldo - valor;
		return 0;
	}

	public String getNumerotitular() {
		return numerotitular;
	}

	public void setNumerotitular(String numerotitular) {
		this.numerotitular = numerotitular;
	}

}
