/*
23) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
Igor Kaue Nardes de Castro - 3 ADS
 */
package lista00;

import java.util.Scanner;

public class Exercicio23 {
	
	static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0, dimM = 0, dimN = 0, mtzEntrada[][];
		
		do {			
			try {				
				do{
					System.out.println("\n\n-Digite as dimensões da matriz e veja os valores primos na mesma-");
					System.out.println("\t*** VALORES INTEIROS MAIOR QUE 1 ***\n\n");

		
					System.out.print("Digite o valor de linhas da matriz: ");
					dimM = setDimensao();//dimM = linhas
					System.out.print("Digite o valor de colunas da matriz: ");
					dimN = setDimensao();//dimN = colunas
					System.out.println((dimN  < 2 || dimM < 2) ? "\nErro: Valor deve ser maior que 1!" : "");
								
					}while(dimN  < 2 || dimM < 2);
					
					mtzEntrada = gerarMatriz(dimM, dimN);
					
					mtzEntrada = inserirPrimos(mtzEntrada);		
					
					lerMatriz(mtzEntrada);
					
					//menu para sair
					System.out.print("\nDigite '1' para sair ou outro valor para continuar: ");
					String preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){/*System.out.println("\n\ne: " + e + "\n");*/}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();		
	}
	
	static void lerMatriz(int[][] mtz) {
			
		System.out.println("*Matriz gerada");
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 
				System.out.print((x == 0) ? mtz[i][x] : "\t" + mtz[i][x]);	
			System.out.println();
		}
	}
	
	static int[][] inserirPrimos(int[][] mtzEntrada){		
		
		int primos = 2;
		
		for(int i = 0; i < mtzEntrada.length; i++) {
			for(int x = 0; x < mtzEntrada[i].length; x++) {	
				int cont = 0;
				
				for(int h = primos; h >= 1; h--) {	
					if(primos % h == 0) 
						cont++;		
				}				
				if(cont == 2) {
					mtzEntrada[i][x] = primos;
				}else
					x--;
				
				primos++;				
			}
		}
		
		return mtzEntrada;
	}
	
	static int[][] gerarMatriz(int linhas, int colunas){
		int[][] mtz = new int[linhas][colunas];
		
		return mtz;
	}
	
	static int setDimensao() {		
		int dimensao = 0;		
		
		String preEscolha = scan.next();
		dimensao = Integer.parseInt(preEscolha);		
		return dimensao;
	}
	
}
