package br.com.fiap.model.bean;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos sobre os feedbacks que o cliente dará
 * Atributos sobre os tipos de feedbacks e método que envia o feedback
 * @author Rafaella Bastos
 * @version 3.0
 */

public class Feedback {
	private String tempo;
	private String servicos;
	private String problemas;
	private String atendimentos;
	private String duvidas;

	// Construtor vazio
	public Feedback() {

	}

	// Getters e setters
	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getServicos() {
		return servicos;
	}

	public void setServicos(String servicos) {
		this.servicos = servicos;
	}

	public String getProblemas() {
		return problemas;
	}

	public void setProblemas(String problemas) {
		this.problemas = problemas;
	}

	public String getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(String atendimentos) {
		this.atendimentos = atendimentos;
	}

	public String getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(String duvidas) {
		this.duvidas = duvidas;
	}
	
	/*** Método enviar feedback que envia de uma vez os feedbacks dados pelo cliente
	 * @author Rafaella Bastos
	 */
	
	//Métodos
	public void enviarFeedback() {
		JOptionPane.showMessageDialog(null, "Feedback enviado com sucesso");
	}
}

