/*
[POO-016] ===Desafio!!!=== Semelhante ao exercício [POO-015] Crie um programa de conversão de
temperaturas, mas agora com três possibilidades de unidade de medida: Celsius, Fahrenheit e Kelvin. A
saída deverá ser as outras duas temperaturas, exemplo: entrada em Celsius, a saída deve ser em Fahrenheit
e Kelvin. O processo de conversão deverá ser feito através de um ou mais métodos que recebe a
temperatura fornecida como parâmetro de entrada e retorne as temperaturas convertidas. Para os cálculos
de conversão, utilize as fórmulas C = 5 * (F - 32) / 9, F = (9 * C / 5) + 32 e K = C + 273. O programa deve ser
executado enquanto o usuário desejar.
Igor Kaue Nardes de Castro
 */

package lista04;

import java.util.Scanner;

public class Exercicio3 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		char opConvert = ' ';		
		
		do {
			
			try {
				
				System.out.print("-- Conversão de temperatura --\n");
				
				do {
					System.out.print("[C]Celsius, [F] Fahrenheit, [K] Kelvin e [S] Sair: ");
					opConvert = scan.next().charAt(0);
					
					if(opConvert != 'c' && opConvert != 'f' && opConvert != 's' && opConvert != 'k')
						System.err.print("Opção Inválida!\n");	
					
				}while(opConvert != 'c' && opConvert != 'f' && opConvert != 's' && opConvert != 'k');
				

				if(opConvert == 'c' || opConvert == 'f' || opConvert == 'k') {						
					if(opConvert == 'c')
						System.out.println("\n-- Conversão de Celsius para Fahrenheit e Kelvin.");
					else
						System.out.println((opConvert == 'f') ? "\n-- Conversão de Fahrenheit para Celsius e Kelvin." : "\n-- Conversão de Kelvin para Fahrenheit e Celsius.");
						
					
					System.err.println("\n- Apenas valores inteiros!\n");
					
					System.out.print("Entre com a temperatura: ");
					String preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
					
					int[] conversao = convertTemp(op, opConvert);
					
					if(opConvert == 'c')
						System.out.println(	"\nF: " + conversao[0] +
											"\nK: " + conversao[1]);
					else
						System.out.println((opConvert == 'f') ? "\nC: " + conversao[0] +
																"\nK: " + conversao[1] :
																"\nF: " + conversao[0] +
																"\nC: " + conversao[1]);
					}				
								
			}catch(Exception e){System.err.println(e);}
			
		}while(op != 1 && opConvert != 's');
		
		System.out.print("Fim!");
		scan.close();
	}

	static int[] convertTemp(int valTemp, char op) {	
		int[] result = new int[2]; 
		
		if(op == 'c') {//op Celsius
			result[0] = (9 * valTemp / 5) + 32;//C to F
			result[1] = valTemp + 273;//C to K
		}		
		else {
			if(op == 'f') {//op Fahrenheit
				result[0] = 5 * (valTemp - 32) / 9;//F to C
				result[1] = (valTemp - 32) * 5 / 9 + 273;//F to K
			}else {//op Kelvin
				result[0] = (valTemp - 273) * 9 / 5 + 32;//K to F
				result[1] = valTemp - 273;//K to C
			}
		}
		return result;
	}
	
}
