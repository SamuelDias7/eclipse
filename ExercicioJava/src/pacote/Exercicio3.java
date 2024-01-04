package pacote;

import java.awt.Color;

import javax.swing.*;

public class Exercicio3 extends JFrame {
	static JButton b1;
	static JFrame frame;
	static JPanel painel;
	
	public Exercicio3() {

		JButton b1 = new JButton("gg");
		add(b1);
		
	}
	
	public static void inicialziacao() {
		painel = new JPanel();
		painel.add(b1);
		b1.setBounds(150,30,150,30);
		frame.add(frame);
		JOptionPane.showMessageDialog(null, "Deu certo");
		
		
		
	}
	
	public static void play() {
		
			
			frame = new JFrame("Tela");
			frame.setVisible(true);
			frame.setLayout(null);
			frame.setSize(400,400);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			Exercicio3 obj = new Exercicio3();
			//obj.inicialziacao();
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercicio3 obj = new Exercicio3();
		obj.play();
		obj.inicialziacao();
	}

}
