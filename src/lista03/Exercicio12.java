/*
[POO-025] Crie um programa que solicite ao usuário um número inteiro. Utilizando métodos, exiba a
sequência dos números perfeito até o número informado.
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;

public class Exercicio12 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		String preEscolha;
		
		do {
			
			try {
				
				do {
					System.out.print("Entre com um número: ");
					preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
					if(op < 1)
						System.err.println("\n-Erro! Valor inválido.\n");
				}while(op < 1);
				
				isNumPerfect(op);
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static void isNumPerfect(int valor) {
		int testPerfect;
		String numPerfects = "";
		
		for(int i = 1; i < valor; i++) {	
			testPerfect = 0;
			
			if(i % 2 == 0) {
				for(int x = 1; x <= i / 2; x++) {
					if(i % x == 0)
						testPerfect += x;			
				}
				if(i == testPerfect)
					numPerfects += testPerfect + " ";
			}
			
			//System.out.println("i: " + i);
		}
		
		
		System.out.println((!numPerfects.equals("") ? ">> " + numPerfects : "Nenhum valor encontrado"));
	}

}
