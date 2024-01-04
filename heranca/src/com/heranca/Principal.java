package com.heranca;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando os objetos
		PessoaFisica usuario = new PessoaFisica();
		PessoaJuridica empresa = new PessoaJuridica();
		
		// Declaração de array
		Object[] opcoes = {"Usuario","Empresa"};
		Object opcaoEscolhida;

		// Usuario escolhe a opção
		opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha o tipo de usuario","Tipo de usuario",JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);
		
		if (opcaoEscolhida == "Usuario") {
			// Recebe os dados da pessoa fisica
			usuario.nome = JOptionPane.showInputDialog("Informe o seu nome:");
			usuario.cpf = JOptionPane.showInputDialog("Informe o seu CPF:");
			usuario.telefone = JOptionPane.showInputDialog("Informe o seu telefone:");
			usuario.endereco = JOptionPane.showInputDialog("Informe o seu endereço:");
			usuario.email = JOptionPane.showInputDialog("Informe o seu e-mail:");
			
			// Output
			JOptionPane.showMessageDialog(null, usuario.apresentar() + "\n\nNome:" + usuario.nome + "\nCPF:" + usuario.cpf + "\nTelefone: " + usuario.telefone + "\nEndereço: " + usuario.endereco + "\nE-mail: " + usuario.email + ".");
		}
		else {
			// Recebe os dados da pessoa juridica
			empresa.razaoSocial = JOptionPane.showInputDialog("Informe a razão social da empresa:");
			empresa.nomeFantasia = JOptionPane.showInputDialog("Informe o nome fantasia da empresa:");
			empresa.cnpj = JOptionPane.showInputDialog("Informe o CNPJ");
			empresa.telefone = JOptionPane.showInputDialog("Informe o telefone da empresa");
			empresa.endereco = JOptionPane.showInputDialog("Informe o endereço da empresa:");
			empresa.email = JOptionPane.showInputDialog("Informe o e-mail da empresa:");
			
			// Output
			JOptionPane.showMessageDialog(null, empresa.apresentar() + "\n\nRazão social:" + empresa.razaoSocial + "\nNome fatasia:" + empresa.nomeFantasia + "\nCNPJ:" + empresa.cnpj + "\nTelefone:" + empresa.telefone + "\nEndereço:" + empresa.endereco + "\nE-mail:" + empresa.email);
		}
		
		}
}
