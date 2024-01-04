package com.Conta2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		PessoaFisica usuario = new PessoaFisica("Oi","Sim","nao");
		
		// Retorna dados pro usuario
		JOptionPane.showMessageDialog(null, usuario.getNacionalidade());

	}

}
