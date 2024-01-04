package com.heranca;

public final class PessoaJuridica extends Pessoa {
	public String razaoSocial;
	public String nomeFantasia;
	public String cnpj;
	
	// Método
	public String apresentar() {
		return "Olá, segue abaixo os dados da empresa:";
	}

}
