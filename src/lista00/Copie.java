package lista00;

import java.util.Scanner;

public class Copie {
	
	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				//corpo e metodos
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}

}
