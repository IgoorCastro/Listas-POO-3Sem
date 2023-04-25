/*
6) Escreva um programa em Java para gerar aleatoriamente (menor que 25)
uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário
um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na
matriz, indicando a posição (linha X coluna) e no final a quantidade de
ocorrências.
Igor Kaue Nardes de Castro - 3° ADS
 */
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {

	static Scanner scan;
	static int dimensaoN = 0, dimensaoM = 0, mtzP[][], valMaxRnd, valEscolhido, cont;
	static String preEscolha, posicoes = "";
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				System.out.println("\n\n--- Defina a dimensao de uma matriz e tente acertar um valor aleatório gerado nela! ---");
				System.out.println("---\t*** VALORES INTEIROS MAIORES QUE 0 *** \t---\n\n");
				setDimensao();
				//---
				System.out.print("\nDigite o valor maximo de números aleatórios gerados: ");	
				setValMaxRnd();
				setRandom(valMaxRnd);
				//---
				System.out.print("\nDigite o valor de 1 até " + valMaxRnd + " você deseja procurar: ");	
				setValEscolhido();
				buscarValor();
				lerMatriz();
				//---
				System.out.println("");
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}			
		}while(op != 1);		
		System.out.print("Fim!");
	}
	
	static void buscarValor() {
		preEscolha = "";
		for(int i = 0; i < mtzP.length; i++) {
			for(int x = 0; x < mtzP[i].length; x++) {
				if(mtzP[i][x] == valEscolhido) {
					posicoes += "Lin: " + i + " - Col: " + x + "\n";
					cont++;
				}
			}
		}
		System.out.print((cont > 0) ? "\n*** Acertou\nPosições encontradas\n" + posicoes + "\nQuantidade de ocorrencias: " + cont : "Você não acertou..");
	}
	
	static void setValEscolhido() {
		do {				
			preEscolha = scan.next();
			valEscolhido = Integer.parseInt(preEscolha);			
		}while(valEscolhido < 0 || valEscolhido > valMaxRnd);	
	}
	
	static void lerMatriz() {
		System.out.println("\n\n-Matriz gerada\n");
		for(int i = 0; i < mtzP.length; i++) {
			for(int x = 0; x < mtzP[i].length; x++) 
				System.out.print((x == 0) ? mtzP[i][x] : "\t" + mtzP[i][x]);
			System.out.println();
		}
	}
	
	static void setValMaxRnd() {
		do {				
			preEscolha = scan.next();
			valMaxRnd = Integer.parseInt(preEscolha);			
		}while(valMaxRnd < 1);	
	}
	
	static void setDimensao(){	
		do {			
			System.out.print("\nDigite o valor de linha(s) da matriz (MAX: 25): ");
			preEscolha = scan.next();
			dimensaoN = Integer.parseInt(preEscolha);
			//---
			System.out.print("Digite o valor de coluna(s) da matriz (MAX: 25): ");
			preEscolha = scan.next();
			dimensaoM = Integer.parseInt(preEscolha);
		}while(dimensaoN < 1 || dimensaoN > 25 || dimensaoM < 1 || dimensaoM > 25);	
		mtzP = new int[dimensaoN][dimensaoM];
	}
	
	static void setRandom(int valMax) {
		Random rnd = new Random();
		for(int i = 0; i < mtzP.length; i++) {
			for(int x = 0; x < mtzP[i].length; x++) 
				mtzP[i][x] = rnd.nextInt(valMax);
			}		
	}
}
