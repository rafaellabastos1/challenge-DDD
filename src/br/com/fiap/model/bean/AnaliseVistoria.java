package br.com.fiap.model.bean;

/*** Classe com atributos e métodos que analisará as fotos enviadas para a vistoria e retornará o resultado
 * Atributos sobre as informações necessárias para realizar a vistoria que estão presentes em outras classes
 * @author Luiz Fillipe
 * @author Rafaella Bastos
 * @version 2.0
 */

public class AnaliseVistoria {
	private MidiaVistoria fotos;
	
	//Construtor vazio
	public AnaliseVistoria() {
		
	}

	//Getters e setters
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
		fotos = new MidiaVistoria();
	}
}
