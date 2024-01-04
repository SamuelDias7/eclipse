package model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DAO {
	//Parametros de Conexão
	//private static String Driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/bdagenda";
	private static String user = "root";
	private static String senha = "makakobala2";
	
	//Metodo de conexão
	private Connection conectar() {
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, senha);
			return con;

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("erro1");
		}
		return null;
	}
	 public void testeConexao() {
		 try {
			Connection con = conectar();
			System.out.println(con);
			con.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("erro 2");
		}
	 }

	
}
