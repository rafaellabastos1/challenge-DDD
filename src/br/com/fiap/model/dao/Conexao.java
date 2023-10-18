package br.com.fiap.model.dao;

import java.sql.*;

/*** Classe que abre e fecha conexão com o banco de dados SQL Developer
 * @author Douglas Araujo
 * @author Rafaella Bastos
 * @version 2.0
 */
 
public class Conexao {

	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin@oracle.fiap.com.br:1521:ORCL";
			final String USER = "rm99519";
			final String PASS = "010205";
			con = DriverManager.getConnection(url, USER, PASS);
			System.out.println("Conexão Aberta!");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return con;
	}
	
	public static void fecharConexao(Connection con) {
		try {
			con.close();
			System.out.println("Conexao Fechada!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
