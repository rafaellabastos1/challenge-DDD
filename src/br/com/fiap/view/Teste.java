package br.com.fiap.view;

import javax.swing.JOptionPane;

import br.com.fiap.controller.ClienteController;

public class Teste {
	public static void main(String[] args) {
		String escolha = "sim", cpf;
		ClienteController cliente = new ClienteController();
		while (escolha.equalsIgnoreCase("sim")) {
			try {
				cpf = JOptionPane.showInputDialog("CPF: ");
				System.out.println(cliente.insereCliente(cpf));
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar?");
		}
		JOptionPane.showMessageDialog(null, "Fim de programa");
	}
}
