package com.pessoadados;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia o objeto do tipo pessoa
		Pessoa usuario = new Pessoa();
		
		//Declaração de variaveis
		String idade;
		
		//Algoritimo
		
		//Recebe o nome do usúario
		usuario.nome = JOptionPane.showInputDialog("Informe o seu nome: ");
		
		//Recebe a idade do usuário
		idade = JOptionPane.showInputDialog("informe a sua idade: ");
		
		//Converte String para int
		usuario.idade = Integer.parseInt(idade);
		
		if(usuario.idade>=18)
			JOptionPane.showMessageDialog(null, usuario.nome + " é maior de idade.");
		else
			JOptionPane.showMessageDialog(null, usuario.nome + " é menor de idade.");
		
	}

}
