package com.regras3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Conta conta = new Conta("3245", "5783", 0);
		
		// Declaração de variaveis
		String valor;
		
		// Declaração de array
		Object[] opcao = {"Consultar dados", "Consultar saldo", "Depositar", "Sacar", "Sair"};
		Object opcaoEscolhida;
		
		conta.setNumerotitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
		
		do {
			
			opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a ação desejada", "ação", JOptionPane.INFORMATION_MESSAGE,null,opcao,opcao[0]);
			
			if(opcaoEscolhida=="Consultar dados")
				JOptionPane.showMessageDialog(null, conta.consultarDados());
			else if(opcaoEscolhida=="Consultar saldo")
				JOptionPane.showMessageDialog(null, conta.consultarsaldo());
			else if(opcaoEscolhida=="Depositar") {
				valor = JOptionPane.showInputDialog("Informe o valor que deseja depositar:");
			valor = valor.replace(",", ".");
			conta.depositarValor(Double.parseDouble(valor));
			}
			else if(opcaoEscolhida=="Sacar"){
				valor = JOptionPane.showInputDialog("Informe o valor que deseja sacar:");
				valor = valor.replace(",", ".");
				conta.sacarValor(Double.parseDouble(valor));
			}
			else
					JOptionPane.showMessageDialog(null, "Obrigado, tenha um bom dia");
				
		}while(opcaoEscolhida!="Sair");
		
		System.exit(0);
	}

}
