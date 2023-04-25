/*
3) Escreva um programa em Java para ler uma matriz C quadrada de dimensão N,
onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
número o tamanho da matriz quadrada (dimensão) e os elementos podem ser gerados
aleatoriamente (menor que 100).
Igor Kaue Nardes de Castro - 3° ADS
 */
package lista01;
import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	static int dimensao, c[][];
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		int op = 0;
		
		do {
			
			try {
				
				System.out.print("\n-Crie a matriz!\n");
				valEscolha();
				criarMatriz();
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.out.println(e);}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static void valEscolha() {
		do {
			
			try {
				
				System.out.print("Digite o tamanho ' 0 a 20 ' da matriz quadrada: ");
				String preEscolha = scan.next();
				dimensao = Integer.parseInt(preEscolha);
				
			}catch(Exception e){
				System.out.println("Digite um valor de 1 a 20!\n");
			}
			
		}while(dimensao < 1 | dimensao > 20);
		
	}
	
	static void criarMatriz() {
		
		Random rnd = new Random();
		c = new int[dimensao][dimensao];
		
		for(int i = 0; i < dimensao; i++) {
			for(int j = 0; j < dimensao; j++) {
				c[i][j] = rnd.nextInt(100);
				System.out.print((j == 0) ? c[i][j] : "\t" + c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
