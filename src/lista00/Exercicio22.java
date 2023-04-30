/*
 22) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar uma terceira matriz (N x (M+P)), sendo que para cada linha inter-
calar suas respectivas colunas e apresentar as três matrizes.
 Igor Kaue Nardes de Castro - 3 ADS
 */
package lista00;

import java.util.Scanner;
import java.util.Random;

public class Exercicio22 {

	static Scanner scan;
	static int[][] mtzResultado;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0, dimN = 0, dimM = 0, dimP = 0, mtzQ[][], mtzW[][];
		
		do {
			
			try {
				System.out.println("\n\n**Gerando duas matrizes e intercalando as mesmas.\n\n");
				
				dimN = gerarRandom(6);//valor max random gerado 5
				dimM = gerarRandom(6);
				dimP = gerarRandom(6);
							
				mtzQ = gerarMatriz(dimN, dimM);
				mtzW = gerarMatriz(dimN, dimP);
				mtzResultado = gerarMatriz(dimN, dimM + dimP);
				
				mtzQ = adicionarValRandom(mtzQ, 10);//valor max random gerado 10 
				mtzW = adicionarValRandom(mtzW, 10);
				
				intercalarMtz(mtzQ, mtzW);
				
				lerMatriz(mtzQ, mtzW, mtzResultado);
				
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){/*System.out.println(e);*/}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static void lerMatriz(int[][] mtzA, int[][] mtzB, int[][] mtzC) {
		
		System.out.println("*Matriz A gerada");
		for(int i = 0; i < mtzA.length; i++) {
			for(int x = 0; x < mtzA[i].length; x++) 
				System.out.print((x == 0) ? mtzA[i][x] : "\t" + mtzA[i][x]);	
			System.out.println();
		}
		
		System.out.println("*Matriz B gerada");
		for(int i = 0; i < mtzB.length; i++) {
			for(int x = 0; x < mtzB[i].length; x++) 
				System.out.print((x == 0) ? mtzB[i][x] : "\t" + mtzB[i][x]);
			System.out.println();
		}
		
		System.out.println("*Matriz resultado: ");
		for(int i = 0; i < mtzC.length; i++) {
			for(int x = 0; x < mtzC[i].length; x++) 
				System.out.print((x == 0) ? mtzC[i][x] : "\t" + mtzC[i][x]);
			System.out.println();
		}
	}
	
	static void intercalarMtz(int[][] mtzA, int[][] mtzB) {	
		
		for(int i = 0; i < mtzResultado.length; i++) {	
			
			int pos = 0;			
			mtzResultado[i][0] = mtzA[i][pos];
			
			for(int x = 1; x < mtzResultado[i].length; x++) {					
				if(x % 2 == 0) {
					if(x <= ((mtzA[i].length - 1) + (mtzA[i].length - 1)))//intercala
						mtzResultado[i][x] = mtzA[i][pos];
					else {
						mtzResultado[i][x] = mtzB[i][pos];//adiciona
						pos++;
					}
				}else {
					if(x <= ((mtzB[i].length - 1) + (mtzB[i].length - 1))) {//intercala
						mtzResultado[i][x] = mtzB[i][pos];
						pos++;
					}else {
						mtzResultado[i][x] = mtzA[i][pos];//adiciona
						pos++;
					}						
				}
			}			
		}
	}
	
	static int[][] adicionarValRandom(int[][] mtz, int valRndMax) {
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 
				mtz[i][x] = gerarRandom(valRndMax);			
		}
		
		return mtz;
	}
	
	static int[][] gerarMatriz(int dimX, int dimY){
		int[][] mtzResult = new int[dimX][dimY];		
		return mtzResult;
	}
	
	static int gerarRandom(int valMax) {
		Random rnd = new Random();
		int rndResult = 0;
		
		do {
			rndResult = rnd.nextInt(valMax);
		}while(rndResult < 2);
		
		return rndResult;
	}

}
