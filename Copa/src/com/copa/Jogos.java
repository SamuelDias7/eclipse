package com.copa;

public class Jogos {
	// Atributos
	public int Brasil;
	public int Servia;
	public int Suica;
	
	// Métodos
	public String resultados(int Brasil,int Servia,int Suica) {
		this.Brasil = Brasil;
		this.Servia = Servia;
		this.Suica = Suica;
		
		if(Brasil == 2)
			return "Teste";
		else
			return null;
	}

}
