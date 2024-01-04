package com.app.imc;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objetos
		Pessoa usuario = new Pessoa();
		
		// Declaração de variaveis
		String valor1;
		String valor2;


		//Recebe os valores do usuário
		valor1 = JOptionPane.showInputDialog("Informe o ano atual:");
		valor2 = JOptionPane.showInputDialog("informe o ano do primeiro lançamento:");
		
		//Retorna o Imc e a suúde do usuário
		JOptionPane.showMessageDialog(null, usuario.calcularPeso(Double.parseDouble(valor1), Double.parseDouble(valor2)));

	}

}
