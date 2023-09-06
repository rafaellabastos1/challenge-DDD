package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class Feedback {
	private String tempo;
	private String servicos;
	private String problemas;
	private String atendimentos;
	private String duvidas;
	String aux;
	int opcFeedback;
	int confirFeedback = 2;
	public Feedback() {
	}
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
	public void enviaFeedback() {
		while (confirFeedback == 2) {
			try {
				aux = JOptionPane.showInputDialog("Qual o motivo do feedback?" + "\n1 - Tempo \n2 - Serviços \n3 - Problemas \n4 - Atendimentos \n5 - Dúvidas");
				opcFeedback = Integer.parseInt(aux);
				if (opcFeedback == 1 ) {
			
					tempo = JOptionPane.showInputDialog("Digite seu feedback");
					aux = JOptionPane.showInputDialog("O feedback está correto?" + "\n" + tempo + "\n1 - Sim \n2 - Não");
					confirFeedback = Integer.parseInt(aux);
					if (confirFeedback == 1) {
						JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
					}
				}
				else if (opcFeedback == 2) {
					 servicos = JOptionPane.showInputDialog("Digite seu feedback");
					 aux = JOptionPane.showInputDialog("O feedback está correto?" + "\n" + servicos + "\n1 - Sim \n2 - Não");
						confirFeedback = Integer.parseInt(aux);
						if (confirFeedback == 1) {
							JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
						}
						else {
							JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
						}
				}
				else if (opcFeedback == 3) {
					  problemas = JOptionPane.showInputDialog("Digite seu feedback");
					  aux = JOptionPane.showInputDialog("O feedback está correto?" + "\n" + problemas + "\n1 - Sim \n2 - Não");
						confirFeedback = Integer.parseInt(aux);
						if (confirFeedback == 1) {
							JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
						}
						else {
							JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
						}
				}
				else if (opcFeedback == 4) {
					 atendimentos = JOptionPane.showInputDialog("Digite seu feedback");
					 aux = JOptionPane.showInputDialog("O feedback está correto?" + "\n" + atendimentos + "\n1 - Sim \n2 - Não");
						confirFeedback = Integer.parseInt(aux);
						if (confirFeedback == 1) {
							JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
						}
						else {
							JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
						}
				}
				else if(opcFeedback == 5) {
					 duvidas = JOptionPane.showInputDialog("Digite seu feedback");
					 aux = JOptionPane.showInputDialog("O feedback está correto?" + "\n" + duvidas + "\n1 - Sim \n2 - Não");
						confirFeedback = Integer.parseInt(aux);
						if (confirFeedback == 1) {
							JOptionPane.showMessageDialog(null, "Feedback adicionado com sucesso!");
						}
						else {
							JOptionPane.showInternalMessageDialog(null, "Faça o feedback novamente.");
						}
				}
				else {
					JOptionPane.showMessageDialog(null, "Digite uma opção válida");
					confirFeedback = 2;
				}
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Resposta inválida!");
			}
		}
	}
	
}
