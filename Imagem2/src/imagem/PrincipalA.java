package imagem;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon imagem = new ImageIcon (PrincipalA.class.getResource("coracao.png"));
		JLabel label = new JLabel(imagem);
		
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		frame.add(label);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		

	}

}
