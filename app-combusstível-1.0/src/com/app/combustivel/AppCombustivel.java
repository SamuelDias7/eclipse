package com.app.combustivel;

import javax.swing.JOptionPane;

public class AppCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando os objetos 
		Combustivel combustivel = new Combustivel();
		
		// Declaração de variaveis
		String valorGasolina;
		String valorEtanol;
		String msg;
		
		// Declaração de array
		Object[] continuar = {"Continuar","sair"};
		Object desejaContinuar;
		
		// Algoritimo
		do {
			//Recebe os valorees dos combustiveis pelo usuario
			//O valor que o usuario informar é ATRIBUIDO a "valorgasolina/"valorEtanol"
			valorGasolina = JOptionPane.showInputDialog("informe o valor da gasolina:");
			valorEtanol = JOptionPane.showInputDialog("informe o valor do etanol:");
			
			//Converte vírgula para ponto
			valorGasolina = valorGasolina.replace(",", ".");
			valorEtanol = valorEtanol.replace("," , ".");
			
			//Converte os valores para double e repassa para o método
			msg = combustivel.calcular(Double.parseDouble(valorEtanol),Double.parseDouble(valorGasolina));
			
			// Exibe a resposta na tela
			JOptionPane.showMessageDialog(null, msg);
			
			// Exibe as opções de continuar ou não
			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja continuar?", "Continuar?", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar [0]);
		} while (desejaContinuar == "Continuar");
		
		// Encerra o programa
		System.exit(0);

	}

}
