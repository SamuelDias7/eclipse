package com.Conta;

public abstract class Conta {
	// Atributos
	private String Númerodaagência;
	private String Númerodaconta;
	private String Tipodeconta;
	private String Saldodaconta;

	public Conta(String Númerodaagência, String Númerodaconta, String Tipodeconta, String Saldodaconta) {
		// TODO Auto-generated constructor stub
		this.Númerodaagência = Númerodaagência;
		this.Númerodaconta = Númerodaconta;
		this.Tipodeconta = Tipodeconta;
		this.Saldodaconta = Saldodaconta;
		
	}

	public String getNúmerodaagência() {
		return Númerodaagência;
	}

	public void setNúmerodaagência(String númerodaagência) {
		Númerodaagência = númerodaagência;
	}

	public String getNúmerodaconta() {
		return Númerodaconta;
	}

	public void setNúmerodaconta(String númerodaconta) {
		Númerodaconta = númerodaconta;
	}

	public String getTipodeconta() {
		return Tipodeconta;
	}

	public void setTipodeconta(String tipodeconta) {
		Tipodeconta = tipodeconta;
	}

	public String getSaldodaconta() {
		return Saldodaconta;
	}

	public void setSaldodaconta(String saldodaconta) {
		Saldodaconta = saldodaconta;
	}

}
