package testeBO;

import br.com.teste.*;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instanciando objetos
		usuario objeto = new usuario();
		
		
		// DeclçaraçÕ de Array
		Object[] continuar = {"Continuar","ffg"};
		Object valor;
		Object[] opcao = {"Consultar a qntd de carros", "Atualizar qtde","Sair"};
		Object valorOpcao;
				
		
		objeto.setNome(JOptionPane.showInputDialog("Informe o seu nome"));
		objeto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informa sua idade:")));
		objeto.setCarros(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de aviões:")));
		
		do{
			// Entrada de dados
						
			
			
			valorOpcao = JOptionPane.showInputDialog(null, "Escolha a opção desejada", "Escolha:",JOptionPane.INFORMATION_MESSAGE,null,opcao,opcao);
			
			if(valorOpcao == "Consultar a qntd de carros") {
				JOptionPane.showMessageDialog(null, objeto.getCarros());
			}	
			else if(valorOpcao == "Atualizar qtde") {
				JOptionPane.showMessageDialog(null, objeto.Subtrair());
				
				objeto.menos = Integer.parseInt(JOptionPane.showInputDialog("Informe o quanto quer subtrair:"));
				JOptionPane.showMessageDialog(null, objeto.Subtrair());
			}
		
		}while(valorOpcao != "Sair");

	}

}

