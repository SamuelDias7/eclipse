package com.construtor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa homem = new Pessoa(10001, "Masculino", "Brasileiro");
		Pessoa mulher = new Pessoa(10002, "Feminino", "Brasileira");
		
		//Informe os dados do homem
		System.out.println("Informe o nome do homem:");
		homem.nome = leia.nextLine();
		System.out.println("Informe a sua profissão do homem:");
		homem.profissão = leia.nextLine();
		
		//Informe os dados da mulher
		System.out.println("Informe o nome da mulher:");
		mulher.nome = leia.nextLine();
		System.out.println("Informe a sua profissão da mulher:");
		mulher.profissão = leia.nextLine();
		
		//Output do homem
		homem.comprimentar();
		System.out.println("Id: " + homem.idPessoa + ".");
		System.out.println("nome: " + homem.nome + ".");
		System.out.println("genero: " + homem.genero + ".");
		System.out.println("nacionalidade: " + homem.nacionalidade + ".");
		System.out.println("profissão: " + homem.profissão + ".");
		
		//Output da mulher
		mulher.comprimentar();
		System.out.println("Id: " + mulher.idPessoa + ".");
		System.out.println("nome: " + mulher.nome + ".");
		System.out.println("genero: " + mulher.genero + ".");
		System.out.println("nacionalidade: " + mulher.nacionalidade + ".");
		System.out.println("profissão: " + mulher.profissão + ".");
		
		//Encerra o objeto leia
		leia.close();
		

	}

}
