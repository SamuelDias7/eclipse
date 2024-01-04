package com.calculadora;

//importação de classe Scanner para entrada de dados //importação de  Scanclassener para entrada de dados

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando entrada de objeto de dados
		Scanner leia = new Scanner(System.in);
		
		//declaração de variáveis
		int x, y;
		double result;
		String operador;
		
		//do...while
		do {
		
		//variaveis
		System.out.println("informe o primeiro número:");
		x = leia.nextInt();
		System.out.println("informe o segundo némero:");
		y = leia.nextInt();
		
		//limpeza de buffer
		leia.nextLine();
		
		System.out.println("escolha a operação a ser feita:");
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		System.out.println("5 - sair");
		operador = leia.nextLine();
		
		switch (operador) {
		    case "1":
				result = x + y;
		System.out.println("o resultado da soma é:" + result + ".");
		break;
		    case "2":
		result = x - y;
		System.out.println("o resultado é:" + result + ".");
		break;
		case "3":
			result = x * y;
			System.out.println("o resultado da multiplicação é:" + result + ".");
			break;
		case "4":
			result = x / y;
			System.out.println("o resultado da multiplicação é:" + result + ".");
			break;
			default:
				System.out.println("operação inválida");
			case "5":
				System.out.println("adeus");
				break;
				
		   }
		} while (operador != "5");
		
		//encerra o objeto leia
		leia.close();
		
		
		
		
		
	}

}