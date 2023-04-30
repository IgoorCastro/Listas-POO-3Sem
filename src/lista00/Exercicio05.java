/*
5) Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e
calcular a soma entre elas gerando uma terceira matriz.
Igor Kaue Nardes de Castro - 3° ADS
 */

package lista00;

import java.util.Scanner;
import java.util.Random;

public class Exercicio05 {
	
	static int mtzA[][], mtzB[][], mtzSoma[][], lin = 0, col = 0, valMaxRnd;
	static Scanner scan;
	static Random rnd;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		int op = 0;//programa deve funcionar enquanto op != 1
		String preEscolha = "";
		
		do {
			
			try {
				
				System.out.println("\n--- Defina duas matrizes e receba a soma entre as duas! ---");
				setInformacoes();				
				setRandom(); 
                System.out.println("Chegouss");
				lerMatriz();
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){
				System.out.print((preEscolha != "1") ? "\n\n**Continuando\n\n": "***ERRO: Por favor, usar apenas valores inteiros maior que 0!\\\\n\\\\n");
			}
			
		}while(op != 1);
		
		System.out.print("Fim!");

	}
	
	static void somarMatriz() {
		
		if(mtzA[0].length > mtzB[0].length) {
			
			for(int i = 0; i < mtzSoma.length; i++) {
				for(int t = 0; t < mtzSoma[i].length; t++) {
					
					if(t < mtzB[t].length) 
						mtzSoma[i][t] = mtzA[i][t] + mtzB[i][t];
					else
						mtzSoma[i][t] = mtzA[i][t];
				}
			}
		}
	}
		
	static void setInformacoes() {
		
		String preEscolha;
		
		do{
            
            try{
            	
            	for(int i = 0; i < 2; i++) {
            	
	                System.out.print((i == 0) ? "\nMatriz A\nValor de linhas: " : "\nMatriz B\nValor de linhas: ");
	                preEscolha = scan.next();
	                lin = Integer.parseInt(preEscolha);
	                System.out.print("Valor de colunas: ");
	                preEscolha = scan.next();
	                col = Integer.parseInt(preEscolha);
	                
                	if (i == 0)
                		mtzA = new int[lin][col];
                	else
                		mtzB = new int[lin][col];
                
            	}	
            	
            	if(mtzA.length > mtzB.length)//lin
            		lin = mtzA.length;
            	else
            		lin = mtzB.length;                	
            	mtzSoma = new int[lin][];
            	
            	//--
            	
            	if(mtzA.length > mtzB.length ) {
            		
            		if(mtzA[0].length > mtzB[0].length) {
            			
            			for(int i = 0; i < mtzA.length; i++)             				
            				mtzSoma[i] = new int [mtzA[i].length];
                		
            		}else{
            			
            			for(int i = 0; i < mtzA.length; i++) {
                			
            				if(i < mtzB.length) 
            					mtzSoma[i] = new int [mtzB[i].length];  
            				else 
            					mtzSoma[i] = new int [mtzA[i].length];    
                		} 
            		}
            	}else {
            		
            		if(mtzA[0].length > mtzB[0].length) {
            			
            			for(int i = 0; i < mtzB.length; i++) {
                			
            				if(i < mtzA.length)
                				mtzSoma[i] = new int [mtzA[i].length]; 
            				else
            					mtzSoma[i] = new int [mtzB[i].length];
                		}
            		}else {
            			
            			for(int i = 0; i < mtzB.length; i++) 
            				mtzSoma[i] = new int[mtzB[i].length];            			
            		}
            		
            	}            	
            	            	
            	System.out.print("\nValor máximo para elementos aleatórios: ");
   		     	preEscolha = scan.next();
   		     	valMaxRnd = Integer.parseInt(preEscolha);
   		     	
                System.out.print((lin < 1 | col < 1 | valMaxRnd < 1) ? "***ERRO: Valor deve ser maior que 0!\n\n" : "");
                
            }catch(Exception e){
            	System.out.print("***ERRO: Valor deve ser um número inteiro maior que 0!\n\n e: " + e);
            }
            
        }while(lin < 1 | col < 1 | valMaxRnd < 1);
		
	}
	
	static void setRandom() {
		
		rnd = new Random();		
		
		
		for(int i = 0; i < mtzA.length; i++) {
			
			for(int x = 0; x < mtzA[i].length; x++) {				
				mtzA[i][x] = rnd.nextInt(valMaxRnd + 1);
				mtzSoma[i][x] = mtzA[i][x];//reseta os valores
			}
		}
		
		for(int i = 0; i < mtzB.length; i++) {
			
			for(int x = 0; x < mtzB[i].length; x++){
				mtzB[i][x] = rnd.nextInt(valMaxRnd + 1);
				mtzSoma[i][x] += mtzB[i][x];
			}
			
		}
	}
	
	static void lerMatriz() {
				
		System.out.print("\n\t---- Matrizes geradas -----\n");
		
		System.out.print("\nMatriz A\n");
		for(int i = 0; i < mtzA.length; i++) {
			for(int x = 0; x < mtzA[i].length; x++) 				
				System.out.print((x == 0) ? mtzA[i][x] : "\t" + mtzA[i][x]);
			System.out.println();			
		}
		
		System.out.print("\nMatriz B\n");		
		for(int i = 0; i < mtzB.length; i++) {
			for(int x = 0; x < mtzB[i].length; x++)
				System.out.print((x == 0) ? mtzB[i][x] : "\t" + mtzB[i][x]);
			System.out.println();
		}
		
		System.out.print("\n-Soma das matrizes\n");		
		for(int i = 0; i < mtzSoma.length; i++) {
			for(int x = 0; x < mtzSoma[i].length; x++)
				System.out.print((x == 0) ? mtzSoma[i][x] : "\t" + mtzSoma[i][x]);
			System.out.println();
		}
		
	}

}
