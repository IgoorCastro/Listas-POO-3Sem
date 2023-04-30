package lista03;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio6 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0, valEscolha[] = new int[2];
		int[] primos = new int[168];
		String preEscolha;
		
		guardarPrimos(primos);//guarda os valores primos no vetor já dimensionado
		
		do {
			
			try {
				
				System.out.println("-- Primos por intervalo --");
				
				do {
					System.err.println("- Valores de 1 a 1000 -\n");
					System.out.print("Digite um valor: ");
					preEscolha = scan.next();
					valEscolha[0] = Integer.parseInt(preEscolha);
					
					System.out.print("Digite um valor: ");
					preEscolha = scan.next();
					valEscolha[1] = Integer.parseInt(preEscolha);
				}while(valEscolha[0] < 1 || valEscolha[0] >= 1000 || valEscolha[1] < 1 || valEscolha[1] >= 1000);
				
				//System.out.println("Valor pesquisado: " + op + "\nResultado: " + buscaPrimos(primos, op));
				
				lerVetor(primos, buscaIndexPrimos(primos, valEscolha));
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.err.println(e);}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static void lerVetor(int[] vet, int[] posicoes) {
		if(posicoes[0] == posicoes[1]) 
			System.out.print(vet[posicoes[0]]);
		else {
			int quebraLinha = 0;//quebra a linha dps de escrever 20 numeros
			for(int i = posicoes[0] + 1; i < posicoes[1] + 1; i++) {
				if(quebraLinha <= 20) {				
					System.out.print((quebraLinha == 0) ? vet[i] : "\t" + vet[i]);
					quebraLinha++;
				}
				else {
					System.out.println();
					quebraLinha = 0;
				}
			}
		}
	}
	
	static int[] buscaIndexPrimos(int[] vet, int[] valores) {
		
		Arrays.sort(valores);//ordena os valores
		int vetIndex[] = new int[2];
		boolean exit;
		
		for(int i = 0; i < 2; i++) {	
			exit = true;//permite que o laço seja executado
			int inicio = 0, meio = vet.length / 2, fim = vet.length - 1;		
			
			while(exit) {				
				
				if(valores[i] < 2 ) {					
					vetIndex[i] = 0;
					exit = false;
					
				}else {
					
					if(vet[meio] == valores[i] || inicio > fim) {
						vetIndex[i] = meio;
						exit = false;
					}
					else {
						if(valores[i] > vet[meio])
							inicio = meio + 1;					
						else
							fim = meio - 1;
					}
				}
				
				meio = (inicio + fim) / 2;
				
				System.out.println("Inicio: " + inicio + "\nFim: " + fim + "\nMeio: " + meio + "\nValor meio:" + vet[meio]);
				System.out.println("vetIndex: " + vetIndex[0] + "vetIndex: " + vetIndex[1]);
				System.out.println();				
			}	
		}
		return vetIndex;
	}
		
	static void guardarPrimos(int[] vet) {
		//boolean isPrimo = true;
		int primo = 2;
		for(int i = 0; i < vet.length; i++) {
			int cont = 0;
						
			for(int x = primo; x >= 1; x--) {
				if(primo % x == 0)
					cont++;				
			}
			
			if(cont == 2)
				vet[i] = primo;
			else
				i--;
			
			primo++;
			
		}
	}

}
