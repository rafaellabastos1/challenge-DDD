package br.com.fiap.main;



import javax.swing.JOptionPane;


import br.com.fiap.bean.DocBike;
import br.com.fiap.bean.DocCliente;
import br.com.fiap.bean.EscolheSeguro;
import br.com.fiap.bean.Feedback;
import br.com.fiap.bean.FotoBike;
import br.com.fiap.bean.TipoSeguro;
import br.com.fiap.bean.VideoBike;

public class UsaTechnobike {

	public static void main(String[] args) {
		int opcMenu = 0;
		int opcDocuments = 0;
		int opcDocumentsBike = 0;
		String aux;
		String assinatura;
		String escolha = "sim";
		int confirApolice;
		int mostrarStatus;
		String confirmacao = "sim";
		TipoSeguro tpSeguro = new TipoSeguro();
		EscolheSeguro tpseg = new EscolheSeguro();
		Feedback fb = new Feedback();
		DocCliente docCli = new DocCliente(); 
		DocBike docBike = new DocBike();
		FotoBike ftBike = new FotoBike();
		VideoBike vdBike = new VideoBike();
		
		while (escolha.equalsIgnoreCase("sim")) {	
			try {
				
				aux = JOptionPane.showInputDialog("Olá, em que a Technobike pode te ajudar hoje?" + "\n1 - Conheça nossos tipos de seguro para a bike"
													+ "\n2 - Iniciar processo de vistoria" + "\n3 - Feedback" +  "\n4 - Status da vistoria" + 
													"\n5 - Encerrar");
				opcMenu = Integer.parseInt(aux);
				if (opcMenu < 1 || opcMenu > 7) {
					JOptionPane.showMessageDialog(null, "Não é uma opção válida!");
					break;
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Resposta inválida!");
			}
			 
			switch (opcMenu) {

			//Mostrar tipo de seguro
			case 1:
				tpSeguro.mostrarSeguro();
				break;
			//Iniciar vistoria	
			case 2:

				JOptionPane.showMessageDialog(null, "Informe seus dados");
				ftBike.confirmarArquivo();
				vdBike.confirmarArquivo();
				JOptionPane.showMessageDialog(null, "Escolha o tipo de seguro");
				tpseg.selecionaSeguro();
				aux = JOptionPane.showInputDialog("Os seus dados foram enviados para vistoria. Você pode acompanhar o atual status da análise pelo seu e-mail ou aqui pelo site." 
												+ "Deseja conferir o status da análise da vistoria? \n1 - Sim \n2 - Não");
				mostrarStatus = Integer.parseInt(aux);
				if (mostrarStatus == 1) {
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Ok. Acompanhe no seu email ou nessa tela o atual status da sua vistoria para saber as informações de como prosseguir.");
				}
				break;

			
				
			//Feedback
			case 3:
				fb.enviaFeedback();
				break;
				
			//Status	
			case 4: 
				
				
			
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
