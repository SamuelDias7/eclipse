package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	int total = 1;
	
	public void calculo() {
		
		Scanner leia = new Scanner(System.in);
		
		int x = 1;
		
		System.out.println("Informe o numero:");
		int num = leia.nextInt();
		
		while(x<=10) {
			total = x * num;
			System.out.println(total);
			x++;
			
			
		}
	}

}
