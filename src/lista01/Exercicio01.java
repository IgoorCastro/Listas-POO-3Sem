/*
1) Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e
imprimir seus elementos.
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista01;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[4][5];
		int op = 0;
		
		do {
			
			try {
				
				a = gerarMatriz(4, 5);
				lerMatriz(a);
				
				System.out.printf("\nDigite '1' para sair ou outro valor para gerar outra Matriz: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){} 
			System.out.println();
			
		}while(op != 1);
		
		System.out.printf("Fim!");
		scan.close();
		
	}
	
	static int[][] gerarMatriz(int lin, int col) {
		
		Random rnd = new Random();
		int mtz[][] = new int[lin][col];
				
		for(int h = 0; h < 4; h++) 			
			for(int j = 0; j < 5; j++) 				
				mtz[h][j] = rnd.nextInt(100);
		
		return mtz;
	}
	
	static void lerMatriz(int[][] mtz){
		
		for(int h = 0; h < 4; h++) {
			
			for(int j = 0; j < 5; j++) {

				if(j == 0)
					System.out.print(mtz[h][j]);
				System.out.printf("\t" + mtz[h][j]);
				
			}
			
			System.out.println();
			
		}
		
	}

}
