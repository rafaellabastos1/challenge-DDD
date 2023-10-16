package br.com.fiap.dao;

import java.sql.*;

/*** Classe com atributos e métodos sobre o cpf informado pelo usuário para procurar no banco de dados
 * Atributos sobre o cpf informado pelo usuário
 * @author Douglas Araujo
 * @version 1.0
 */

import br.com.fiap.bean.IdentificarCliente;

public class VistoriaDAO {
	private Connection con;

	public VistoriaDAO(Connection con) {
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
