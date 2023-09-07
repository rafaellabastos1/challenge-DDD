package br.com.fiap.bean;

public class Vistoria {
	private IdentificarCliente cliente;
	private RegistroSeguro seguro;
	private MidiaVistoria fotos;
	
	//Construtor vazio
	public Vistoria() {
		
	}

	//Getters e setters
	public IdentificarCliente getCliente() {
		return cliente;
	}

	public void setCliente(IdentificarCliente cliente) {
		this.cliente = cliente;
	}

	public RegistroSeguro getSeguro() {
		return seguro;
	}

	public void setSeguro(RegistroSeguro seguro) {
		this.seguro = seguro;
	}

	public MidiaVistoria getFotos() {
		return fotos;
	}

	public void setFotos(MidiaVistoria fotos) {
		this.fotos = fotos;
	}
	
	//Método
	public void analisarFotos() {
		
	}
	
	
	
	
}
