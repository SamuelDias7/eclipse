package com.heranca2;

public final class PessoaJuridica extends Pessoa {
	// Atributos
	public String razaoSocial;
	public String nomeFantasia;
	public String CNPJ;
	
	public String apresentar() {
		return "Ola, segue abaixo os dados da empresa:";
	}

}
