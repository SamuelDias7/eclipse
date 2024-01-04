package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	int num = 1; 
	int total = 1;
	
	Scanner leia = new Scanner(System.in);

	
	public void calculo() {
		
		do {
			System.out.println("Informe o numero:");
			num = leia.nextInt();
			
			total = total + num;
			
		}while(num!=0);
		System.out.println("A soma dos numeros digitados é: " + total);
		
		
	}

}
