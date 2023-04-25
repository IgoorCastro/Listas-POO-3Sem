/*
[POO-014] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit. O usuário
deverá informar a temperatura em Celsius e será apresentada a temperatura em Fahrenheit. O processo de
conversão deverá ser feito através de um método que recebe a temperatura em Celsius como parâmetro
de entrada e retorne a temperatura convertida para Fahrenheit. Para o cálculo da conversão, utilize a
fórmula F= (9*C/5) + 32.
Igor Kaue Nardes de Castro
 */
package lista04;

import java.util.Scanner;

public class Exercicio1 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0, valF = 0;//valF: valor em Fahrenheit
		String preEscolha;
		
		do {			
			try {
				
				System.out.print("-- Conversão °C para °F --\n");
				System.err.println("- Apenas valores inteiros!\n");
				
				System.out.print("Entre com temperatura em Celsius: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
				valF = convertCtoF(op);
				
				System.out.println("A temperatura em Fahrenheit é: " + valF);
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){/*System.err.println("Erro: " + e);*/}			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	static int convertCtoF(int valC) {		
		return (9 * valC / 5) + 32;
	}
}
