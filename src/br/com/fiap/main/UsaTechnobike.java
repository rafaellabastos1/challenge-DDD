package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.bean.RegistroSeguro;
import br.com.fiap.bean.StatusVistoria;
import br.com.fiap.bean.Feedback;
import br.com.fiap.bean.IdentificarCliente;
import br.com.fiap.bean.MidiaVistoria;

public class UsaTechnobike {

	public static void main(String[] args) {
		int opcaoMenu = 0, mostrarStatus, opcSeguro, opcFeedback, confirFeedback;
		String aux, escolha = "sim", cpf;
		
		String bikeInteira, numSerie, roda, freios, guidao, pedais, corrente, clienteBike, bikeFrente, acessorios;
		String videoBike, videoPartes;
		Boolean aprovado = false, reprovado = false, emAnalise = true, faltandoDoces = false;
		String tempo, servicos, problemas, atendimentos, duvidas;
		
		IdentificarCliente identCli;
		MidiaVistoria arqVis;
		RegistroSeguro regSeg;
		StatusVistoria andamento;
		Feedback opiniao;
		
		
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
				//Identificar cliente
				cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
				
				identCli = new IdentificarCliente();
				identCli.setCpf(cpf);
				identCli.encontrarCliente();
				
				//Registrar tipo de seguro
				regSeg = new RegistroSeguro();
				
				aux = JOptionPane.showInputDialog("Selecione um tipo de seguro: "
												+ "\n1- Para ciclistas que pedalam na rua"
												+ "\n2- Para ciclistas de maratona" 
												+ "\n3- Para ciclistas que pedalam em montanhas"
												+ "\n4- Para ciclistas que pedalam em pedras e rochas"
												+ "\n5- Para ciclistas que pedalam em terra e mato"
												+ "\n6- Para ciclistas por hobbie" 
												+ "\n7- Para ciclistas que viajam com a bike");				
				opcSeguro = Integer.parseInt(aux);
				
				regSeg.setOpcSeguro(opcSeguro);
				regSeg.selecionaSeguro();
				
				//Receber as mídias da vistoria
				JOptionPane.showMessageDialog(null, "Para finalizar a vistoria é necessário que sejam tiradas: "  
			            						+ "\n-Foto da bike inteira de lado"
			            						+ "\n-Foto do número de série"
			            						+ "\n-Foto da roda"
			            						+ "\n-Foto dos freios"
			            						+ "\n-Foto do guidão"
			            						+ "\n-Foto dos pedais"
			            						+ "\n-Foto da corrente"
			            						+ "\n-Foto sua com a bike"
			            						+ "\n-Foto da bike de frente"
			            						+ "\n-Foto dos acessórios (se for visível)"
			            						+ "\n-Vídeo mostrando a bike completa"
			            						+ "\n-Vídeo mostrando com mais ênfase cada ponto chave que foi tirado foto");
				
				JOptionPane.showMessageDialog(null, "Aviso: ainda não é possível enviar, de fato, arquivos");
				
				arqVis = new MidiaVistoria();
				
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto da bike inteira: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto do número de série: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto das rodas: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto dos freios: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto do guidão: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto dos pedais: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie a foto da corrente: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie uma foto sua junto com a bike: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie uma foto da bike de frente: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie uma foto dos acessórios: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie um vídeo mostrando a bike no geral: "));
				arqVis.confirmarArquivo(JOptionPane.showInputDialog("Envie um vídeo completo da bike mostrando todas as partes ditas anteriormente: "));
				
				//Segmento
				JOptionPane.showMessageDialog(null, "Os seus dados foram enviados para vistoria. Você pode acompanhar o atual status" 
													+ " da análise pelo seu e-mail ou aqui pelo site.");
				aux = JOptionPane.showInputDialog("Deseja conferir o status da análise da vistoria?" 
												+ "\n1. Sim" 
												+ "\n2. Não");
				mostrarStatus = Integer.parseInt(aux);
				
				if (mostrarStatus == 1) {
					andamento = new StatusVistoria();
					andamento.resultado();
				} else if (mostrarStatus == 2) {
					JOptionPane.showMessageDialog(null, "Ok. Acompanhe no seu e-mail ou nessa tela o atual status da sua vistoria para" 
														+ "saber as informações de como prosseguir!");
				} else {
					JOptionPane.showMessageDialog(null, "Opção incorreta");
				}
				
				break;
		
				
			//Conferir status da vistoria
			case 3:
				//Identificar cliente
				cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
				
				identCli = new IdentificarCliente();
				identCli.encontrarCliente();
				
				//Status da vistoria
				andamento = new StatusVistoria();
				andamento.resultado();
				
				break;
				
					
			//Feedback
			case 4: 
				try {
					//Tempo
					tempo = JOptionPane.showInputDialog("Digite seu feedback para tempo");
					aux = JOptionPane.showInputDialog("O feedback está correto?" 
													+ "\nSeu feedback: " + tempo 
													+ "\n1. Sim "
													+ "\n2. Não");
					confirFeedback = Integer.parseInt(aux);
					
					//Serviços
					servicos = JOptionPane.showInputDialog("Digite seu feedback para serviços prestados");
					aux = JOptionPane.showInputDialog("O feedback está correto?" 
													+ "\nSeu feedback: " + servicos 
													+ "\n1. Sim "
													+ "\n2. Não");
					confirFeedback = Integer.parseInt(aux);
					
					//Problemas
					problemas = JOptionPane.showInputDialog("Digite seu feedback para problemas");
					aux = JOptionPane.showInputDialog("O feedback está correto?" 
													+ "\nSeu feedback: " + problemas 
													+ "\n1. Sim "
													+ "\n2. Não");
					confirFeedback = Integer.parseInt(aux);
				
					//Atendimentos
					atendimentos = JOptionPane.showInputDialog("Digite seu feedback para atendimento");
					aux = JOptionPane.showInputDialog("O feedback está correto?" 
													+ "\nSeu feedback: " + atendimentos 
													+ "\n1. Sim "
													+ "\n2. Não");
					confirFeedback = Integer.parseInt(aux);
					
					//Dúvidas
					duvidas = JOptionPane.showInputDialog("Digite seu feedback para resolução de duvidas");
					aux = JOptionPane.showInputDialog("O feedback está correto?" 
													+ "\nSeu feedback: " + duvidas 
													+ "\n1. Sim "
													+ "\n2. Não");
					confirFeedback = Integer.parseInt(aux);
					
					opiniao = new Feedback();
					opiniao.enviarFeedback();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
				break;
			
				
			//Encerrar
			case 5:
				JOptionPane.showMessageDialog(null, "Fim de programa, até a próxima");
				break;
				
			//Opção inválida
			default:
				JOptionPane.showMessageDialog(null, "Digite uma opção válida");
			}
			escolha = JOptionPane.showInputDialog("Deseja continuar? ");
		}
		JOptionPane.showMessageDialog(null, "Fim de programa, até a próxima");
	}
}
