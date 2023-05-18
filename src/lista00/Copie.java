package lista00;

import java.util.Scanner;

public class Copie {
	
	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		boolean quitOption = false;
		String preEscolha = "";
		
		do {
			
			try {
				
				//corpo e metodos
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				quitOption = (Integer.parseInt(preEscolha) == 1) ? true : false;
				
			}catch(Exception e){/*System.err.println("\n\ne: " + e);*/}
			
		}while(quitOption != true);
		
		System.out.print("\nFim!");
		scan.close();
	}

}
