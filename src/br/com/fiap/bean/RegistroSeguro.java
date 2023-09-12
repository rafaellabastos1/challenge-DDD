package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class RegistroSeguro {
	private int opcSeguro;

	//Construtor vazio
	public RegistroSeguro() {
		
	}
	
	//Getters e setters
	public int getOpcSeguro() {
		return opcSeguro;
	}

	public void setOpcSeguro(int opcSeguro) {
		this.opcSeguro = opcSeguro;
	}
	
	//Método
	public void selecionaSeguro() {
		int confirTpSeguro = 2;

        while (confirTpSeguro != 1) {
            if (opcSeguro >= 1 && opcSeguro <= 7) {
                String correto = JOptionPane.showInputDialog(null, "O tipo de seguro está correto?" 
                        									+ "\nSeguro escolhido: " + opcSeguro
                        									+ "\n1 - Sim "
                        									+ "\n2 - Não"); 
                confirTpSeguro = Integer.parseInt(correto);
                if (confirTpSeguro == 1) {
                    JOptionPane.showMessageDialog(null, "Seguro selecionado!");
                } else if (confirTpSeguro == 2) {
                	String incorreto = JOptionPane.showInputDialog("Selecione um novo tipo de seguro: " 
                            									+ "\n1- Para ciclistas que pedalam na rua"
                            									+ "\n2- Para ciclistas de maratona" 
                            									+ "\n3- Para ciclistas que pedalam em montanhas"
                            									+ "\n4- Para ciclistas que pedalam em pedras e rochas"
                            									+ "\n5- Para ciclistas que pedalam em terra e mato"
                            									+ "\n6- Para ciclistas por hobbie" 
                            									+ "\n7- Para ciclistas que viajam com a bike");				
                    opcSeguro = Integer.parseInt(incorreto);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma opção válida!");
            }
        }
	} 
}


