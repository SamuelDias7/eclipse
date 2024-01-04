package com.Conta;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		ContaCorrente corrente = new ContaCorrente("0000-0","001 ", "Conta Corrente","500");
		ContaPoupanca poupanca = new ContaPoupanca("0000-0","013","Conta Poupanca","500,75");
		
		// Declaração de array
		Object[] opcoes = {"Conta Corrente", "Conta Poupanca"};
		Object valorOpcoes;
		
		// declaração de array de escolhas
		Object[] escolha = {"Consultar Saldo", "Depositar valor", "Sacar valor","Sair do programa"};
		Object valorEscolha;
		
		valorOpacoes = JOptionPane.showInputDialog(null, "Escolha o tipo de conta", "Escolha",JOptionPane.INFORMATION_MESSAGE,null,opcoes,opcoes[0]);
		
		if(valorOpcoes == "ContaCorrente"){
			
		//Output dos dados do usuario
		JOptionPane.showMessageDialog(null, "Numero da agencia:" + corrente.getNúmerodaagência() + "\nNumero da conta:" + corrente.getNúmerodaconta() + "\nTipo da conta:" + corrente.getTipodeconta() + "\nSaldo da conta:" + corrente.getSaldodaconta());     
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Numero da agencia:" + poupanca.getNúmerodaagência() + "\nNumero da conta:" + poupanca.getNúmerodaconta() + "\nTipo da conta:" + poupanca.getTipodeconta() + "\nSaldo da conta:" + poupanca.getSaldodaconta());
		}
		
		valorEscolha = JOptionPane.showInputDialog(null, "Escolha a ação que deseja fazer:","Escolha",JOptionPane.INFORMATION_MESSAGE,null,escolha,escolha[0]);
		
		if(valorEscolha == "Consultar Saldo"){
			JOptionPane.showMessageDialog(null, "O saldo da sua conta é de:" + corrente.getSaldodaconta() + " Reais" + ".");
		}
		
		if(valorEscolha == "Depositar valor"){
			JOptionPane.showInputDialog("Informe a quantidade que você deseja depositar:");
		}
		
		if(valorEscolha == "Sacar valor") {
		JOptionPane.showInputDialog(null, "O saldo da sua conta é de " + corrente.getSaldodaconta() + " reais," + "\n" + "Informe quanto você deseja sacar:");
		}
		
		if(valorEscolha == "Sair do programa"){
			System.exit(0);
			
		}
		
	}

}
