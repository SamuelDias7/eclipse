package imagem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame painel = new JFrame();
		painel.setVisible(true);
		painel.setSize(400,400);
		painel.setLayout(null);
		painel.setResizable(false);
		painel.setLocationRelativeTo(null);
		painel.setBackground(Color.black);
		
		JButton botao = new JButton("Imagem 1");
		JButton botao2 = new JButton("Imagem 2");
		
	
		botao.setBounds(100,100,150,30);
		botao2.setBounds(200,200,150,30);
		
		painel.add(botao);
		painel.add(botao2);
		
				
		ImageIcon imagem = new ImageIcon (Principal.class.getResource("ruandiscord.png"));
		JLabel label = new JLabel(imagem);
		
		JFrame frame = new JFrame();
		
		frame.add(label);
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(false);
		
		ImageIcon imagem2 = new ImageIcon (Principal.class.getResource("orochicabelo.jpeg"));
		JLabel label2 = new JLabel(imagem2);
		
		JFrame frame2 = new JFrame();
		
		frame2.add(label2);
		frame2.setSize(800,800);
		frame2.setLocationRelativeTo(null);
		//frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame2.setVisible(false);
		
		
		ActionListener evento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(true);
			}
			
		};botao.addActionListener(evento);
		
		ActionListener evento2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				frame2.setVisible(true);
				
				
			}
			
		};botao2.addActionListener(evento2);
		
		
		
		
		

	}

}
