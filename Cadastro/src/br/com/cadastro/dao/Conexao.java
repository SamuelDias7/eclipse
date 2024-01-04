package br.com.cadastro.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	private final static String url = "jdbc:mysql://localhost:3306/cadastro";
	private final static String usuario = "root";
	private final static String senha = "sdh7xpx8521S";
	
	public static Connection Conexao() {
		Connection Conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Conn = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão com o banco de dados realizada com sucesso");
			
			
			
		}catch(ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
			System.out.println("Erro ao se conectar com o banco de dados");
			
		}
		return Conn;
	}

}
