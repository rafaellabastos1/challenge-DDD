package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Feedback {
	private String tempo;
	private String servicos;
	private String problemas;
	private String atendimentos;
	private String duvidas;
	
	//Construtor vazio
	public Feedback() {
		
	}
	
	//Getters e setters
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
	
	public void enviarFeedback() {
		int opcFeedback, confirFeedback;
			if (opcFeedback == 1 ) {
				if (confirFeedback == 1) {
					JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
				}
				else {
					JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
			}
			else if (opcFeedback == 2) {
					if (confirFeedback == 1) {
						JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
			}
			else if (opcFeedback == 3) {
					if (confirFeedback == 1) {
						JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
			}
			else if (opcFeedback == 4) {
					if (confirFeedback == 1) {
						JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
			}
			else if(opcFeedback == 5) {
					if (confirFeedback == 1) {
						JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
			} else {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				confirFeedback = 2;
			}
		}
}