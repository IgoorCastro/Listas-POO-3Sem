package exercicio02;

import java.util.Scanner;

public class Floresta {
	
	static Planta[] plantas = new Planta[50];
	static Scanner scan;
	static int contPlantas = 0;
	static boolean quitOption = false;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		String preEscolha = "";
		
		do {
			
			try {
				System.out.println("-MONTE SUA ARVORE-\n");
				//MENU PRINCIPAL
				do {					
					mainMenu();
					System.out.print("→ ");
					preEscolha = scan.next();	
				}while(Integer.parseInt(preEscolha) < 0 || Integer.parseInt(preEscolha) > 4);
				
				switch(Integer.parseInt(preEscolha)) {
					case 0:
						quitOption = true;
						break;
					case 1:
						cadastroMenu();
						break;
					case 2:
						System.out.println("-Lista de plantas cadastradas-");
						System.out.print("-------------------------------");
						if(contPlantas < 1)
							System.out.println("\nNenhuma planta cadastrada!");
						else
							listarPlantas();
						System.out.println("-------------------------------\n");
						break;
					case 3:
						System.out.println("-------------------------------");
						if(contPlantas < 1)
							System.out.println("Nenhuma planta cadastrada!");
						else 
							System.out.println("Quantidade de plantas: " + contPlantas);
						System.out.println("-------------------------------\n");
						
						break;
					case 4:
						System.out.println("-------------------------------");
						if(contPlantas < 1)
							System.out.println("Nenhuma planta cadastrada!");
						else 					
							qantPlantasPorTipo();
						System.out.println("-------------------------------\n");
						
						break;
				}
				
			}catch(Exception e){System.err.println("\n\nDigite um valor valido! erro: " + e);}
			
		}while(quitOption != true);
		
		System.out.print("\nFim!");
		scan.close();	
	}
	
	static void qantPlantasPorTipo() {
		
		int arv = 0, flor = 0, carni = 0;
		
		for(int i = 0; i < contPlantas; i++) {
			if(plantas[i] instanceof Arvore)
				arv++;
			else
				if(plantas[i] instanceof Flor)
					flor++;
				else
					carni++;
		}
		
		System.out.println("\nArvore(s): \t" + arv +
							"\nFlor(es): \t" + flor +
							"\nCarnivora(s): \t" + carni);
	}
	
	static void listarPlantas() {
		
		for(int i = 0; i < contPlantas; i++) {
			if(plantas != null) 
				System.out.println(plantas[i]);			
		}
	}
	
	static void cadastroMenu() {
		scan = new Scanner(System.in);
		String aux = "";
		do {
			
			System.out.println("  -Cadastro de planta-\n ----------------------");
			System.out.println("  ↓  Escolha uma opção\n" +
							   " [1] - Cadastar árvore\n" +
							   " [2] - Cadastrar flor\n" +
							   " [3] - Cadastrar carnívora\n" +
							   " [0] - Sair\n");
			
			System.out.print("→ ");
			aux = scan.next();			
			
			switch(Integer.parseInt(aux)) {
			
				case 0:
					return;
				//ARVORE
				case 1:
					addArvore();
					break;
				case 2:
					addFlor();
					break;
				case 3:
					addCarnivora();
					break;
				default: 
					System.out.println("\nerro: Valor invalido\n");
			}
		}while(Integer.parseInt(aux) < 0 || Integer.parseInt(aux) > 3);
	}
	
	static void addCarnivora() {
		Planta carnivora = new Carnivora();
		boolean exitKey = false;
		scan = new Scanner(System.in);
		
		do {
			System.out.print("Nome: ");
			carnivora.setNome(scan.nextLine());
			
			System.out.print("Especie: ");
			carnivora.setEspecie(scan.nextLine());
			
			System.out.print("Venenosa [S/N]: ");
			( (Carnivora)carnivora ).setVenenosa( scan.next().equalsIgnoreCase("s") );
			
			//LOG
			System.out.println(	"\nNome: " + carnivora.getNome() +
								"\nEspecie: " + carnivora.getEspecie() +
								"\nVenenosa: " + (( (Carnivora)carnivora ).isVenenosa() ? "Sim" : "Não"));
			
			System.out.print("\nConfirmar cadastro [S/N]: ");
			//String aux = scan.next();
			exitKey = scan.next().equalsIgnoreCase("s");
			
		}while(!exitKey);
		
		//ADICIONA A PLANTA
		addPlanta(carnivora);
		
		System.out.println("\n");
	}
	
	static void addFlor() {
		Planta flor = new Flor();
		boolean exitKey = false;
		scan = new Scanner(System.in);
		
		do {
			System.out.print("Nome: ");
			flor.setNome(scan.nextLine());
			
			System.out.print("Especie: ");
			flor.setEspecie(scan.nextLine());
			
			System.out.print("Cor: ");
			((Flor)flor).setCor(scan.nextLine());
			
			//LOG
			System.out.println(	"\nNome: " + flor.getNome() +
								"\nEspecie: " + flor.getEspecie() +
								"\nCor: " + ( (Flor)flor ).getCor());
			
			System.out.print("\nConfirmar cadastro [S/N]: ");
			//String aux = scan.next();
			exitKey = scan.next().equalsIgnoreCase("s");
			
		}while(!exitKey);
		
		//ADICIONA A PLANTA
		addPlanta(flor);
		
		System.out.println("\n");
	}
	
	static void addArvore() {
		Planta arvore = new Arvore();
		boolean exitKey = false;
		scan = new Scanner(System.in);
		
		do {
			System.out.print("Nome: ");
			arvore.setNome(scan.nextLine());
			
			System.out.print("Especie: ");
			arvore.setEspecie(scan.nextLine());
			
			System.out.print("Frutífera [S/N]: ");
			((Arvore)arvore).setFrutifera((scan.next().equalsIgnoreCase("s")));
			
			//LOG
			System.out.println(	"\nNome: " + arvore.getNome() +
								"\nEspecie: " + arvore.getEspecie() +
								"\nFrutifera: " + (( (Arvore)arvore).isFrutifera() ? "Sim" : "Não" ));
			
			System.out.print("\nConfirmar cadastro [S/N]: ");
			//String aux = scan.next();
			exitKey = scan.next().equalsIgnoreCase("s");
			
		}while(!exitKey);
		
		//ADICIONA A PLANTA
		addPlanta(arvore);
		
		System.out.println("\n");
	}
	
	static void addPlanta(Planta planta) {
		if(planta != null) {
			plantas[contPlantas] = planta;
			contPlantas++;
			System.out.println("-Planta cadastrada com sucesso!\n");
		}
	}
	
	static void mainMenu() {
		System.out.println("  ↓  Escolha uma opção\n" +
						   " [1] - Cadastar planta\n" +
						   " [2] - Listar plantas\n" +
						   " [3] - Quantidade de plantas\n" + 
						   " [4] - Quantidade de plantas por tipo\n" + 
						   " [0] - Sair\n");
	}
}
