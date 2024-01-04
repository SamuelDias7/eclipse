package br.com.learnsqlpda.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class ComandoGUI extends JFrame {
	
	
	//1° pilar: componentes
	//2° pilar: propriedades
	//#° pilar: Eventos
	
	// Declaraçao de componesntes 
	private JLabel lblTipo, lblAluno, lblTarefa, lblResultado;
	private JTextField txtTipo, txtAluno;
	private JTextArea txaTarefa, txaResultado;
	private JButton btnCadastrar;
	
	public ComandoGUI() {
		// Instanciei cada JLabel e passei para o construtor um texto Ititulo)
		lblTipo = new JLabel("Tipo");
		lblAluno = new JLabel("Aluno");
		lblTarefa = new JLabel("Tarefa");
		lblResultado = new JLabel("Resultado/Produto");
		
		// Vamos trabalhar agora nas caixas de texto
		txtTipo = new JTextField(45);
		txtAluno = new JTextField(45);
		
		// Vamos trabalhar agora nas caixas de texto grandes
		txaTarefa = new JTextArea(10,40);
		txaResultado = new JTextArea(10,40);
		
		// Vamos agora programar o botão
		btnCadastrar = new JButton("Casdastrar");
		
		// Encolher o gerenciador de layout
		getContentPane().setLayout(new FlowLayout());// Linha
		
		getContentPane() .add(lblTipo);
		getContentPane() .add(txtTipo);
		
		getContentPane() .add(lblAluno);
		getContentPane() .add(txtAluno);
		
		getContentPane() .add(lblTarefa);
		getContentPane() .add(txaTarefa);
		
		getContentPane() .add(lblTarefa);
		getContentPane() .add(txaTarefa);
		
		getContentPane() .add(lblResultado);
		getContentPane() .add(txaResultado);
		
		//2° pilar - propriedades
		setSize(380,500);
		// Deixar o negocio bonito amanhã
		//GridLayout e BouderLayout - Paineis
		
		
		
	}

}
