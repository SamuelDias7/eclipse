package br.com.SCGT.sa01.bo;

import java.util.Scanner;

public class Calculo {
	
	Scanner leia = new Scanner(System.in);
	
	public void Calculo() {
		System.out.println("Informe o numero:");
		int num = leia.nextInt();
		
		if(num<=10) {
			for(int x = 1;x<=10;x++) {
				int total = num * x;
				System.out.println(num + "*" + x + "=" + total);
				
			}
			}else {
				System.out.println("Informe um numero entre 1 e 10");
			
		}
	}

}
