/*
-[POO-023] ===Desafio!!!=== Crie um programa que solicite ao usuário um número inteiro, que
representará a quantidade de números inteiros que serão digitados em seguida e armazenados em um
array. Através de um método que receba esse array de números inteiros como parâmetro de entrada,
calcule e retorne o MMC (Mínimo Múltiplo Comum) desse conjunto de dados. Valide as entradas para
aceitar apenas números positivos (pode ser um método). Utilize decomposição simultânea ou fatoração
simultânea.
Igor Kaue Nardes de Castro
 */
package lista04;

import java.util.Scanner;

public class Exercicio10 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		String preEscolha;
		
		do {
			
			try {
				
				System.out.print("Entre com a quantidade de termos: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				if(op == 0)
					System.out.println();
				else {
					if(op <= 1)
						System.out.println("Erro! Valor inválido.");
					else {
						int[] valores = new int[op];
						
						for(int i = 0; i < op; i++) {
							System.out.print("Entre com o " + (i + 1) + "º numero: ");
							preEscolha = scan.next();
							valores[i] = Integer.parseInt(preEscolha);
						}
						
						System.out.println();
						
						System.out.print("MMC: " + calculoMMC(valores));
					}
					
				}
				
				
				//menu para sair
				op = 0;
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){/*System.err.println(e);*/}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static int calculoMMC(int[] valores) {
		
		int mmcMin = 2, mmc = 1, contMotor, cont;//mmcMin: valor do divisor
		boolean motor = false;
		
		for(int i = 0; i < valores.length; i++) {//verifica se todos os termos sao iguais a 1
			if(valores[i] != 1)
				motor = true;
		}		
		
		while(motor) {
			contMotor = 0;
			cont = 0;
			
			for(int i = 0; i < valores.length; i++) {
				if(valores[i] % mmcMin == 0) {
					valores[i] /= mmcMin;
					cont++;
				}			
			}	
			
			if(cont > 0)//verifica se algum termo foi dividido, caso não for, incrementa o valor do divisor
				mmc *= mmcMin;
			else
				mmcMin++;
			
			//verifica motor
			for(int i = 0; i < valores.length; i++) {
				if(valores[i] == 1)
					contMotor++;
			}
			if(contMotor == valores.length)//estoura o laço
				motor = false;			
		}
		return mmc;
	}

}