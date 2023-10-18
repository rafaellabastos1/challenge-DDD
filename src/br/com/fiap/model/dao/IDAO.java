package br.com.fiap.model.dao;

import java.sql.SQLException;

public interface IDAO {
	public String inserir(Object obj) throws SQLException;
	public String identificarCliente(Object obj) throws SQLException;
}
