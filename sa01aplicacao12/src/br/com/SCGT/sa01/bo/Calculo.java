package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	int x;
	int num = 1;
	
	Scanner leia = new Scanner(System.in);
	
	public void calculo() {
		do {
			System.out.println("Informe o numero:");
			num = leia.nextInt();
			
		}while(num > 1);
	}

}
