/*
 9) Escreva um programa em Java para gerar uma matriz quadrada G de dimensão N.
Imprimir os elementos da diagonal principal (linha = coluna).
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio09 {
	
	static int mtzQddG[][];
	static Scanner scan;
	static String preEscolha;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		int op = 0;
		
		do {
			
			try {
				
				System.out.println("\n\n--- Defina a dimensao de um vetor quadrado e veja os valores da diagonal principal ---\n---\t*** VALORES INTEIROS MAIORES QUE 0 *** \\t---\\n\\n");
				
				setDimensao();				
				setRandom();				
				lerMatriz();
				System.out.print("\n-Valores da diagonal principal: ");
				escreveDiagonalPrincipal();
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();

	}
	
	static void lerMatriz() {
		System.out.println("\n\n-Matriz gerada\n");
		for(int i = 0; i < mtzQddG.length; i++) {
			for(int x = 0; x < mtzQddG[i].length; x++) 
				System.out.print((x == 0) ? mtzQddG[i][x] : "\t" + mtzQddG[i][x]);
			System.out.println();
		}
	}
	
	static void escreveDiagonalPrincipal() {
		for(int i = 0; i < mtzQddG.length; i++) {
			for(int t = 0; t < mtzQddG[i].length; t++) 
				if(i == t)
					System.out.print((t == 0) ? mtzQddG[i][t] : "\t" + mtzQddG[i][t]);
		}
		/*
		 * tente if(i == t) para pegar valores fora da diagonal princiapl
		 * 
		 */
	}
	
	static void setRandom() {
		Random rnd = new Random();
		for(int i = 0; i < mtzQddG.length; i++) {
			for(int t = 0; t < mtzQddG[i].length; t++) 
				mtzQddG[i][t] = rnd.nextInt(100);			
		}
	}
	
	static void setDimensao() {
		int dim = 0;
		do {
		System.out.print("\nDigite o valor de linhas e colunas da matriz: ");
		preEscolha = scan.next();
		dim = Integer.parseInt(preEscolha);
		}while(dim < 1);//dimensao deve ser maior que 0!
		mtzQddG = new int[dim][dim];
	}

}
