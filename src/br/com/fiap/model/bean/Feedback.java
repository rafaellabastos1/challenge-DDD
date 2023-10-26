package br.com.fiap.model.bean;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos sobre os feedbacks que o cliente dará
 * Atributos sobre os tipos de feedbacks e método que envia o feedback
 * @author Rafaella Bastos
 * @version 3.0
 */

public class Feedback {
	private int tempo;
	private int servicos;
	private int problemas;
	private int atendimentos;
	private int duvidas;

	// Construtor vazio
	public Feedback() {

	}

	// Getters e setters
	
	
	
	/*** Método enviar feedback que envia de uma vez os feedbacks dados pelo cliente
	 * @author Rafaella Bastos
	 */
	//Métodos
	public void enviarFeedback() {
		JOptionPane.showMessageDialog(null, "Feedback enviado com sucesso");
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getServicos() {
		return servicos;
	}

	public void setServicos(int servicos) {
		this.servicos = servicos;
	}

	public int getProblemas() {
		return problemas;
	}

	public void setProblemas(int problemas) {
		this.problemas = problemas;
	}

	public int getAtendimentos() {
		return atendimentos;
	}

	public void setAtendimentos(int atendimentos) {
		this.atendimentos = atendimentos;
	}

	public int getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(int duvidas) {
		this.duvidas = duvidas;
	}
}

