package com.polimorfismo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		PessoaFisica usuario = new PessoaFisica(10101, "Masculino", "Brasileiro");
		
		// Algoritmo
		usuario.nome = JOptionPane.showInputDialog("Informe o nome");
		usuario.email = JOptionPane.showInputDialog("Informe o seu email");
		
		// Output
		JOptionPane.showMessageDialog(null,usuario.apresentar());
		
	}

}
