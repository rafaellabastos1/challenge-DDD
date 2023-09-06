package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class VideoBike {
	private String nomeVideo;
	String aux;
	int confirFoto = 2;
	public VideoBike() {
	}

	public String getNomeFoto() {
		return nomeVideo;
	}

	public void setNomeFoto(String nomeFoto) {
		this.nomeVideo = nomeFoto;
	}
	
	public void confirmarArquivo() {
		while (confirFoto == 2) {
			try {
				nomeVideo = JOptionPane.showInputDialog("Informe a foto dos documentos da bike: ");
				aux = JOptionPane.showInputDialog("Está correto?" + "\n" + nomeVideo + "\n1 - Sim \n2 - Não");
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
