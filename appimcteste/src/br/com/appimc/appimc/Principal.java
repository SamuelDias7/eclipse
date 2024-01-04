package br.com.appimc.appimc;

import javax.swing.JOptionPane;

import br.com.appimcteste.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		usuarioBO objeto = new usuarioBO();
		
		// Input
		objeto.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua altura:")));
		objeto.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Informe o seu peso:")));

		
		
		JOptionPane.showMessageDialog(null, "Seu Imc é:" + objeto.calcularIMC());
		
		JOptionPane.showMessageDialog(null, objeto.calcularSituacao());
		
		
	}

}
