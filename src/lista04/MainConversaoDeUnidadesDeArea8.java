package lista04;

import java.util.Scanner;

public class MainConversaoDeUnidadesDeArea8 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		boolean quitOption = false;
		String preEscolha = "";
		int op = 0;
		
		do {
			
			try {
								
				do {
					System.out.println("\t--- Escolha uma opção ---\n");
					
					System.out.print("[1] - Metro quadrado --> Pés quadrados\n" +
									 "[2] - Pé quadrado    --> Centrimetro quadrados\n" + 
									 "[3] - Milha quadrada --> Acre\n" +
									 "[4] - Acre 	     --> Pés quadrados\n---> ");
					
					preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
				}while(op < 1 || op > 4);
				
				ConversaoDeUnidadesDeArea8 convert = new ConversaoDeUnidadesDeArea8();
				
				
				switch(op) {
					case 1:
						convert.setMedida(getValores()); 						
						System.out.println(preEscolha + " metro(s) quadrado(s) = " + convert.metroQuadrado() + " pés quadrados");
						break;
					case 2:
						convert.setMedida(getValores()); 						
						System.out.println(preEscolha + " pé(s) quadrado(s) = " + convert.peQuadrado() + " centimentros quadrados");
						break;
					case 3:
						convert.setMedida(getValores()); 						
						System.out.println(preEscolha + " milha(s) quadrada(s) = " + convert.milhaQuadrada() + " acres");
						break;
					case 4:
						convert.setMedida(getValores()); 						
						System.out.println(preEscolha + " acre(s) = " + convert.acre() + " pés quadrados");
						break;
				}
						
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				quitOption = (Integer.parseInt(preEscolha) == 1) ? true : false;
				
			}catch(Exception e){/*System.err.println("\n\ne: " + e);*/}
			
		}while(quitOption != true);
		
		System.out.print("\nFim!");
		scan.close();
	}
	
	static double getValores() {
		System.out.print("\n- Valor: ");
		String preEscolha = scan.next();
		return Double.parseDouble(preEscolha);
	}

}
