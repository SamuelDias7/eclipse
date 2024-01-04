package com.App;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objetos
		Pessoa usuario = new Pessoa();
		
		// Declaração de array
		Object [] continuar = {"Continuar","Sair"};
		Object desejaContinuar;
		
		// Declaração de variaveis
		String valorAltura;
		String valorPeso;
		
		do {
		valorAltura = JOptionPane.showInputDialog("Informe a sua altura (em metros)");
		valorPeso = JOptionPane.showInputDialog("Informe o seu peso (em kg)");
		
		//Trocar vírgula por ponto
		valorAltura = valorAltura.replace(",",".");
		valorPeso = valorPeso.replace(",", ".");
		
		//Retorna o IMc e a sitção do usuario
		JOptionPane.showMessageDialog(null, String.format("%.2f",usuario.calcularPeso(Double.parseDouble(valorAltura),Double.parseDouble(valorPeso))) + ".\n" + usuario.retornarImc());
		
		//Continuar ou não
		desejaContinuar = JOptionPane.showInputDialog(null,"Deseja Continuar", "Continuar",JOptionPane.INFORMATION_MESSAGE,null,continuar,continuar[0] );
		}while(desejaContinuar == "Continuar");
		
		//Encerra o programa
		System.exit(0);
	}

}
