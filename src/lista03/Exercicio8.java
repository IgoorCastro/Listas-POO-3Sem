/*
[POO-021] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
calcule e retorne o MDC (Máximo Divisor Comum) desse conjunto de dados. Valide as entradas para aceitar
apenas números positivos (pode ser um método).
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;

public class Exercicio8 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		String preEscolha;
		
		do {
			
			try {
				
				System.out.print("Entre com a quantidade de termos: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				int[] valores = new int[op];
				
				for(int i = 0; i < op; i++) {
					System.out.print("Entre com o " + (i + 1) + "º numero: ");
					preEscolha = scan.next();
					valores[i] = Integer.parseInt(preEscolha);
				}
				
				System.out.println();
				
				System.out.print("MDC: " + calculoMDC(valores));
				
				//menu para sair
				op = 0;
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){/*System.err.println(e);*/}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static int calculoMDC(int[] valores) {
		
		int mdcMin = 2, mdc = 1, cont;
		boolean trueMdc = true, motor = false;
		
		if(valores.length == 1)//verifica se a quantidade de termos e igual a 1
			return valores[0];
		else {
			for(int i = 0; i < valores.length; i++) {//verifica se todos os termos sao iguais a 1
				if(valores[i] != 1)
					motor = true;
			}
		}
		
		while(motor) {
			trueMdc = true;
			cont = 1;
			
			for(int i = 0; i < valores.length; i++) {
				if(valores[i] % mdcMin != 0) {
					trueMdc = false;
				}else {
					valores[i] /= mdcMin;
				}
				
			}			
			if(!trueMdc)
				mdcMin++;
			else
				mdc *= mdcMin;
			
			//verifica motor
			for(int i = 0; i < valores.length; i++) {
				if(valores[i] == 1)
					cont++;
			}
			if(cont == valores.length)//estoura o laço
				motor = false;
			
		}
		return mdc;
	}

}