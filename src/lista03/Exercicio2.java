/*
[POO-015] Crie um programa de conversão de temperaturas em Celsius para Fahrenheit e vice-versa. O
usuário deverá escolher se o valor de temperatura que será informado em Celsius ou em Fahrenheit. Se a
entrada for em Celsius, a saída deverá ser em Fahrenheit e o contrário, também, é verdade. O processo de
conversão deverá ser feito através de um ou mais métodos que recebe a temperatura fornecida como
parâmetro de entrada e retorne a temperatura convertida. Para os cálculos de conversão, utilize as
fórmulas C = 5 * (F - 32) / 9 e F = (9 * C / 5) + 32. O programa deve ser executado enquanto o usuário
desejar.
Igor Kaue Nardes de Castro
 */

package lista03;

import java.util.Scanner;

public class Exercicio2 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		char opConvert = ' ';		
		
		do {
			
			try {
				
				System.out.print("-- Conversão de temperatura --\n");
				
				do {
					System.out.print("[C] Celsius, [F] Fahrenheit e [S] Sair: ");
					opConvert = scan.next().charAt(0);
					
					if(opConvert != 'c' && opConvert != 'f' && opConvert != 's')
						System.err.print("Opção Inválida!\n");	
					
				}while(opConvert != 'c' && opConvert != 'f' && opConvert != 's');
				

				if(opConvert == 'c' || opConvert == 'f') {						
					System.out.println((opConvert == 'f') ? "\n-- Conversão de Fahrenheit para Celsius." : "\n-- Conversão de Celsius para Fahrenheit.\n");
					
					System.err.println("\n- Apenas valores inteiros!\n");
					
					System.out.print("Entre com a temperatura: ");
					String preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
					
					System.out.println("Saida: " + convertTemp(op, opConvert) + "\n\n");
				}				
								
			}catch(Exception e){}
			
		}while(op != 1 && opConvert != 's');
		
		System.out.print("Fim!");
		scan.close();
	}

	static int convertTemp(int valTemp, char op) {					
		return (op == 'f') ? 5 * (valTemp - 32) / 9 : (9 * valTemp / 5) + 32;
	}
	
}
