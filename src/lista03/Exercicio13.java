/*
[POO-026] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada. Este
método deverá retornar, apenas, os números perfeitos existentes no conjunto recebido.
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;

public class Exercicio13 {

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
