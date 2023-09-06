package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class DocBike {
	private String nomeFoto;
	String aux;
	int confirFoto = 2;
	public DocBike() {
	}

	public String getNomeFoto() {
		return nomeFoto;
	}

	public void setNomeFoto(String nomeFoto) {
		this.nomeFoto = nomeFoto;
	}
	
	public void confirmarArquivo() {
		while (confirFoto == 2) {
			try {
				nomeFoto = JOptionPane.showInputDialog("Informe a foto dos documentos da bike: ");
				aux = JOptionPane.showInputDialog("Está correto?" + "\n" + nomeFoto + "\n1 - Sim \n2 - Não");
				confirFoto = Integer.parseInt(aux);
				if (confirFoto == 1) {
					JOptionPane.showMessageDialog(null, "Foto adicionada!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Envie novamente a foto");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Rsposta inválida!");
			}
		}
	}

}
