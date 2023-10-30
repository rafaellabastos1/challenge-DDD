package br.com.fiap.view;

import java.sql.SQLException;

import javax.swing.JOptionPane;


import br.com.fiap.controller.ClienteController;
import br.com.fiap.model.bean.Feedback;
import br.com.fiap.model.bean.MidiaVistoria;
import br.com.fiap.model.bean.RegistroSeguro;
import br.com.fiap.model.bean.StatusVistoria;

public class UsaTechnobike {

	public static void main(String[] args) {
		int opcaoMenu = 0;
		int mostrarStatus;
		
		int opcSeguro;
		
		String aux;
		String escolha = "sim";
		String cpf;
		
		String tempo;
		String servicos;
		String problemas;
		String atendimentos;
		String duvidas;
		String bikeInteira;
		String numSerie;
		String roda;
		String freios;
		String guidao;
		String pedais;
		String corrente;
		String clienteBike;
		String bikeFrente;
		String acessorios;
		String videoBike;
		String videoPartes;
		
		MidiaVistoria arqVis;
		RegistroSeguro regSeg;
		StatusVistoria andamento;
		Feedback opiniao;
		ClienteController cliente;
		
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
				cliente = new ClienteController();
				System.out.println(cliente.insereCliente(cpf));
				
				JOptionPane.showMessageDialog(null, "O CPF " + cpf + " foi encontrado. Seja bem vindo!");

				
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
				
				JOptionPane.showMessageDialog(null, "Observação: neste momento, como ainda não é possível enviar fotos e vídeos, esta parte não é totalmente funcional.");
				
				arqVis = new MidiaVistoria();
				
				arqVis.confirmarArquivo(bikeInteira = JOptionPane.showInputDialog("Envie a foto da bike inteira (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(numSerie = JOptionPane.showInputDialog("Envie a foto do número de série (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(roda = JOptionPane.showInputDialog("Envie a foto das rodas (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(freios = JOptionPane.showInputDialog("Envie a foto dos freios (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(guidao = JOptionPane.showInputDialog("Envie a foto do guidão (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(pedais = JOptionPane.showInputDialog("Envie a foto dos pedais (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(corrente = JOptionPane.showInputDialog("Envie a foto da corrente (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(clienteBike =JOptionPane.showInputDialog("Envie uma foto sua junto com a bike (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(bikeFrente = JOptionPane.showInputDialog("Envie uma foto da bike de frente (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(acessorios = JOptionPane.showInputDialog("Envie uma foto dos acessórios (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(videoBike = JOptionPane.showInputDialog("Envie um vídeo mostrando a bike no geral (Digite 'ok' para enviar): "));
				arqVis.confirmarArquivo(videoPartes = JOptionPane.showInputDialog("Envie um vídeo completo da bike mostrando todas as partes ditas anteriormente (Digite 'ok' para enviar): "));
				
				arqVis.setBikeInteira(bikeInteira);
				arqVis.setNumSerie(numSerie);
				arqVis.setRoda(roda);
				arqVis.setFreios(freios);
				arqVis.setGuidao(guidao);
				arqVis.setPedais(pedais);
				arqVis.setCorrente(corrente);
				arqVis.setClienteBike(clienteBike);
				arqVis.setBikeFrente(bikeFrente);
				arqVis.setAcessorios(acessorios);
				arqVis.setVideoBike(videoBike);
				arqVis.setVideoPartes(videoPartes);
				
				
				System.out.println(cliente.insereDadosVistoria(cpf, opcSeguro, bikeInteira, numSerie, roda, freios, guidao, pedais, corrente, clienteBike, bikeFrente, acessorios, videoBike, videoPartes));
				
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
				try {
					String encontrarCpf = "Cliente não encontrado";
					while (encontrarCpf == "Cliente não encontrado") {
						cliente = new ClienteController();
						cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
						encontrarCpf = cliente.buscarCliente(cpf);
						System.out.println(encontrarCpf);
						JOptionPane.showMessageDialog(null, encontrarCpf);
					}
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				 catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				

				//Status da vistoria
				andamento = new StatusVistoria();
				andamento.resultado();
				
				break;
				
					
			//Feedback
			case 4: 
				try {
					String encontrarCpf = "Cliente não encontrado";
					while (encontrarCpf == "Cliente não encontrado") {
						cliente = new ClienteController();
						cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
						encontrarCpf = cliente.buscarCliente(cpf);
						System.out.println(encontrarCpf);
						JOptionPane.showMessageDialog(null, encontrarCpf);
					}
					
					//Tempo
					tempo = JOptionPane.showInputDialog("Digite seu feedback para tempo");
					
					//Serviços
					servicos = JOptionPane.showInputDialog("Digite seu feedback para serviços prestados");
					
					//Problemas
					problemas = JOptionPane.showInputDialog("Digite seu feedback para problemas");

					//Atendimentos
					atendimentos = JOptionPane.showInputDialog("Digite seu feedback para atendimento");

					//Dúvidas
					duvidas = JOptionPane.showInputDialog("Digite seu feedback para resolução de duvidas");
					
					opiniao = new Feedback();
					opiniao.setTempo(tempo);
					opiniao.setServicos(servicos);
					opiniao.setProblemas(problemas);
					opiniao.setAtendimentos(atendimentos);
					opiniao.setDuvidas(duvidas);
					opiniao.enviarFeedback();
					
				}
				catch (SQLException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				 catch (ClassNotFoundException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
				break;
			
				
			//Encerrar
			case 5:
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
