package br.com.fiap.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.model.bean.Feedback;
import br.com.fiap.model.bean.MidiaVistoria;
import br.com.fiap.model.bean.RegistroSeguro;

public interface IDAO {
	public String inserir(Object obj) throws SQLException;
	public String inserirDadosVistoria(Object obj, RegistroSeguro rs, MidiaVistoria mv) throws SQLException;
	public ArrayList<String> buscarCliente(String chave) throws SQLException;
}
