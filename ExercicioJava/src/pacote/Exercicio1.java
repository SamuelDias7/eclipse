package pacote;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class Exercicio1 extends JPanel {
	JButton b1,b2;
	//JLabel t1;
	
	public Exercicio1() {
		//setLayout(new BorderLayout());

		b1 = new JButton("Clique em mim!");
		add(b1);
		
		b2 = new JButton("Botão do painel");
		add(b1);
		
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Legal, funcionou :)");
				setBackground(Color.BLACK);
				add(b2);
				b2.setBounds(150,100,150,30);
				
				
				

			}
		};b1.addActionListener(acao);

		
		
	}
	
	public static void main(String  args[]) {
		
		JFrame frame = new JFrame("Janelad de teste");
		Exercicio1 painel = new Exercicio1();
		
		new Exercicio2();
		
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(painel);
		
		System.out.println("Hello World!");
		
	}

}
