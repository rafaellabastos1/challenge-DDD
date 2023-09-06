package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class RegistroSeguro {
	private int opcSeguro;
	int confirTpSeguro = 2;
	String aux;
	String tpSeg1 = "1- Para ciclistas que pedalam na rua";
	String tpSeg2 = "2- Para ciclistas de maratona";
	String tpSeg3 = "3- Para ciclistas que pedalam em montanhas";
	String tpSeg4 = "4- Para ciclistas que pedalam em pedras e rochas";
	String tpSeg5 = "5- Para ciclistas que pedalam em terra e mato";
	String tpSeg6 = "6- Para ciclistas por hobbie";
	String tpSeg7 = "7- Para ciclistas que viajam com a bike";

	public RegistroSeguro() {
	}

	public int getOpcSeguro() {
		return opcSeguro;
	}

	public void setOpcSeguro(int opcSeguro) {
		this.opcSeguro = opcSeguro;
	}
	
	public void selecionaSeguro() {
		while (confirTpSeguro == 2) {
			try {
				aux = JOptionPane.showInputDialog("Selecione um tipo de seguro: "
											+ "\n1- Para ciclistas que pedalam na rua"
											+ "\n2- Para ciclistas de maratona"
											+ "\n3- Para ciclistas que pedalam em montanhas"
											+ "\n4- Para ciclistas que pedalam em pedras e rochas"
											+ "\n5- Para ciclistas que pedalam em terra e mato"
											+ "\n6- Para ciclistas por hobbie"
											+ "\n7- Para ciclistas que viajam com a bike");
				opcSeguro = Integer.parseInt(aux);
				if(opcSeguro == 1) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg1 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 2) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg2 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 3) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg3 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 4) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg4  + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 5) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg5 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 6) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg6 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else if(opcSeguro == 7) {
					aux = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" + "\n" + tpSeg7 + "\n1 - SIm \n 2 - Não"); 
					confirTpSeguro = Integer.parseInt(aux);
					if(confirTpSeguro == 1) {
						JOptionPane.showMessageDialog(null, "Seguro selecionado!");
					}else {
							JOptionPane.showMessageDialog(null, "Selecione novamente.");
						}
				}
				else {
					JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
				}
			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Resposta inválida!");
			
			}
			
		}
		
	}
	
}
