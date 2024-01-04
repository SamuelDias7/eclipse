package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	int ctd;
	
	Scanner leia = new Scanner(System.in);
	
	public void Calculo() {
		
		for(int x=1;x<=10;x++){
			System.out.println("Informe o numero:");
			int num = leia.nextInt();
			
			for(;num % 2 ==0; ) {
				ctd++;
				num++;
				
			}
			

		}
		int ctdi = 10 - ctd;
		System.out.println("Numeros pares: " + ctd + "\n" + "Numeros impares: " + ctdi);
	}

}
