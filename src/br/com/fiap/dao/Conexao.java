package br.com.fiap.dao;

import java.sql.*;

public class Conexao {

	public static Connection abrirConexao() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin@oracle.fiap.com.br:1521:ORCL";
			final String USER = "rm552008";
			final String PASS = "fiap23";
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
