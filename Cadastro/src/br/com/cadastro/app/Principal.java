package br.com.cadastro.app;

import br.com.cadastro.dao.Conexao;
import br.com.cadastro.dao.ConexaoDAO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciando objetos
		Conexao obj = new Conexao();
		ConexaoDAO obj2 = new ConexaoDAO();
		
		obj.Conexao();
		obj2.Mensagem();
		

	}

}
