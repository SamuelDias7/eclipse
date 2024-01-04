// Definição do pacote
package br.com.senaitagua.sa1.app8;

import java.awt.FlowLayout;

// importação do pacote
import javax.swing.*;

// Herdando a classe JFrame
public class TelaAposentadoria extends JFrame { //herança
	
	// Definindo um componente swing título
	JLabel titulo;
	// Definindo componente swing -botões
	JButton btnGravar,btnLer,btnLimpar;
	
	// Definindo uma caixa de texto para strings longas
	JTextArea txtArea;
	
	public TelaAposentadoria() {
		// Referenciando o pai (superclasse)
		super("Aplicativo 8");
		getContentPane().setLayout(new FlowLayout());
		// Instanciação do objeto título
		titulo = new JLabel("aplicativo 8- Aposentadoria do Piloto");
		// Instanciação dos botões
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnLimpar = new JButton("Limpar");
		// Instanciação da area do texto
		// (Linha,coluna)
		txtArea = new JTextArea(5,10);
		getContentPane().add(titulo);
		getContentPane().add(txtArea);
		getContentPane().add(btnGravar);
		getContentPane().add(btnLer);
		getContentPane().add(btnLimpar);
		setSize(800,600);
		
		
	}
	

}
