package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	
	Scanner leia = new Scanner(System.in);
	
	public void calculo() {
		System.out.println("Informe o numero:");
		int num = leia.nextInt();
		
		while(num>=12 & num<=20) {
			System.out.println(num);
			break;
		}
		while(num<12 || num>20) {
			System.out.print("Entrada invalida");
			break;
			
		}

	}
	
	

}
