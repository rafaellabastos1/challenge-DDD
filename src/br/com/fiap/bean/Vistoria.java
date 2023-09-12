package br.com.fiap.bean;

/*** Classe com atributos e métodos que analisará as fotos enviadas para a vistoria e retornará o resultado
 * Atributos sobre as informações necessárias para realizar a vistoria que estão presentes em outras classes
 * @author Luiz Fillipe
 * @version 1.0
 */

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
	
	/*** Método analisarFotos que analisará os arquivos enviados para a vistoria e retornará seu resultado
	 * No momento ainda não é funcional, pois ainda não há como realizar a análise das fotos
	 * @author Luiz Fillipe
	 */
	public void analisarFotos() {
		cliente = new IdentificarCliente();
		seguro = new RegistroSeguro();
		fotos = new MidiaVistoria();
	}
}
