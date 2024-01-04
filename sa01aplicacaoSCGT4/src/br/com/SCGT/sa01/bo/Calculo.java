package br.com.SCGT.sa01.bo;

import java.util.Scanner;

 public class Calculo {

	int sv = 0;
	
	int total = 0;
	
	Scanner leia = new Scanner(System.in);
	
	public void Calculo() {
		
		for(int x = 1; x<=5;x++) {
			System.out.println("Informe a " + x +" idade:");
			int sa1 = leia.nextInt();
			
			
			//sv = sv + sa1;
			sv = sv + sa1;			
						
		}
		sv/=5;
		System.out.println("A media das idades é de: " + sv);
		
	}

}
