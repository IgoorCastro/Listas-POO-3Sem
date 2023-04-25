/*
30) Item ao exercício anterior, mas utilizando a sequencia de Fibonacci.
Igor Kaue Nardes de Castro
 */
package lista01;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ALUNO
 */
public class Exercicio30 {

    static Scanner scan;
    static int[] memoria;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int opExit = 0, opEscolha = 0, valMaxRnd = 12;
        String preEscolha;
		
		do {
			
			try {
				
				System.out.print("Digite um valor para gerar um vetor: ");
                preEscolha = scan.next();
                opEscolha = Integer.parseInt(preEscolha);
                
                int[] vetor = new int[opEscolha];
                int[][] mtzPrincipal = new int[opEscolha][];
                                
                for(int i = 0; i < vetor.length; i++){
                	
                    vetor[i] = gerarRandom(valMaxRnd) + 1;
                    mtzPrincipal[i] = new int[vetor[i] + 1];
                    mtzPrincipal[i][0] = vetor[i];  
                    
                    int cont = 0;
                    
                	for(int k = 1; k < mtzPrincipal[i].length; k++) {                		
                		mtzPrincipal[i][k] = fibonacci(cont);
                		cont++;
                	}
                }
                
                System.out.println();
                
                System.out.println("-Vetor random");
                
                lerVetor(vetor);
                
                System.out.println();
				
                System.out.println("-Matriz Resultante");
                
                lerMatriz(mtzPrincipal);                
                
                
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				opExit = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.out.println("\nerro: " + e);}
			
		}while(opExit != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
    
	static int fibonacci(int pos) {//recursão com memoria		
		/*if(pos <= 1) {
			return memoria[pos];
		}else {
			if(memoria[pos] != 0) {
				return memoria[pos];
			}else {
				memoria[pos] = fibonacci(pos - 1) + fibonacci(pos - 2);
				return memoria[pos];
			}				
		}*/		
		return (pos <= 1 ? pos : fibonacci(pos - 1) + fibonacci(pos - 2));
	}
	
	static void lerVetor(int[] vetor) {
		for(int i : vetor) {
			System.out.print(i + "\t");
		}
	}
	
    static void lerMatriz(int[][] mtz) {
    	for(int i = 0; i < mtz.length; i++){
            for(int x = 0; x < mtz[i].length; x++)
                System.out.print((x == 0) ? mtz[i][x] : "\t" + mtz[i][x]);            
            System.out.println();
        }
    }
        
    static int gerarRandom(int valRandoMax){
        Random rnd = new Random();
        return rnd.nextInt(valRandoMax);
    }
    
}