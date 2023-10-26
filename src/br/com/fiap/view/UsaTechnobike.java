package br.com.fiap.view;

import java.sql.SQLException;
import java.util.ArrayList;

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
		String cpf = null;
		boolean cpfInvalido = true;
		int teste;
		
		int tempo;
		int servicos;
		int problemas;
		int atendimentos;
		int duvidas;
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
//				try {
					while (cpfInvalido == true) {
						cpf = JOptionPane.showInputDialog("Informe seu CPF: ");
//						teste = Integer.parseInt(cpf);
					if (cpf.length() != 11) {
						JOptionPane.showMessageDialog(null, "Digite um cpf válido!");
					}else {
						cpfInvalido = false;
					}
					}
					
					cliente = new ClienteController();
					System.out.println(cliente.insereCliente(cpf));
					

					
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
					
					arqVis.confirmarArquivo(bikeInteira = JOptionPane.showInputDialog("Envie a foto da bike inteira: "));
					arqVis.confirmarArquivo(numSerie = JOptionPane.showInputDialog("Envie a foto do número de série: "));
					arqVis.confirmarArquivo(roda = JOptionPane.showInputDialog("Envie a foto das rodas: "));
					arqVis.confirmarArquivo(freios = JOptionPane.showInputDialog("Envie a foto dos freios: "));
					arqVis.confirmarArquivo(guidao = JOptionPane.showInputDialog("Envie a foto do guidão: "));
					arqVis.confirmarArquivo(pedais = JOptionPane.showInputDialog("Envie a foto dos pedais: "));
					arqVis.confirmarArquivo(corrente = JOptionPane.showInputDialog("Envie a foto da corrente: "));
					arqVis.confirmarArquivo(clienteBike =JOptionPane.showInputDialog("Envie uma foto sua junto com a bike: "));
					arqVis.confirmarArquivo(bikeFrente = JOptionPane.showInputDialog("Envie uma foto da bike de frente: "));
					arqVis.confirmarArquivo(acessorios = JOptionPane.showInputDialog("Envie uma foto dos acessórios: "));
					arqVis.confirmarArquivo(videoBike = JOptionPane.showInputDialog("Envie um vídeo mostrando a bike no geral: "));
					arqVis.confirmarArquivo(videoPartes = JOptionPane.showInputDialog("Envie um vídeo completo da bike mostrando todas as partes ditas anteriormente: "));
					
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
//				} catch (NumberFormatException e) {
//					System.out.println("Digite apenas números!");
//				}
				
		
				
			//Conferir status da vistoria
			case 3:
				//Identificar cliente
				try {
					boolean cpfEncontrado = false;
					while (cpfEncontrado == false) {
						cliente = new ClienteController();
						cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
						ArrayList<String> consulta = cliente.buscaCliente(cpf);
						JOptionPane.showMessageDialog(null, "Cpf encontrado: " + consulta.get(0));
						cpfEncontrado = true;
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
						ArrayList<String> consulta = cliente.buscaCliente(cpf);
						JOptionPane.showMessageDialog(null, "Cpf encontrado: " + consulta.get(0));
						System.out.println(encontrarCpf);
						JOptionPane.showMessageDialog(null, encontrarCpf);
					}
					ClienteController cl = new ClienteController();
					
					//Tempo
					aux = JOptionPane.showInputDialog("Digite seu feedback para tempo");
					tempo = Integer.parseInt(aux);
					
					//Serviços
					aux = JOptionPane.showInputDialog("Digite seu feedback para serviços prestados");
					servicos = Integer.parseInt(aux);
					//Problemas
					aux = JOptionPane.showInputDialog("Digite seu feedback para problemas");
					problemas = Integer.parseInt(aux);
					//Atendimentos
					aux = JOptionPane.showInputDialog("Digite seu feedback para atendimento");
					atendimentos = Integer.parseInt(aux);
					//Dúvidas
					aux = JOptionPane.showInputDialog("Digite seu feedback para resolução de duvidas");
					duvidas = Integer.parseInt(aux);
					
					opiniao = new Feedback();
					opiniao.setTempo(tempo);
					opiniao.setServicos(servicos);
					opiniao.setProblemas(problemas);
					opiniao.setAtendimentos(atendimentos);
					opiniao.setDuvidas(duvidas);
					opiniao.enviarFeedback();
					
					System.out.println(cl.insereFeedback(cpf, tempo, servicos, problemas, atendimentos, duvidas));
					
					
					
					
					
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
