package xadrez;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Principal {
	
	public Principal(int autenticacao,String jogador) {
		
		
		
		
		//JOptionPane.showMessageDialog(null, "IMPORTANTE:" + autenticacao);
		// TODO Auto-generated constructor stub

		// TODO Auto-generated method stub
		
		// Criando frame
		JFrame frame = new JFrame("");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,3));
		
		// Criando painel(primeira linha)
		JPanel painel = new JPanel(new GridLayout());
		
		// Criando botões
		JButton b1a = new JButton("COLUNA 1");
		JButton b2a = new JButton("COLUNA 1");
		JButton b3a = new JButton("COLUNA 1");


		//Adicionando componentes ao painel
		painel.add(b1a);
		painel.add(b2a);
		painel.add(b3a);
		
		// Criando painel 2(segunda linha)
		JPanel painel2 = new JPanel(new GridLayout());
		
		// Criando botões
		JButton b1b = new JButton("COLUNA 2");
		JButton b2b = new JButton("COLUNA 2");
		JButton b3b = new JButton("COLUNA 2");
		
		//Adicionando componentes ao painel
		painel2.add(b1b);
		painel2.add(b2b);
		painel2.add(b3b);
		
	
		// Criando painel 3(terceira linha)
		JPanel painel3 = new JPanel(new GridLayout());
		JButton b1c = new JButton("COLUNA 3");
		JButton b2c = new JButton("COLUNA 3");
		JButton b3c = new JButton("COLUNA 3");
		
		//Adicionando componentes ao painel
		painel3.add(b1c);
		painel3.add(b2c);
		painel3.add(b3c);
		
		//Adicionando paineis ao frame
		frame.add(painel);
		frame.add(painel2);
		frame.add(painel3);
		
		// Criando a imagem(bola) e configurando ela 
		ImageIcon imagem = new ImageIcon(Principal.class.getResource("bola.png"));
		
		// Definindo dimesão 
		Image imagemRedirecioanda = imagem.getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH);
		ImageIcon imagemRedimensionadaIcon = new ImageIcon(imagemRedirecioanda);
		 //adicionando imagem ao votão e atribuindo a imagem
		
		//Criando a imagem(X) e configurando ela
		ImageIcon imagem2 = new ImageIcon(Principal.class.getResource("x.png"));
		
		//Definindo as dimensões
		Image imagemRedirecioanda2 = imagem2.getImage().getScaledInstance(120, 120,  Image.SCALE_SMOOTH);
		ImageIcon imagemRedimensionadaIcon2 = new ImageIcon(imagemRedirecioanda2);
		
	
		// ADICIONANDO ACÕES
				ActionListener b1aAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b1a.setIcon(imagem);
							b1a.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							
							b1a.setIcon(imagem2);
							b1a.setIcon(imagemRedimensionadaIcon2);
							
							//Contador contador = new Contador(1,"");
							

						}
					}
					
				};b1a.addActionListener(b1aAction);
				
				ActionListener b2aAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b2a.setIcon(imagem);
							b2a.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b2a.setIcon(imagem2);
							b2a.setIcon(imagemRedimensionadaIcon2);
							
							//Contador contador = new Contador(1,"");


						}
					}
					
				};b2a.addActionListener(b2aAction);
				
				ActionListener b3aAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b3a.setIcon(imagem);
							b3a.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b3a.setIcon(imagem2);
							b3a.setIcon(imagemRedimensionadaIcon2);

						}
					}
					
				};b3a.addActionListener(b3aAction);
				
				ActionListener b1bAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b1b.setIcon(imagem);
							b1b.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							} 
							b1b.setIcon(imagem2);
							b1b.setIcon(imagemRedimensionadaIcon2);

						}
					}
					
				};b1b.addActionListener(b1bAction);
				
				ActionListener b2bAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b2b.setIcon(imagem);
							b2b.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b2b.setIcon(imagem2);
							b2b.setIcon(imagemRedimensionadaIcon2);

						}
					}
					
				};b2b.addActionListener(b2bAction);
				
				ActionListener b3bAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b3b.setIcon(imagem);
							b3b.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b3b.setIcon(imagem2);
							b3b.setIcon(imagemRedimensionadaIcon2);

						}
					}
					
				};b3b.addActionListener(b3bAction);
				
				ActionListener b1cAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b1c.setIcon(imagem);
							b1c.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b1c.setIcon(imagem2);
							b1c.setIcon(imagemRedimensionadaIcon2);

						}
					}
					
				};b1c.addActionListener(b1cAction);
				
				ActionListener b2cAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b2c.setIcon(imagem);
							b2c.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							
							b2c.setIcon(imagem2);
							b2c.setIcon(imagemRedimensionadaIcon2);

						}
						
					}
					
				};b2c.addActionListener(b2cAction);
				
				ActionListener b3cAction = new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(jogador == "jogador1") {
							
							
							
						//new Contador(0, "liberado");
						
						
							JOptionPane.showMessageDialog(null, jogador);
							
							
							
							b3c.setIcon(imagem);
							b3c.setIcon(imagemRedimensionadaIcon);
							//Contador contador = new Contador(1,"liberado");
							
							
							
						}else {
							
							
							if(jogador == "jogador2") {
								JOptionPane.showMessageDialog(null, jogador);
								
							}else {
								JOptionPane.showMessageDialog(null, "ERRO");
								
							}
							b3c.setIcon(imagem2);
							b3c.setIcon(imagemRedimensionadaIcon2);

						}
						
						
						
					}
					
				};b3c.addActionListener(b3cAction);
								
				

				
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Contador(0,"");
		

		
			
		
		
		
		
	}

}
