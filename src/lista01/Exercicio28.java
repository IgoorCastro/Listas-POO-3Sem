/*
28) Escreva um programa em Java para gerar uma matriz Z (N x M). Ordenar as colunas da matriz de forma crescente e imprimir a matriz original e a matriz ordenada.
Igor Kaue Nardes de Castro
 */

package lista01;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio28 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				int mtzZ[][], mtzOdenada[][], dimN = 8, dimM = 6, valMaxRnd = 8;
				
				mtzZ = gerarMatriz(dimN, dimM);
				mtzOdenada = gerarMatriz(dimN, dimM);
				
				mtzZ = gerarMtzRandom(mtzZ, valMaxRnd);
				
				System.out.println("*Matriz gerada:");
				lerMatriz(mtzZ);
				
				mtzOdenada = ordenarColunasCrescenteMtz(mtzZ);				
				
				
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
	
	static int[][] ordenarColunasCrescenteMtz(int[][] mtz){		
		int val[] = new int[mtz.length];
		
		for(int i = 0; i < mtz[i].length; i++) {			
			for(int x = 0; x < mtz.length; x++) 	
				val[x] = mtz[x][i];
			Arrays.sort(val);//metodo da classe Arrays que ordena valores		
			for(int h = 0; h < mtz.length; h++) {
				mtz[h][i] = val[h];
			}
			
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
