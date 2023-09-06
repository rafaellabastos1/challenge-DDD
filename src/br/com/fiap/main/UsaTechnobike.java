package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.RegistroSeguro;
import br.com.fiap.bean.Feedback;
import br.com.fiap.bean.IdentificarCliente;

public class UsaTechnobike {

	public static void main(String[] args) {
		int opcaoMenu = 0;
		int mostrarStatus;
		String aux;
		String escolha = "sim";
		String cpf;
		Boolean aprovado = false, reprovado = false, emAnalise = true, faltandoDoces = false;
		
		IdentificarCliente identCli;
		//RegistroSeguro tpseg = new RegistroSeguro();
		//Feedback fb = new Feedback();
		
		while (escolha.equalsIgnoreCase("sim")) {	
			try {
				aux = JOptionPane.showInputDialog("Olá, em que a Technobike pode te ajudar?" 
												+ "\n1 - Tipos de seguro"
												+ "\n2 - Iniciar processo de vistoria" 
												+ "\n3 - Conferir status da vistoria" 
												+ "\n4 - Feedback" 
												+ "\n5 - Encerrar");
				opcaoMenu = Integer.parseInt(aux);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Resposta inválida!");
			}
			 
			switch (opcaoMenu) {

			//Tipos de seguro
			case 1:
				JOptionPane.showMessageDialog(null, "Essas são as opções de seguro disponibilizadas pela nossa empresa: "
												+ "\n1- Para ciclistas que pedalam na rua"
												+ "\n2- Para ciclistas de maratona"
												+ "\n3- Para ciclistas que pedalam em montanhas"
												+ "\n4- Para ciclistas que pedalam em pedras e rochas"
												+ "\n5- Para ciclistas que pedalam em terra e mato"
												+ "\n6- Para ciclistas por hobbie"
												+ "\n7- Para ciclistas que viajam com a bike");
				break;
				
				
			//Iniciar processo de vistoria	
			case 2:
				cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
				
				identCli = new IdentificarCliente();
				
				identCli.encontrarCliente();
				//JOptionPane.showMessageDialog(null, "Escolha o tipo de seguro");
				//tpseg.selecionaSeguro();
				//aux = JOptionPane.showInputDialog("Os seus dados foram enviados para vistoria. Você pode acompanhar o atual status da análise pelo seu e-mail ou aqui pelo site." 
				//								+ "Deseja conferir o status da análise da vistoria? \n1 - Sim \n2 - Não");
				//mostrarStatus = Integer.parseInt(aux);
				//if (mostrarStatus == 1) {	
				//} else {
				//	JOptionPane.showMessageDialog(null, "Ok. Acompanhe no seu email ou nessa tela o atual status da sua vistoria para saber as informações de como prosseguir.");
				//}
				//break;
		
				
			//Conferir status da vistoria
			case 3:
				
					
			//Feedback
			case 4: 
				fb.enviaFeedback();
				break;
			
				
			//Encerrar
			case 5:
				escolha = JOptionPane.showInputDialog("Deseja continuar? ");
				if (escolha.equalsIgnoreCase("Sim")) {
					JOptionPane.showMessageDialog(null, "Voltando ao menu");
				}
				else {
				JOptionPane.showMessageDialog(null, "Encerrando, até logo!");
				}
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				
			

			

		}
	}
}
}
