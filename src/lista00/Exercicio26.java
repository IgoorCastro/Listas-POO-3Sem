/*
26) Escreva um programa em Java para gerar uma matriz W (N x M). Ordem
os elementos da matriz de forma decrescente e imprimir a matriz original e a
matriz ordenada.
Igor Kaue Nardes de Castro
 */
package lista00;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio26 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				int mtzY[][], mtzOdenada[][], dimN = 8, dimM = 6, valMaxRnd = 8;
				
				mtzY = gerarMatriz(dimN, dimM);
				mtzOdenada = gerarMatriz(dimN, dimM);
				
				mtzY = gerarMtzRandom(mtzY, valMaxRnd);
				
				mtzOdenada = ordenarDecrescenteMtz(mtzY);
				
				System.out.println("*Matriz gerada:");
				lerMatriz(mtzY);
				
				System.out.println("\n*Matriz ordenada:");
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
	
	static int[][] ordenarDecrescenteMtz(int[][] mtz){
		
		int[] valores = new int[mtz.length * mtz[0].length];
		
		int valIndex = 0, mtzResult[][] = new int[mtz.length][mtz[0].length];
		
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) {
				valores[valIndex] = mtz[i][x];
				valIndex++;	
			}
		}
		
		Arrays.sort(valores);//metodo da classe Arrays que ordena valores
		
		int[] valoresDecrescente = new int[valores.length]; 
		for(int i = 0; i < valoresDecrescente.length; i++) {
			valoresDecrescente[i] = valores[valores.length - 1 - i];//pega os valores ordenados do ulitmo para o primeiro
		}
		
		valIndex = 0;
		for(int i = 0; i < mtzResult.length; i++) {
			for(int x = 0; x < mtzResult[i].length; x++) {
				mtzResult[i][x] = valoresDecrescente[valIndex];
				valIndex++;
			}
		}
		
		return mtzResult;
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
