package br.com.senaitagua.sa1.app8;


import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.Piloto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciaando objetos
		Piloto p = new Piloto();
		
		// Declaração de variaveis
		String idade;
		
		
		
		p.setNome(JOptionPane.showInputDialog("Qual o seu nome?"));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?")));
		
		if(p.verificarAposentadoria()) {
			new TelaAposentadoria().setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Você não possui idade o suficiente","Aplicativo 8",JOptionPane.ERROR_MESSAGE);
		}

	}

}
