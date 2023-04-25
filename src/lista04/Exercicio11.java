package lista04;

import java.util.Scanner;

public class Exercicio11 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		String preEscolha;
		int op = 0;
		
		do {
			
			try {
				
				do {
					System.out.print("Entre com um número: ");
					preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
					if(op < 1)
						System.err.println("\n-Erro! Valor inválido.\n");
				}while(op < 1);
					
				
				
				System.out.println( (isNumPerfect(op) ? "O número " + op + " é perfeito." : "O número " + op + " não é perfeito.") );
				
				//menu para sair
				op = 0;
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static boolean isNumPerfect(int valor) {
		int testPerfect;
		
		if(valor % 2 != 0)
			return false;
		else {
			testPerfect = 0;
			
			for(int i = 1; i <= valor / 2; i++) {
				if(valor % i == 0)
					testPerfect += i;
			}
		}
			
		return (valor == testPerfect) ? true : false;
	}

}
