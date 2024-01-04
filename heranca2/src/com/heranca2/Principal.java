package com.heranca2;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando os objetos
		PessoaFisica usuario =  new PessoaFisica();
		PessoaJuridica empresa = new PessoaJuridica();
		
		// Declaração de array
		Object[] escolha = {"usuario", "empresa"};
		Object valorEscolha;
		
		valorEscolha = JOptionPane.showInputDialog(null, "Escolha a opção", "Escolha",JOptionPane.INFORMATION_MESSAGE,null,escolha,escolha[0]);
		
		if(valorEscolha == "usuario") {
			// Recebe os dados da pessoa física
			usuario.nome = JOptionPane.showInputDialog("Informe o nome:");
			usuario.cpf = JOptionPane.showInputDialog("Informe o CPF:");
			usuario.telefone = JOptionPane.showInputDialog("Informe o telefone:");
			usuario.endereco = JOptionPane.showInputDialog("Informe o endereço:");
			usuario.email = JOptionPane.showInputDialog("Informe o e-mail:");
			
			// OUtput da pessoa fisica
					JOptionPane.showMessageDialog(null, usuario.apresentar() + "\n\nnome:" + usuario.nome + "\nCPF:" + usuario.cpf + "\nTelefone:" + usuario.telefone + "\nendereço:" + usuario.endereco + "\ne-mail:" + usuario.email);
		}
		
		else {
			
			// Recebe os dados da pessoa juridica
			empresa.razaoSocial = JOptionPane.showInputDialog("Informe a razão social");
			empresa.nomeFantasia = JOptionPane.showInputDialog("Informe o nome fantasia:");
			empresa.CNPJ = JOptionPane.showInputDialog("Informe o CNPJ:");
			empresa.telefone = JOptionPane.showInputDialog("Informe o telefone:");
			empresa.endereco = JOptionPane.showInputDialog("Informe o endereço");
			empresa.email = JOptionPane.showInputDialog("Informe o e-mail");
			
			
			//Output da pessoa juridica
			JOptionPane.showMessageDialog(null, empresa.apresentar() + "\n\nnome social:" + empresa.razaoSocial + "\nnome fantasia:" + empresa.nomeFantasia + "\nCNPJ:" + empresa.CNPJ + "\ntelefone:" + empresa.telefone + "\nendereço:" + empresa.endereco + "\ne-mail:" + empresa.email);
		}
	
	

	}

}
