package com.app.imc;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instancia objeto
		Pessoa usuario = new Pessoa();
		
		// Declaração de variáveis
		String valorAltura;
		String valorPeso;
		
		// Declaração de array
		Object[] continuar = {"Continuar","Sair"};
		Object desejaContinuar;
		
		// Algoritmo
		do {
			// Recebe os valores do usuário
			valorAltura = JOptionPane.showInputDialog("Informe a altura (em metros):");
			valorPeso = JOptionPane.showInputDialog("Informe o peso (em kg):");
			
			// Troca a vírgula por ponto
			valorAltura = valorAltura.replace(",", ".");
			valorPeso = valorPeso.replace(",", ".");
			
			// Retorna o IMC e a saúde do usuário
			JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", usuario.calcularPeso(Double.parseDouble(valorAltura), Double.parseDouble(valorPeso))) + ".\n" + usuario.retornarImc());
			
			// Mostra as opções para o usuário
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja Continuar?", "Continuar", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		} while (desejaContinuar == "Continuar");
		
		// Encerrar o programa
		System.exit(0);

	}

}
