package com.copa;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Jogos objeto = new Jogos();
		
		//Declação de variaveis
		String Brasil;
		String Servia;
		String Suica;
		
		Brasil = JOptionPane.showInputDialog("Quantos jogos o Brasil venceu:");
		Servia = JOptionPane.showInputDialog("Quantos jogos a Servia venceu:");
		Suica = JOptionPane.showInputDialog("Quantos jogos a Suiça venceu:");
		
	}

}
