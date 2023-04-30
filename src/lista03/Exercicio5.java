package lista03;

import java.util.Scanner;

public class Exercicio5 {

	static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int op = 0;
		int[] primos = new int[168];
		String preEscolha;
		
		guardarPrimos(primos);//guarda os valores primos no vetor já dimensionado
		
		do {
			
			try {
				
				System.out.println("-- Teste de primos --");
				
				do {
					System.err.println("- Valores de 1 a 1000 -\n");
					System.out.print("Digite o valor: ");
					preEscolha = scan.next();
					op = Integer.parseInt(preEscolha);
				}while(op < 1 || op > 1000);
				
				System.out.println("Valor pesquisado: " + op + "\nResultado: " + buscaPrimos(primos, op));
				
				lerVetor(primos);
				
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.err.println(e);}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static boolean buscaPrimos(int[] vet, int valBusca) {
		
		int inicio = 0, meio = vet.length / 2, fim = vet.length - 1;
		
		while(inicio <= fim) {
			if(vet[meio] == valBusca)
				return true;
			else {
				if(valBusca > vet[meio])
					inicio = meio + 1;					
				else
					fim = meio - 1;
			}
			
			meio = (inicio + fim) / 2;
			
			
			System.out.println("Inicio: " + inicio + "\nFim: " + fim + "\nMeio: " + meio + "\nValor:" + vet[meio]);
			System.out.println();
		}		
		return false;
	}
	
	static void lerVetor(int[] vet) {
		int quebraLinha = 0;//quebra a linha dps de escrever 20 numeros
		for(int i = 0; i < vet.length; i++) {
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
