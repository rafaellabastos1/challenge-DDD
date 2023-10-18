package br.com.fiap.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.model.bean.Cliente;
import br.com.fiap.model.dao.Conexao;
import br.com.fiap.model.dao.VistoriaDAO;

public class ClienteController {
	public String insereCliente(String cpf) {
		String resultado;
		Connection con = Conexao.abrirConexao();
		VistoriaDAO vd = new VistoriaDAO(con);
		Cliente cl = new Cliente();
		cl.setCpf(cpf);
		resultado = vd.inserir(cl);
		Conexao.fecharConexao(con);
		return resultado;
	}
	public String buscarCliente(String cpf) throws ClassNotFoundException, SQLException{
		String resultado = "";
		Connection con = Conexao.abrirConexao();
		VistoriaDAO vistd = new VistoriaDAO(con);
		resultado = vistd.identificarCliente(cpf);
		Conexao.fecharConexao(con);
		if (resultado != null ) {
			return resultado;
		} else {
			return "Cliente não encontrado";

		}
	}
}
