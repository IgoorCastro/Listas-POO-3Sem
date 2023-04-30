/*
27) Escreva um programa em Java para gerar uma matriz X (N x M). Ordenar as linhas
da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
 */

package lista00;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio27 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				int mtzX[][], mtzOdenada[][], dimN = 8, dimM = 6, valMaxRnd = 8;
				
				mtzX = gerarMatriz(dimN, dimM);
				mtzOdenada = gerarMatriz(dimN, dimM);
				
				mtzX = gerarMtzRandom(mtzX, valMaxRnd);
				
				System.out.println("*Matriz gerada:");
				lerMatriz(mtzX);
				
				mtzOdenada = ordenarLinhasCrescenteMtz(mtzX);				
				
				
				System.out.println("\n*Matriz ordenada (por linha):");
				lerMatriz(mtzOdenada);
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();		
	}
	
	static void lerMatriz(int[][] mtz) {
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 
				System.out.print((x == 0) ? mtz[i][x] : "\t" + mtz[i][x]);	
			System.out.println();
		}
	}
	
	static int[][] ordenarLinhasCrescenteMtz(int[][] mtz){		
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 			
				Arrays.sort(mtz[i]);//metodo da classe Arrays que ordena valores				
		}		
		return mtz;
	}
	
	static int[][] gerarMtzRandom(int[][] mtz, int valMaxRandom){
		Random rnd = new Random();
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 
				do {		
					mtz[i][x]= rnd.nextInt(valMaxRandom);	
				}while(mtz[i][x] < 1);			
		}		
		return mtz;
	}

	static int[][] gerarMatriz(int linhas, int colunas){
		int[][] mtz = new int[linhas][colunas];
		
		return mtz;
	}
	
}
