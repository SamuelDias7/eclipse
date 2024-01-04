package br.comIFCTI3.app;

import java.util.Scanner;

import br.comIFCTI3.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// InStanciando os objetos
		Scanner leia = new Scanner(System.in);
		Calculo obj = new Calculo();
		
		System.out.println("Informe o saldo:");
		obj.saldo = leia.nextInt();
		
		obj.Calcular();
		
		
		
		
	}

}
