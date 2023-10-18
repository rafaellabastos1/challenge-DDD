package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fiap.model.bean.Cliente;



/*** Classe com atributos e métodos sobre o cpf informado pelo usuário para procurar no banco de dados
 * Atributos sobre o cpf informado pelo usuário
 * @author Douglas Araujo
 * @author Rafaella Bastos
 * @version 2.0
 */


public class VistoriaDAO implements IDAO{
	private Connection con;
	private Cliente cliente;

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
	
	public String inserir(Object obj) {
		cliente = (Cliente) obj;
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
	public String identificarCliente(String cpf) throws SQLException{
		String sql = "select * from challenge where cpf = ?";
		String sucesso = "Cliente encontrado!";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return sucesso;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
