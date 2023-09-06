package br.com.fiap.bean;

import javax.swing.JOptionPane;

public class IdentificarCliente {
	private String cpf;

	//Construtor vazio
	public IdentificarCliente() {

	}

	//Getters e setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Método
	//A fazer: tem que fazer a verificação se o cpf digitado está no sistema (tem que retornar sempre true)
	public void encontrarCliente() {
		if (cpf == true) {
			JOptionPane.showMessageDialog(null, "Olá, seja bem vindo");
		} else {
			JOptionPane.showMessageDialog(null, "CPF não encontrado. Faça seu cadastro e contrate um seguro para sua bike!");
		}
	}
	
	
	
}
