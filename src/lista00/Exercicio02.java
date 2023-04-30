/*
2) Escreva um programa em Java para geral aleatoriamente os elementos
(menor que 100) de uma matriz B de 6 linha por 3 colunas, imprimir a matriz
gerada e imprimir a matriz em ordem invertida.
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista00;
import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

	static int[][] c;
	
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int op = 0;
		
		do {
			
			try {
				
				gerarMatriz(6, 3);
				System.out.print("-----\n");
				escreverMatriz(6, 3);
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para gerar outra Matriz: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){} 
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();

	}

	static void gerarMatriz(int lin, int col){
		
		c = new int[lin][col];
		Random rnd = new Random();
		
		for(int i = 0; i < lin; i++) {			
			for(int y = 0; y < col; y++) 
				c[i][y] = rnd.nextInt(100);
		}
		
	}
	
	static void escreverMatriz(int lin, int col) {
		
		int i, y;
		
		System.out.print("-Matriz\n");
		for(i = 0; i < lin; i++) {	
			
			for(y = 0; y < col; y++) 
				System.out.print((y == 0) ? c[i][y] : "\t" + c[i][y] + " ");
			System.out.println();
			
		}
		
		System.out.print("\n-Matriz invertida\n");
		for(i = lin - 1; i >= 0; i--) {		
			
			for(y = col - 1; y >= 0; y--) 
				System.out.print((y == col - 1) ? c[i][y] : "\t" + c[i][y] + " ");
			System.out.println();
			
		}
	}
}
