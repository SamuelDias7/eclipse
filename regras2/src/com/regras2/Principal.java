package com.regras2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Conta contas = new Conta("5478", "8572",0);
				
		// declaração de variaveis
		String valor;
		
		// Declaração de array
		Object[] opcao = {"consultar dados", "consultar saldo", "depositar", "Sacar", "Sair"};
		Object opcaoEscolhida;
		
		// Recebe o numero do titular
		contas.setNumeroTitular(JOptionPane.showInputDialog("Informe o nome do titular"));
		
		do {
			// Usuario escolhe a opção desejada
						opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a ação desejada","ação",JOptionPane.INFORMATION_MESSAGE,null,opcao,opcao[0]);
			
			if (opcaoEscolhida == "consultar dados")
				JOptionPane.showMessageDialog(null, contas.consultarDados());
			else if(opcaoEscolhida == "consultar saldo")
				JOptionPane.showMessageDialog(null, contas.conseultarSaldo());
			else if(opcaoEscolhida == "depositar") {
				valor = JOptionPane.showInputDialog("Informe o valor que deseja depositar:");
				valor = valor.replace(",", ".");
				contas.depositarValor(Double.parseDouble(valor));
			}
			else if(opcaoEscolhida == "Sacar") {
				valor = JOptionPane.showInputDialog("Informe o valor que deseja sacar:");
				valor = valor.replace(",", ".");
				contas.sacarValor(Double.parseDouble(valor));
			}
			else 
					JOptionPane.showMessageDialog(null, "Obrigado, tenha um bom dia");
				
		}while(opcaoEscolhida != "Sair");
		

	}

}
