package br.com.fiap.bean;

import javax.swing.JOptionPane;

/*** Classe com atributos e métodos que acessarão o cpf do cliente no banco de dados e verificará se ele está lá
 * Atributos para o cpf e método que verificará sua existência
 * @author Rafaella Bastos
 * @version 1.0
 */

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
	/*** Método encontrar cliente verifica se o cpf digitado está no sistema
	 * Ele retorna sempre true pois no momento o banco de dados ainda não é totalmente funcional
	 * @author Rafaella Bastos
	 */
	public void encontrarCliente() {
		boolean cpfEncontrado = true;
		if (cpfEncontrado) {
			JOptionPane.showMessageDialog(null, "Olá, seja bem vindo");
		} else {
			JOptionPane.showMessageDialog(null, "CPF não encontrado. Faça seu cadastro e contrate um seguro para sua bike!");
		}
	}
}


