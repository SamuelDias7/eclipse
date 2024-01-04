package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo { 
	int sv;
	int media;
	
	public void calculo() {
		
		Scanner leia = new Scanner(System.in);

		int x = 1;
		
		while( x<= 3) {
			System.out.println("Informe a idade:");
			int notas = leia.nextInt();
			media = media + notas;
			System.out.println(media);
			x++;
		}
		media/=3;
		System.out.println("A meida das 3 notas é:" + media);
		
		

		
		
	}

}
