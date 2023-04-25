/*
31) Escreva um programa em Java para gerar uma matriz (N x M). O usuário deve informar uma faixa de valores inteiros positivos (valor inicial e valor final). O programa deve gerar aleatoriamente os elementos da matriz, respeitando a faixa de valores fornecida pelo usuário. Ao final, imprimir a matriz resultante.
Igor Kaue Nardes de Castro
 */

package lista01;

import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {
	
	static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		
		do {			
			try {				
				int dimN = gerarRandom(7), dimM = gerarRandom(7), valMinRnd = 0, valMaxRnd = 0;
				String preEscolha = "";
				int mtzPrincipal[][] = new int[dimM][dimN];
				
				do {					
					System.out.print("Digite o valor minimo para números gerados na matriz: ");
					preEscolha = scan.next();
					valMinRnd = Integer.parseInt(preEscolha);
					System.out.print("Digite o valor maximo para números gerados na matriz: ");
					preEscolha = scan.next();
					valMaxRnd = Integer.parseInt(preEscolha);	
					
					System.out.println((valMaxRnd < valMinRnd || valMaxRnd < 0) ? "\n-Erro: Valor minimo deve ser menor que o maximo e maior que 0!" : "");
				}while(valMaxRnd < valMinRnd || valMaxRnd < 0);
				
				
				for(int i = 0; i < mtzPrincipal.length; i++){
		            for(int x = 0; x < mtzPrincipal[i].length; x++) {
		            	mtzPrincipal[i][x] = gerarRandom(valMaxRnd, valMinRnd);
		            }
				}
					
				System.out.println("-Matriz gerada");
				lerMatriz(mtzPrincipal);				
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.out.println("ERRO (e): " + e);}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();

	}
	
	static void lerMatriz(int[][] mtz) {
		
    	for(int i = 0; i < mtz.length; i++){    		
            for(int x = 0; x < mtz[i].length; x++)
                System.out.print((x == 0) ? mtz[i][x] : "\t" + mtz[i][x]);            
            System.out.println();
        }
    }
	
	static int gerarRandom(int valMaxRandom, int valMinRandom) {
		if(valMaxRandom == valMinRandom) 
			return valMaxRandom;
		else {
			Random rnd = new Random();
			int valResult = 0;
			do 
				valResult = rnd.nextInt(valMaxRandom) + 1;
			while(valResult < valMinRandom);
			return valResult;
		}
	}
	
	static int gerarRandom(int valMaxRandom) {
		Random rnd = new Random();
		int valResult = 0;
		do {
			valResult = rnd.nextInt(valMaxRandom);
		}while(valResult < 2);
		return valResult;
	}

}
