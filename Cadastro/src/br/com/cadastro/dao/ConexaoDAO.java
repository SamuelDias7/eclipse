package br.com.cadastro.dao;

import javax.swing.JOptionPane;

import br.com.cadastro.pojo.Usuario;

import java.sql.*;

public class ConexaoDAO {
	
	Usuario obj1 = new Usuario();
	
	public void Mensagem() {	
		obj1.setNome(JOptionPane.showInputDialog("Informe o nome:"));
		String idade = JOptionPane.showInputDialog("Informe a idade");
		obj1.setIdade(Integer.parseInt(idade));
		obj1.setBanda(JOptionPane.showInputDialog("Informe a sua banda favorita:"));
		
		JOptionPane.showMessageDialog(null, obj1.getNome() + "\n" + obj1.getIdade() + "\n" + obj1.getBanda());
		
		// Cria uma conexão com o banco de dados
		Connection Conn = Conexao.Conexao();
		
		// Criar uma instrução SQL Insert
		String sql = "INSERT INTO usuario (nome, idade, banda) VALUES (?, ?, ?)";
		
		try {
			// Criar um objeto Pre com instrução sql
			PreparedStatement stmt = Conn.prepareStatement(sql);
			
			stmt.setString(1, obj1.getNome());
			stmt.setInt(2, obj1.getIdade());
			stmt.setString(3, obj1.getBanda());
			
			// Executar a instrução sql insert
			int resultado = stmt.executeUpdate();
			
			
			if(resultado > 0 ) {
				System.out.println("Dados inseridos com sucesso");
				
			}else {
				System.out.println("Erro ao inserir dados");
			}
			
			// fechar o objeto PreparedStatement e a conexão com o banco de dados
			stmt.close();
			Conn.close();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro");
			
		

		}
	

	}

}
