package projetobasico;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo obj = new Calculo();
		
		obj.setNome(JOptionPane.showInputDialog("Digite o seu nome:"));
		obj.setIdade(JOptionPane.showInputDialog("Digite a sua idade:" ));
		
		JOptionPane.showMessageDialog(null, obj.getNome() + "\n" + obj.getIdade());

	}

}
