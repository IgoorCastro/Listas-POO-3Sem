/*
7) Escreva um programa em Java para gerar uma matriz E de dimensão N x M, determinar e imprimir o maior e o menor elemento deste conjunto, informando a posição
dos mesmos 
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista00;

import java.util.Random;
import java.util.Scanner;

public class Exercicio07 {

	static Scanner scan;
	static int dimensaoN = 0, dimensaoM = 0, mtzE[][], valMaxRnd, valMaior = 0, valMenor = 0;
	static String preEscolha = "";
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0;
		
		do {			
			try {
				//---
				System.out.println("\n\n--- Defina a dimensao de uma matriz e descubra o menor e o maior valor contidos nela ---");
				System.out.println("---\t*** VALORES INTEIROS MAIORES QUE 0 *** \t---\n\n");
				setDimensao();
				//---
				System.out.print("\nDigite o valor maximo de números aleatórios gerados: ");	
				setValMaxRnd();
				setRandom(valMaxRnd);
				//---
				buscarExtremos();
				buscarInfos();
				//---
				lerMatriz();
				
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}			
		}while(op != 1);		
		scan.close();
		System.out.print("Fim!");		
	}
	
	static void buscarInfos() {
		
		int contValMaior = 0, contValMenor = 0;
		String posicoesValMaior = "", posicoesValMenor = "";
		
		for(int i = 0; i < mtzE.length; i++) {
			for(int x = 0; x < mtzE[i].length; x++) {
				if(mtzE[i][x] == valMenor) {
					posicoesValMenor += "Lin: " + i + " - Col: " + x + "\n";
					contValMenor++;
				}
				if(mtzE[i][x] == valMaior) {
					posicoesValMaior += "Lin: " + i + " - Col: " + x + "\n";
					contValMaior++;
				}
			}
		}
		System.out.print("\n*** Valor maior: " + valMaior + "\nPosições encontradas\n" + posicoesValMaior + "Quantidade de ocorrencias: " + contValMaior);
		System.out.print("\n\n*** Valor menor: " + valMenor + "\nPosições encontradas\n" + posicoesValMenor + "Quantidade de ocorrencias: " + contValMenor);
	}

	static void lerMatriz() {
		System.out.println("\n\n-Matriz gerada\n");
		for(int i = 0; i < mtzE.length; i++) {
			for(int x = 0; x < mtzE[i].length; x++) 
				System.out.print((x == 0) ? mtzE[i][x] : "\t" + mtzE[i][x]);
			System.out.println();
		}
	}
	
	static void buscarExtremos() {
		valMenor = mtzE[0][0];
		valMaior = mtzE[0][0];
		for(int i = 0; i < mtzE.length; i++) {
			for(int x = 1; x < mtzE[i].length; x++) {
				if (valMaior < mtzE[i][x]) 
					valMaior = mtzE[i][x];					
				
				if(valMenor > mtzE[i][x]) 
					valMenor = mtzE[i][x];				
			}
		}
		//System.out.print("Maior: " + valMaior + "\tMenor: " + valMenor);
	}
	
	static void setRandom(int valMax) {
		Random rnd = new Random();
		for(int i = 0; i < mtzE.length; i++) {
			for(int x = 0; x < mtzE[i].length; x++) 
				mtzE[i][x] = rnd.nextInt(valMax);
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
			System.out.print("\nDigite o valor de linha(s) da matriz: ");
			preEscolha = scan.next();
			dimensaoN = Integer.parseInt(preEscolha);
			//---
			System.out.print("Digite o valor de coluna(s) da matriz: ");
			preEscolha = scan.next();
			dimensaoM = Integer.parseInt(preEscolha);
		}while(dimensaoN < 1 || dimensaoM < 1);	
		mtzE = new int[dimensaoN][dimensaoM];
	}
}
