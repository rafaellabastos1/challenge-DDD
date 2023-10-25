package br.com.fiap.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fiap.model.bean.Cliente;
import br.com.fiap.model.bean.MidiaVistoria;
import br.com.fiap.model.bean.RegistroSeguro;


/*** Classe com atributos e métodos sobre o cpf informado pelo usuário para procurar no banco de dados
 * Atributos sobre o cpf informado pelo usuário
 * @author Douglas Araujo
 * @author Luiz Fillipe
 * @author Rafaella Bastos
 * @version 2.0
 */


public class VistoriaDAO implements IDAO{
	private Connection con;
	private Cliente cliente;
	private MidiaVistoria midia;
	private RegistroSeguro registro;
	

	//Construtor com passagem de parâmetro
	public VistoriaDAO(Connection con) {
		this.con = con;
		this.registro = new RegistroSeguro(); 
		this.midia = new MidiaVistoria();
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
	
	
	public String inserirDadosVistoria(Object obj, RegistroSeguro rs, MidiaVistoria mv) {
		cliente = (Cliente) obj;
		midia = (MidiaVistoria) mv;
		registro = (RegistroSeguro) rs;
		String sql = "insert into challenge_vistoria (cpf, tipo_seguro, ft_bk_inteira, ft_bk_nmSerie, ft_bk_rodas, ft_bk_freios, ";
		sql += "ft_bk_guidao, ft_bk_pedais, ft_bk_corrente, ft_bk_selfie, ft_bk_frente, ft_bk_acessorio, vd_bk_geral, vd_bk_partes, status_vistoria)";
		sql += "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,'Em Ánalise')";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cliente.getCpf());
			ps.setInt(2, registro.getOpcSeguro());
			ps.setString(3, midia.getBikeInteira());
			ps.setString(4, midia.getNumSerie());
			ps.setString(5, midia.getRoda());
			ps.setString(6, midia.getFreios());
			ps.setString(7, midia.getGuidao());
			ps.setString(8, midia.getPedais());
			ps.setString(9, midia.getCorrente());
			ps.setString(10, midia.getClienteBike());
			ps.setString(11, midia.getAcessorios());
			ps.setString(12, midia.getVideoBike());
			ps.setString(13, midia.getVideoPartes());
			ps.setString(14, midia.getBikeInteira());
			
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
		String sql = "select count(*) from challenge where cpf = ?";
		String sucesso = "Cliente encontrado!";
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return sucesso;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
