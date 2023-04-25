/*
[POO-022] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MMC (Mínimo
Múltiplo Comum) destes números fornecidos. Utilize decomposição simultânea ou fatoração simultânea.
Igor Kaue Nardes de Castro
 */

package lista04;

import java.util.Scanner;

public class Exercicio9 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0, valores[] = new int[2];
		String preEscolha;
		
		do {
			
			try {
				
				System.out.print("Digite o primeiro valor: ");
				preEscolha = scan.next();
				valores[0] = Integer.parseInt(preEscolha);
				
				System.out.print("Digite o primeiro valor: ");
				preEscolha = scan.next();
				valores[1] = Integer.parseInt(preEscolha);
				
				System.out.println();
				
				System.out.print("MMC: " + calculoMMC(valores));
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static int calculoMMC(int[] valores) {
		
		int mmcMin = 2, mmc = 1, cont = 0;//se cont for maior que 1, entao o mmcMin é multiplicado
		boolean trueMmc = true;
		
		while(valores[0] > 1 || valores[1] > 1) {
			cont = 0;//reseta o valor de cont para um novo teste
						
			if(valores[0] % mmcMin == 0) {
				valores[0] /= mmcMin;
				cont++;
			}
			
			if(valores[1] % mmcMin == 0) {
				valores[1] /= mmcMin;
				cont++;
			}
			
			if(cont > 0) 
				mmc *= mmcMin;
			else 
				mmcMin++;		
			
		}
		return mmc;
	}

}
