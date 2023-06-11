/*
Uma empresa de recursos humanos, especializada em recolocações no mercado
(vagas de emprego), solicita a criação de um sistema para informatizar suas ações.
Assim, ela deseja cadastrar os candidatos com seu nome (String) e idade (int). Os
candidatos podem ser desempregados, que tem o tempo em meses (int) que não
trabalha ou empregados, que tem o nome da empresa (String), onde está atualmente.
As vagas tem a descrição (String) e o salário oferecido (double). As vagas podem ser
de estágio, que em o tempo em meses (int) ou contrato, que pode ser temporário ou
não (boolean). Criar um programa em Java para cadastrar os candidatos
Faculdade de Tecnologia de Guaratinguetá – Prof. João Mod
www.fatecguaratingueta.edu.br - e-mail: fatecgt@fatecguaratingueta.edu.br
Av. Prof. João Rodrigues Alckmin, 1501 – Jardim Esperança, Guaratinguetá – SP / CEP 12517-475
Tel. (12) 3126-3921 - 3125-7785 - 3126-4849
(desempregados ou empregados) e cadastrar as vagas (estágio ou contrato). O
sistema deve ser capaz de cadastrar os candidatos para as vagas.
Criar uma classe para criar a empresa de RH (main). Nesta classe deverá haver um
menu para cadastrar candidatos, cadastrar vagas, cadastrar candidato x vaga, listar
vagas por tipo, mostrar quantidade de candidatos e sua situação e os candidatos x
vaga. 
Igor Kaue Nardes de Castro
 */

package exercicio03;

import java.util.Scanner;

public class Main03 {

	static Scanner scan;
	static Vaga[] vagas = new Vaga[100];//100 vagas
	static int contVagas = 0;
	static Candidato[] candidatos = new Candidato[200];//200 candidatos
	static int contCandidatos = 0;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		boolean quitOption = false;
		String preEscolha = "";
		
		do {
			
			try {
				
				do {
					mainMenu();
					System.out.print("→ ");
					preEscolha = scan.next();
					if(Integer.parseInt(preEscolha) < 0 || Integer.parseInt(preEscolha) > 6)
						System.out.println("erro: Valor invalido!\n");
				}while(Integer.parseInt(preEscolha) < 0 || Integer.parseInt(preEscolha) > 6);
				
				switch(Integer.parseInt(preEscolha)){
					
					case 1:
						cadastroVaga();
						break;
					case 2:
						cadastroCandidato();
						break;
					case 3:
						cadastroCandidatoVaga();
						break;
					case 4:
						listaVagaPorTipo();
						break;
				}				
				
			}catch(Exception e){System.err.println("\nERRO: Porfavor, digite um valor valido! [Não entre com uma letra ou caractere especial!]\n");}
			
		}while(!quitOption);
		
		System.out.print("\nFim!");
		scan.close();
	}
	
	static void cadastroCandidatoVaga() {
		
		int vagaNum = 0, candNum = 0;
		boolean confkey = false;
		
		do {
			System.out.println("-CADASTRAR CANDIDATO EM VAGA-");
			
			//INFORMAÇÕES DA VAGA
			do {	
				System.out.println("\n=VAGAS=");
				do {
					scan = new Scanner(System.in);
					
					for(int i = 0; i < contVagas; i++) {
						if(vagas[i] != null) 
							System.out.println("[" + (i + 1) + "]  " + vagas[i]);// VAGA 1 = VAGAS[0]
						System.out.println("----------------------");
					}
					
					System.out.print("-Digite o numero da vaga: ");
					vagaNum = scan.nextInt();
					
					if(vagaNum < 1 || vagaNum > contVagas)
						System.out.println("erro: Valor invalido!\n");
				}while(vagaNum < 1 || vagaNum > contVagas);
				
				//LOG ----------------
				System.out.println("----------------------");
				System.out.println("\nVaga selecionada: \n" + vagas[vagaNum - 1]);
				System.out.println("----------------------");
				//--------------------
				
				System.out.print("-Confirmar seleção [S/N]: ");
				confkey = scan.next().equalsIgnoreCase("s");
			}while(!confkey);
			
			
			//////////////////////////////
			
			
			//INFORMAÇÕES DO CANDIDATO		
			do {	
				System.out.println("\n=CANDIDATOS=");
				do {
					scan = new Scanner(System.in);
					
					for(int i = 0; i < contCandidatos; i++) {
						if(candidatos[i] != null) 
							System.out.println("[" + (i + 1) + "]  " + candidatos[i]);// VAGA 1 = VAGAS[0]
						System.out.println("----------------------");
					}
					
					System.out.print("-Digite o numero do candidato: ");
					candNum = scan.nextInt();
					
					if(candNum < 1 || candNum > contCandidatos)
						System.out.println("erro: Valor invalido!\n");
				}while(candNum < 1 || candNum > contCandidatos);
				
				//LOG ----------------
				System.out.println("----------------------");
				System.out.println("\nCandidato(a) selecionado(a): \n" + candidatos[candNum - 1]);
				System.out.println("----------------------");
				//--------------------
				
				System.out.print("-Confirmar seleção [S/N]: ");
				confkey = scan.next().equalsIgnoreCase("s");
			}while(!confkey);
			
			
			//INSERIR CANDIDATO NA VAGA
			System.out.println("\n=RESUMO DA CANDIDATURA=");
			System.out.println("----------------------");
			System.out.println("-Vaga Selecionada-\n" + vagas[vagaNum - 1]);
			System.out.println("----------------------");
			
			System.out.println("-Candidato(a) selecionado(a)- \n" + candidatos[candNum - 1]);
			System.out.println("----------------------");
			
			System.out.print("-Confirmar candidatura [S/N]: ");
			confkey = scan.next().equalsIgnoreCase("s");
			
			System.out.println();
			
			if(confkey) 
				vagas[vagaNum - 1].addCandidatos(candidatos[candNum - 1]);
			
			System.out.println();
			
		}while(!confkey);
	}
	
	static void nmrCandidatosSituacao() {

		System.out.println("--------------------------");
		System.out.println("-Quantidade de candidatos e situação-");
		System.out.println("Numero de candidatos cadastrados: " + contCandidatos);
	}
	
	static void listaVagaEstagio() {
		
		System.out.println("--------------------------");
		System.out.println("-Lista de vagas de contrato-");
		for(int i = 0; i < contVagas; i++) {
			if(vagas[i] != null) {
				if(vagas[i] instanceof Estagio) 
					System.out.println(vagas[i]);				
			}
		}
		System.out.println("--------------------------");
	}
	
	static void listaVagaContrato() {
		
		System.out.println("--------------------------");
		System.out.println("-Lista de vagas de contrato-");
		for(int i = 0; i < contVagas; i++) {
			if(vagas[i] != null) {
				if(vagas[i] instanceof Contrato) 
					System.out.println(vagas[i]);				
			}
		}
		System.out.println("--------------------------");
	}
	
	static void listaVagaPorTipo() {
		
		String aux = "0";
		
		System.out.println("\n--LISTA DE VAGA(S) POR TIPO--");
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("  ↓  Escolha uma opção\n" +
					   			" [1] - Vagas por contrato\n" +
					   			" [2] - Vagas de estágio\n" +
					   			" [0] - Voltar\n");
			System.out.print("→ ");
			aux = scan.next();
			
			if(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2)
				System.out.println("erro: Valor invalido!\n");			
			
		}while(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2);
		
		switch(Integer.parseInt(aux)) {
			case 0:
				return;
			case 1:
				listaVagaContrato();
				break;
			case 2:
				listaVagaEstagio();
				break;
			default:
				System.out.println("erro: Valor invalido!");	
		}
	}
	
	
	//////////////////////// CADASTRO DE CANDIDATOS
	static void cadastroCandidatoEmpregado() {
		
		boolean confirmCadastro = false;
		Candidato newCandidato = new Empregado();
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("\n--CADASTRO DE CANDIDATO DE EMPREGADO--");			
			
			System.out.print("Nome: ");
			newCandidato.setNome( scan.nextLine() );
			
			System.out.print("Idade: ");
			newCandidato.setIdade( scan.nextInt() );
			
			scan = new Scanner(System.in);
			System.out.print("Nome da empresa atual: ");
			((Empregado)newCandidato).setNomeEmpresaAtual( scan.nextLine() );
			
			//LOG
			System.out.println("\n------------------------------------------------");
			System.out.println(	"Nome: " + newCandidato.getNome() +
								"\nIdade: " + newCandidato.getIdade() + " R$" +
								"\nNome da empresa atual: " + ( (Empregado)newCandidato).getNomeEmpresaAtual() );
			System.out.println("------------------------------------------------");
			
			System.out.print("Confirmar cadastro [S/N]: ");
			confirmCadastro = scan.next().equalsIgnoreCase("s");

			//CASO RECUSE O CADASTRO
			if(!confirmCadastro) {
				newCandidato = null;
				System.out.print("Voltar [S/N]: ");
				confirmCadastro = scan.next().equalsIgnoreCase("s");
			}
		}while(!confirmCadastro);
		
		candidatos[contCandidatos] = newCandidato;
		
		if(newCandidato != null)
			contCandidatos++;
		
		System.out.println("\n");		
	}
	
	static void cadastroCandidatoDesempregado() {
		
		boolean confirmCadastro = false;
		Candidato newCandidato = new Desempregado();
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("\n--CADASTRO DE CANDIDATO DE Desempregado--");			
			
			System.out.print("Nome: ");
			newCandidato.setNome( scan.nextLine() );
			
			System.out.print("Idade: ");
			newCandidato.setIdade( scan.nextInt() );
			
			System.out.print("Tempo desempregado: ");
			((Desempregado)newCandidato).setTempoDesempregado( scan.nextInt() );
			
			//LOG
			System.out.println("\n------------------------------------------------");
			System.out.println(	"Nome: " + newCandidato.getNome() +
								"\nIdade: " + newCandidato.getIdade() + " R$" +
								"\nTempo desempregado: " + ( (Desempregado)newCandidato).getTempoDesempregado() );
			System.out.println("------------------------------------------------");
			
			System.out.print("Confirmar cadastro [S/N]: ");
			confirmCadastro = scan.next().equalsIgnoreCase("s");	

			//CASO RECUSE O CADASTRO
			if(!confirmCadastro) {
				newCandidato = null;
				System.out.print("Voltar [S/N]: ");
				confirmCadastro = scan.next().equalsIgnoreCase("s");
			}
		}while(!confirmCadastro);
		
		candidatos[contCandidatos] = newCandidato;
		
		if(newCandidato != null)
			contCandidatos++;
		
		System.out.println("\n");		
	}
	
	static void cadastroCandidato() {
		
		String aux = "0";
		
		System.out.println("\n--CADASTRO DE CANDIDATO--");
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("  ↓  Escolha uma opção\n" +
							   " [1] - Candidato empregado\n" +
							   " [2] - Candidato desempregado\n" +
							   " [0] - Voltar\n");
			System.out.print("→ ");
			aux = scan.next();
			
			if(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2)
				System.out.println("erro: Valor invalido!\n");			
			
		}while(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2);
		
		switch(Integer.parseInt(aux)) {
			case 0:
				return;
			case 1:
				cadastroCandidatoEmpregado();
				break;
			case 2:
				cadastroCandidatoDesempregado();
				break;
			default:
				System.out.println("erro: Valor invalido!");
					
		}
	}

	
	///////////////////////CADASTRO DE VAGAS
	static void cadastroVagaEstagio(){
		
		boolean confirmCadastro = false;
		Vaga newVaga = new Estagio();
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("\n--CADASTRO DE VAGA DE ESTÁGIO--");			
			
			System.out.print("Descrição: ");
			newVaga.setDescricao( scan.nextLine() );
			
			System.out.print("Salario: ");
			newVaga.setSalario( scan.nextDouble() );
			
			System.out.print("Meses: ");
			((Estagio)newVaga).setMeses( scan.nextInt() );
			
			//LOG
			System.out.println("\n------------------------------------------------");
			System.out.println(	"Descrição: " + newVaga.getDescricao() +
								"\nSalario: " + newVaga.getSalario() + " R$" +
								"\nTemporario: " + ( (Estagio)newVaga).getMeses() );
			System.out.println("------------------------------------------------");
			
			System.out.print("Confirmar cadastro [S/N]: ");
			confirmCadastro = scan.next().equalsIgnoreCase("s");

			//CASO RECUSE O CADASTRO
			if(!confirmCadastro) {
				newVaga = null;
				System.out.print("Voltar [S/N]: ");
				confirmCadastro = scan.next().equalsIgnoreCase("s");
			}
		}while(!confirmCadastro);
		
		vagas[contVagas] = newVaga;
		
		if(newVaga != null)
			contVagas++;
		
		System.out.println("\n");
	}
	
	static void cadastroVagaContrato(){
		
		boolean confirmCadastro = false;
		Vaga newVaga = new Contrato();
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("\n--CADASTRO DE VAGA DE CONTRATO--");			
			
			System.out.print("Descrição: ");
			newVaga.setDescricao( scan.nextLine() );
			
			System.out.print("Salario: ");
			newVaga.setSalario( scan.nextDouble() );
			
			System.out.print("Temporaria [S/N]: ");
			((Contrato)newVaga).setTemporario( scan.next().equalsIgnoreCase("s") );
			
			//LOG
			System.out.println("\n------------------------------------------------");
			System.out.println(	"Descrição: " + newVaga.getDescricao() +
								"\nSalario: " + newVaga.getSalario() + " R$" +
								"\nTemporario: " + ( ((Contrato)newVaga).isTemporario() ? "Sim" : "Não") );
			System.out.println("------------------------------------------------");
			
			System.out.print("Confirmar cadastro [S/N]: ");
			confirmCadastro = scan.next().equalsIgnoreCase("s");	
			
			//CASO RECUSE O CADASTRO
			if(!confirmCadastro) {
				newVaga = null;
				System.out.print("Voltar [S/N]: ");
				confirmCadastro = scan.next().equalsIgnoreCase("s");
			}
		}while(!confirmCadastro);
		
		vagas[contVagas] = newVaga;
		
		if(newVaga != null)
			contVagas++;
		
		System.out.println("\n");
	}
	
	static void cadastroVaga() {	
		
		String aux = "0";
		
		System.out.println("\n--CADASTRO DE VAGA--");
		
		do {
			scan = new Scanner(System.in);
			
			System.out.println("  ↓  Escolha uma opção\n" +
					   " [1] - Vaga de contrato\n" +
					   " [2] - Vaga de estágio\n" +
					   " [0] - Voltar\n");
			System.out.print("→ ");
			aux = scan.next();
			
			if(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2)
				System.out.println("erro: Valor invalido!\n");			
			
		}while(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 2);
		
		switch(Integer.parseInt(aux)) {
			case 0:
				return;
			case 1:
				cadastroVagaContrato();
				break;
			case 2:
				cadastroVagaEstagio();
				break;
			default:
				System.out.println("erro: Valor invalido!");
					
		}
	}
	
	static void mainMenu() {
		System.out.println("  ↓  Escolha uma opção\n" +
						   " [1] - Cadastar vaga\n" +
						   " [2] - Cadastrar candidato\n" +
						   " [3] - Cadastrar candidato em vaga\n" +
						   " [4] - Listar vagas por tipo\n" + 
						   " [5] - Quantidade de candidatos e situação\n" + 
						   " [6] - Candidatos x Vaga\n" + 
						   " [0] - Sair\n");
	}

}