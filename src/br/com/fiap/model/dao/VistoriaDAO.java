package br.com.fiap.model.dao;

import java.sql.*;

import br.com.fiap.model.bean.Cadastro;

/*** Classe com atributos e métodos sobre o cpf informado pelo usuário para procurar no banco de dados
 * Atributos sobre o cpf informado pelo usuário
 * @author Douglas Araujo
 * @author Rafaella Bastos
 * @version 2.0
 */


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

	public String inserir(Cadastro cadastro) {
		String sql = "insert into cadastro(cpf) values(?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, cadastro.getCpf());
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
