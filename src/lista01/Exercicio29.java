/*
29) Escreva um programa em Java para solicitar ao usuário um valor. Este valor lido
será a quantidade de elementos de um vetor. Gerar os elementos do vetor. A partir do
vetor gerado, criar uma matriz, onde a quantidade de linhas será igual à quantidade
de elementos do vetor e as colunas serão os valores dos elementos do vetor mais um.
Com a matriz criada, armazenar na primeira coluna de cada linha o respectivo elemento do vetor criado inicialmente e os demais elementos da
Igor Kaue Nardes de Castro
 */
package lista01;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ALUNO
 */
public class Exercicio29 {

    static Scanner scan;

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
                    
                    int primos = 2;
                    
                	for(int k = 1; k < mtzPrincipal[i].length; k++) {                		
                		int cont = 0;                		
                		for(int h = primos; h >= 1; h--) {//gerar numeros primos                                			
        					if(primos % h == 0) 
        						cont++;	                         					
                		}                                 		
                		if(cont == 2) 
    						mtzPrincipal[i][k] = primos;
                		else 
    						k--;
    					primos++;                    					
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