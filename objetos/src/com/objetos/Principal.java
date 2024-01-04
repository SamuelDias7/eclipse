package com.objetos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instacia os objetos
		Scanner leia = new Scanner(System.in);
		Pessoa humano = new Pessoa();
		Pessoa humana = new Pessoa();
		
		//algoritimo
		System.out.println("informe o nome do humano: ");
		humano.nome = leia.nextLine();
		System.out.println("informe a idade do humano:" );
		humano.idade = leia.nextInt();
		
		//limpeza de buffer
		leia.nextLine();
		
		System.out.println("informe o email do humano: " );
		humano.email = leia.nextLine();
		System.out.println("informe a profissão do humano: ");
		humano.profissao = leia.nextLine();
		
		System.out.println("informe o nome da humana: ");
		humana.nome = leia.nextLine();
		System.out.println("informe a idade da humana:" );
		humana.idade = leia.nextInt();
		
		//limpeza de buffer
		leia.nextLine();
		
		System.out.println("informe o email da humana: " );
		humana.email = leia.nextLine();
		System.out.println("informe a profissão da humana: ");
		humana.profissao = leia.nextLine();
		
		//Output
		humano.apresentar();
		humana.apresentar();
		
		//Matar o objeto leia
		leia.close();
	}

}
