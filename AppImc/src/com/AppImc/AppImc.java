package com.AppImc;

import javax.swing.JOptionPane;

public class AppImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando os objetos
		Pessoa usuario = new Pessoa();
		
		// Declaração de variaveis
		String valorAltura;
		String valorPeso;
		
		// DeclçaraçÕ de Array
		Object[] continuar = {"Continaur","Sair"};
		Object desejaContinuar;
		
		
		do {
			// Recebe as inforormações do usurio
			valorAltura = JOptionPane.showInputDialog("Informe a sua altura (em metros)");
			valorPeso = JOptionPane.showInputDialog("Informe o seu peso (em kg)");
			
			// Troca ponto por vírgula
			valorAltura = valorAltura.replace(",", ".");
			valorPeso = valorPeso.replace(",", ".");
			
			// Informa as informações pro usuario
			JOptionPane.showMessageDialog(null, "Imc: " + String.format("%.2f", usuario.calcularImc(Double.parseDouble(valorAltura) ,Double.parseDouble(valorPeso)) ) + "\n" + usuario.situação() + ".");
			
			//Continuar ou sair
			desejaContinuar = JOptionPane.showInputDialog(null,"Deseja continuar", "continuar",JOptionPane.INFORMATION_MESSAGE,null,continuar,continuar[0]);
			
		}while(desejaContinuar == "Continaur");
		
		// Encerra o programa
		System.exit(0);
		

	}

}
