package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	// Declaração de variaveis
	int ctd;
	
	Scanner leia = new Scanner(System.in);
	
	public void calculo() {
		
		for(int x = 1; x <=10;x++) {
			System.out.println("Informe o numero:");
			int num = leia.nextInt();
			
			for(;num >=10 & num <= 20;) {
				num = 0;
				ctd++;
				System.out.println("Estão no intervalo " + ctd + " numeros");
				
				
			}
		}
		int ctdi = 10 - ctd;
		System.out.println(ctd +" Numeros estão no intervalo de [10,20] "+ "\n" + ctdi +" Numeros não estão no intervalo de [10,20]");
	}

}
