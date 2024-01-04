package com.regras2;

public class Conta implements ContaInteface {
	// Atributos 
	private String numeroTitular;
	private String numeroConta;
	private String numeroAgencia;
	private double saldo;
	

	public Conta(String numeroConta,String numeroAgencia, double saldo) {
		// TODO Auto-generated constructor stub
		this.numeroConta = numeroConta;
		this.numeroAgencia = numeroAgencia;
		this.saldo = saldo;
	}

	public String getNumeroTitular() {
		return numeroTitular;
	}

	public void setNumeroTitular(String numeroTitular) {
		this.numeroTitular = numeroTitular;
	}

	@Override
	public String consultarDados() {
		// TODO Auto-generated method stub
		return "Titular:" + this.numeroTitular + "\nAgência:" + this.numeroAgencia + "\nConta:" + this.numeroConta;
	}

	@Override
	public double conseultarSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	@Override
	public void depositarValor(double valor) {
		// TODO Auto-generated method stub
		this.saldo = saldo + valor;

	}

	@Override
	public double sacarValor(double valor) {
		// TODO Auto-generated method stub
		if(this.saldo>valor)
		this.saldo = saldo - valor;
		return this.saldo;
	}



}
