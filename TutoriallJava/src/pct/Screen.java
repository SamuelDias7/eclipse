package pct;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;

public class Screen extends JFrame {
	
	JTextField text1;
	JTextField text2;
	
	//Construtor
	public Screen (){
						
		// Definindo a tela a ser criada como visivel
		setVisible(true);
		
		// Definindo o tamanhp da tela (largura, altura)
		setSize(800, 500);
		
		// Definindo titulo da janela
		setTitle("Aprendendo JFrame");
		
		// Fecha de fato a janela quando operação requisitada
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Impede que o tamanho da janela seja alterada pelo usuario
		setResizable(false);
		
		// Define que a jalena seja executada no meio da tela
		setLocationRelativeTo(null);
		
		//setLayout(BorderLayout);
		
		// Intanciando JButton
		JButton JButton = new JButton();
		
		// Definindo texto do botao
		JButton.setText("Somar");
		
		// O valor de X é a distancia do botao da margem horizontal, Y é a distancia do botao para a margem vertical,os ouyros valores são o tamanho do botão( largura,altura)
		JButton.setBounds(33, 200, 300, 77);
		
		// Define cinfigurações do texto do botao, tais como fonte e tamanho do texto
		JButton.setFont(new Font("Arial", Font.BOLD,40));
		
		// Red, Greend, Blue
		
		// Define cor do texto
		JButton.setForeground(new Color(237,241,239));
		// Define cor de fundo do botao
		JButton.setBackground(new Color(9,10,9));
		
		// Intanciando JButton
		JButton JButton2 = new JButton();
		
		// Definindo texto do botao
		JButton2.setText("Subtrair");
		
		// O valor de X é a distancia do botao da margem horizontal, Y é a distancia do botao para a margem vertical,os ouyros valores são o tamanho do botão( largura,altura)
		JButton2.setBounds(0, 0, 150, 70);
		
		// Define cinfigurações do texto do botao, tais como fonte e tamanho do texto
		JButton2.setFont(new Font("Arial", Font.BOLD,20 ));
		
		// Red, Greend, Blue
		// Define cor do texto
		JButton2.setForeground(new Color(237,241,238));
		// Define cor de fundo do botao
		JButton2.setBackground(new Color(12,12,220));
		
		// Adicionando botao ao Layout(mesmo se os botões forem criados, se não os adicionar ao painel nada ira acontecer)
		add(JButton); 
		add(JButton2);
		
		// Atribuindo a botao ao evento
		JButton.addActionListener(this::teste1);
		JButton2.addActionListener(this::teste2);
		
		text1 = new JTextField();

		text1.setBounds(100, 100, 100, 100);
		text1.setFont(new Font("Arial", Font.ITALIC,40));
		//text1.setText("Digite algo");
		
		add(text1);
				
		text2 = new JTextField();
		text2.setBounds(333, 333, 100, 100);
		text2.setFont(new Font("Arial", Font.ITALIC,40));
		//text2.setText("Outro texto");
		
		add(text2);
		
		text2.setVisible(true);
		
		}
	
	private void teste1(ActionEvent actionevent1) {
		int num1 = Integer.parseInt(text1.getText());
		int num2 = Integer.parseInt(text2.getText());
		
		int total = num1 + num2;
		
		//JOptionPane.showMessageDialog(null, total);
		JOptionPane.showMessageDialog(null, "O resultado  da soma é: " + total, "Operação bem sucedida", JOptionPane.WARNING_MESSAGE);

		
		
	}
	

	private void teste2(ActionEvent actionevent1) {
		int num1 = Integer.parseInt(text1.getText());
		int num2 = Integer.parseInt(text2.getText());
		
		int total = num1 - num2;
		
		//JOptionPane.showMessageDialog(null, total);
		JOptionPane.showMessageDialog(null, "O resultado  da subtração é: " + total, "Operação bem sucedida", JOptionPane.WARNING_MESSAGE);

		
		
		
	}
	
	



	

}
