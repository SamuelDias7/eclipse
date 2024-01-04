package br.com.contoso.dto;

public class FuncionarioHorista extends Funcionario {
	
	private int qtdeHoras;
	

	public FuncionarioHorista(int qtdeHoras) {
		super();
		this.qtdeHoras = qtdeHoras;
	}

	public int getQtdeHoras() {
		return qtdeHoras;
	}

	public void setQtdeHoras(int qtdeHoras) {
		this.qtdeHoras = qtdeHoras;
	}

	@Override
	public void verificarEntradaFunc() {
		// TODO Auto-generated method stub
		
	}

}
