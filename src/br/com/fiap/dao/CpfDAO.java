package br.com.fiap.dao;

import java.sql.*;

import br.com.fiap.bean.IdentificarCliente;

public class CpfDAO {
	private Connection con;

	public CpfDAO(Connection con) {
		setCon(con);
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String inserir(IdentificarCliente ic) {
		String sql = "insert into ic(cpf)values(?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, ic.getCpf());
			if (ps.executeUpdate() > 0) {
				return "CPF inserido com sucesso!";
			} else {
				return "Erro ao inserir CPF...";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
