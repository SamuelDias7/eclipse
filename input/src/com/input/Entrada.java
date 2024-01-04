package com.input;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração de variáveis
		String nome;
		int idade;
		
		//instanciando objeto de leitura de dados
		Scanner leia = new Scanner(System.in);
		
		//algoritimo
		System.out.println("informe o seu nome:");
		nome = leia.nextLine();
		System.out.println("informe a sua idade:");
		idade = leia.nextInt();
		
		if (idade>=18) {
			System.out.println(nome +" é maior de idade");
		}
		else {
			System.out.println(nome +" é menor de idade");
		}
		
		leia.close();
		
		
		
		
		

	}

}
