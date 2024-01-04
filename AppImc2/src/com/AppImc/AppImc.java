package com.AppImc;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Pessoa usuario = new Pessoa();
		
		// Declaração de variaveis
		String valorAltura;
		String valorPeso;
		
		// Declaração de array
		Object[] continuar = {"Continuar", "Sair"};
		Object desejaContinuar;
		
		// Troca vírgula por ponto
		
		do {
			// recebe as informações do usuario
			valorAltura = JOptionPane.showInputDialog("Informe a sua altura (em metros)");
			valorPeso = JOptionPane.showInputDialog("Informe o seu peso (em kg)");
			
			// Retorna Imc e a saúde do usuario
			JOptionPane.showMessageDialog(null, "Imc:" + String.format("%.2f", usuario.Imc(Double.parseDouble(valorAltura),Double.parseDouble(valorPeso))) +  "\n" + usuario.saude());
			
			desejaContinuar = JOptionPane.showInputDialog(null,"Deseja continuar", "Continuar",JOptionPane.INFORMATION_MESSAGE,null,continuar,continuar[0]);
			
		}while(desejaContinuar == "Continuar");
		
		System.exit(0);

	}

}
