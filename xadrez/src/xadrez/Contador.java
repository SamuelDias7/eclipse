package xadrez;

import javax.swing.JOptionPane;

public class Contador {
	String liberadovar = "liberado";
	//SE N FUNCIONAR É PQ PRECISA INICIALIZAR
	String jogador;
	int rodada = 1;

	public Contador(int contador, String liberado) {
		// TODO Auto-generated constructor stub
		liberado = this.liberadovar;
		
		
		
		//JOptionPane.showMessageDialog(null, "LIBERADO É IGUAL A:" + liberadovar);
		

		
		
		for(liberadovar = liberado; liberado == "liberado";) {
			
			JOptionPane.showMessageDialog(null, "BOTÃO PRESIONADO");

						
			for(jogador = "jogador1";liberado == "liberado";jogador = "jogador2") {
				
				liberado = "bloqueado temporariamente";			
				
				
				
				//JOptionPane.showMessageDialog(null, "ENTREI");
			
			}
			
			liberadovar = liberado;
			
			while(liberadovar.equals("liberado")){
				JOptionPane.showMessageDialog(null, "aaaaaaa");
			}
			
			
			
		
			
			
			
			
			new Principal(0,jogador);
			
			
			
			

			
		}

	
	}
	

}
