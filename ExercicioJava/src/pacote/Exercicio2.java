package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Exercicio2 extends JFrame{
	JButton b1;
	JMenuBar bar;
	JMenu menu;
	JMenuItem item1;

	
	public Exercicio2() {
		
		
		bar = new JMenuBar();
		menu = new JMenu("Menu");
		item1 = new JMenuItem("Item 1");
		
		setJMenuBar(bar);
		bar.add(menu);
		menu.add(item1);
		
		
		//add(new Exercicio1());
		
		ActionListener acao = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(new Exercicio1());

			}
			
		};item1.addActionListener(acao);


		setTitle("Segunda tela");
		setVisible(true);
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

}
