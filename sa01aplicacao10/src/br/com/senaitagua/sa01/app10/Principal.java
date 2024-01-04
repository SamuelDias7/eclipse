package br.com.senaitagua.sa01.app10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JOptionPane.showMessageDialog(null, "Seja bem vindo ao Banco SS");
		
		   int senha;
		   int cont= 0;
		    
		   while (cont < 3) {
		   senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
		   if(senha == 123) {
			  JOptionPane.showMessageDialog(null, "Saque autorizado!");
			   break;
		   }else{
			  JOptionPane.showMessageDialog(null, "Senha inválida");
			   cont++;
		   }
			   
		if (cont >= 3) {
			JOptionPane.showMessageDialog(null, "Conta Bloqueada");
			break;
			}
		}      		   
	}

}