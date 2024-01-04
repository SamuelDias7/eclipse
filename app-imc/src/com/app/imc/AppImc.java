package com.app.imc;

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
		Object[] continuar = { "Continuar", "Sair" };
		Object desejaContinuar;

		// Algoritmo
		do {
			// Recebe os valores do usuário
			valorAltura = JOptionPane.showInputDialog("Informe o valor da altura (em metros):");
			valorPeso = JOptionPane.showInputDialog("informe o peso (em kg)");

			// Troca a vírgula por ponto
			valorAltura = valorAltura.replace(",", ".");
			valorPeso = valorPeso.replace(",", ".");

			// Retorna o Imc e a suúde do usuário
			JOptionPane.showMessageDialog(null,
					"Imc:" + String.format("%.2f",
							usuario.calcularPeso(Double.parseDouble(valorAltura), Double.parseDouble(valorPeso)))
							+ ".\n" + usuario.retornarImc());

			desejaContinuar = JOptionPane.showInputDialog(null, "Deseja continuar?", "Continuar",
					JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
		} while (desejaContinuar == "Continuar");

		// Encerrar o programa
		System.exit(0);

	}

}
