package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.model.bean.Cliente;



/*** Classe com atributos e métodos sobre o cpf informado pelo usuário para procurar no banco de dados
 * Atributos sobre o cpf informado pelo usuário
 * @author Douglas Araujo
 * @author Rafaella Bastos
 * @version 2.0
 */


public class VistoriaDAO {
	private Connection con;

	//Construtor com passagem de parâmetro
	public VistoriaDAO(Connection con) {
		this.con = con;
	}

	//Getters e setters

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public String inserir(Cliente cliente) {
		String sql = "insert into challenge(cpf)values(?)";
		try {
			//PreparedStatement ps = getCon().prepareStatement(sql);
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cliente.getCpf());
			if (ps.executeUpdate() > 0) {
				return "inserido com sucesso";
			} else {
				return "erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
