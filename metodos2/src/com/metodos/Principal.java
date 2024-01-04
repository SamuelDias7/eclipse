package com.metodos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando objeto do tipo TipoDeMetodos
		TiposDeMetodos objeto = new TiposDeMetodos();
		
		// Algoritmo
		JOptionPane.showMessageDialog(null, "texto:" + 
		objeto.texto(JOptionPane.showInputDialog("Informe um texto:")) + "\nnúmero inteiro:" + objeto.numInt(Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"))) + "\nnúmero decimal:" + String.valueOf(objeto.numDecimal(Double.parseDouble(JOptionPane.showInputDialog("Informe um número decimal:").replace("," ,".")))).replace("." ,","));
	}

}
