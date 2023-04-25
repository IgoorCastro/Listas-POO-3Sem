/*
[POO-020] Crie um programa que solicite ao usuário dois números inteiros. Através de um método que
receba esses dois números inteiros como parâmetro de entrada, calcule e retorne o MDC (Máximo Divisor
Comum) destes números fornecidos.
Igor Kaue Nardes de Castro
 */

package lista04;

import java.util.Scanner;

public class Exercicio7 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		int[] valores = new int[2];
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
				
				System.out.print("MDC: " + calculoMDC(valores));
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static int calculoMDC(int[] valores) {
		
		int mdcMin = 2, mdc = 1;
		boolean trueMdc = true;
		
		while(valores[0] > 1 && valores[1] > 1) {
			trueMdc = true;
			
			if(valores[0] % mdcMin != 0) {
				trueMdc = false;
			}else {
				valores[0] /= mdcMin;
			}
			
			if(valores[1] % mdcMin != 0) {
				trueMdc = false;
			}else {
				valores[1] /= mdcMin;
			}
			if(!trueMdc)
				mdcMin++;
			else
				mdc *= mdcMin;
		}
		return mdc;
	}

}