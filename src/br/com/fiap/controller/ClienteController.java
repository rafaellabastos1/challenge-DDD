package br.com.fiap.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.model.bean.Cliente;
import br.com.fiap.model.bean.Feedback;
import br.com.fiap.model.bean.MidiaVistoria;
import br.com.fiap.model.bean.RegistroSeguro;
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
	
	
	public String insereDadosVistoria(String cpf, int opcSeguro, String bikeInteira, String numSerie, String roda, String freios,
					String guidao, String pedais, String corrente, String clienteBike, String bikeFrente, String acessorios, String videoBike,
					String videoPartes) { 
		String resultado;
		Connection con = Conexao.abrirConexao();
		VistoriaDAO vd = new VistoriaDAO(con);
		Cliente cl = new Cliente();
		MidiaVistoria mv = new MidiaVistoria();
		RegistroSeguro rs = new RegistroSeguro();
		cl.setCpf(cpf);
		rs.setOpcSeguro(opcSeguro);
		mv.setBikeInteira(bikeInteira);
		mv.setNumSerie(numSerie);
		mv.setRoda(roda);
		mv.setFreios(freios);
		mv.setGuidao(guidao);
		mv.setPedais(pedais);
		mv.setCorrente(corrente);
		mv.setClienteBike(clienteBike);
		mv.setBikeFrente(bikeFrente);
		mv.setAcessorios(acessorios);
		mv.setVideoBike(videoBike);
		mv.setVideoPartes(videoPartes);
		resultado = vd.inserirDadosVistoria(cl, rs, mv);
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
	public String insereFeedback(String cpf, String tempo, String servicos, String problemas, String atendimentos, String duvidas) throws SQLException {
		String resultado;
		Connection con = Conexao.abrirConexao();
		VistoriaDAO vd = new VistoriaDAO(con);
		Cliente cl = new Cliente();
		Feedback fb = new Feedback();
		cl.setCpf(cpf);
		fb.setTempo(tempo);
		fb.setServicos(servicos);
		fb.setProblemas(problemas);
		fb.setAtendimentos(atendimentos);
		fb.setDuvidas(duvidas);
		resultado = vd.inserirFeedback(cl, fb);
		Conexao.fecharConexao(con);
		return resultado;
		
		
		
	}
}
