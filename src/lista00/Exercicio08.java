/*
8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das duas possibilidades (sem elementos pares ou ímpares).
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista00;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio08 {
	
	static int mtzF[][], vetImpar[], vetPar[], contImpar, contPar, dimensaoM = 0, dimensaoN = 0;	
	static String preEscolha = "";
	static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		
		
		do {
			
			try {
				
				System.out.println("\n\n--- Defina a dimensao de uma matriz e veja a recorencia de valores pares e impares na mesma ---\n---\t*** VALORES INTEIROS MAIORES QUE 0 *** \\t---\\n\\n");
				
				setdimensao();
				
				setRandom();
				
				buscarOcorrencias();
				
				lerResultado();
				System.out.print("");
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}			
		}while(op != 1);
		scan.close();
		System.out.print("Fim!");
	}
	
	static void lerResultado() {
		
		System.out.println((contPar > 1) ? "\n\n\t- Econtrada(s) " + contPar + " ocorrencias de valores pares!\nElementos encontrados: " + Arrays.toString(vetPar) : "Não foi encontrado valores par na matriz.");
		
		System.out.println((contImpar > 1) ? "\t- Econtrada(s) " + contImpar + " ocorrencias de valores impares!\nElementos encontrados: " + Arrays.toString(vetImpar) : "Não foi encontrado valores par na matriz.");
		
		System.out.println("\n\n-Matriz gerada\n");
		for(int i = 0; i < mtzF.length; i++) {
			for(int x = 0; x < mtzF[i].length; x++) 
				System.out.print((x == 0) ? mtzF[i][x] : "\t" + mtzF[i][x]);
			System.out.println();
		}
	}

	static void buscarOcorrencias() {
		for(int i = 0; i < mtzF.length; i++) {
			for(int x = 0; x < mtzF[i].length; x++) {
				if((mtzF[i][x] % 2) == 0 && mtzF[i][x] > 0) 
					contPar++;				
				if((mtzF[i][x] % 2) != 0 && mtzF[i][x] > 0) 
					contImpar++;				
			}			
		}
		
		vetImpar = new int[contImpar];
		vetPar = new int[contPar];		
		
		int contImp = 0, contPr = 0;
		
		for(int i = 0; i < mtzF.length; i++) {
			for(int x = 0; x < mtzF[i].length; x++) {
				if((mtzF[i][x] % 2) == 0 && mtzF[i][x] > 0) {
					vetPar[contPr] = mtzF[i][x];
					contPr++;
				}else {
					if((mtzF[i][x] % 2) != 0 && mtzF[i][x] > 0) {
						vetImpar[contImp] = mtzF[i][x];		
						contImp++;
					}
				}
			}
		}
	}
	
	static void setRandom() {
		Random rnd = new Random();
		for(int i = 0; i < mtzF.length; i++) {
			for(int x = 0; x < mtzF[i].length; x++) 
				mtzF[i][x] = rnd.nextInt(51);
			}		
	}
	
	static void setdimensao() {
		
		do {			
			System.out.print("\n\nDigite a quantidade de linhas: ");
			preEscolha = scan.next();
			dimensaoN = Integer.parseInt(preEscolha);
			//--
			System.out.print("Digite a quantidade de colunas: ");
			preEscolha = scan.next();
			dimensaoM = Integer.parseInt(preEscolha);
			//--
			mtzF = new int[dimensaoN][dimensaoM];
		}while(dimensaoN < 1 || dimensaoM < 1);
		
	}
}
