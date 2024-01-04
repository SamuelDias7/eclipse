package com.subtracao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		valores objeto = new valores();
		
		String n1,n2,resultado;
		
		n1 = JOptionPane.showInputDialog("Informe o valor1:");
		n2 = JOptionPane.showInputDialog("Informe o valor2:");
		
		JOptionPane.showMessageDialog(null, objeto.resultado(Integer.parseInt(n1),Integer.parseInt(n1)));
						
		

	}

}
