/*
21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Ge-
rar uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas res-
pectivas colunas e apresentar as três matrizes.
Igor Kaue Kaue Nardes de Castro - 3 ADS
 */

package lista00;


import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {
	
	static Scanner scan;

	public static void main(String[] args) {
		Random rnd = new Random();
		scan = new Scanner(System.in);
		int op = 0, mtzA[][], mtzB[][], valMaxDim = 7, valMaxRnd = 51;		
		String mtzResultado[][];
		
		do {
			
			try {
				
				System.out.println("\n\n--- Veja os valores de duas matrizes concatenados em uma terceira matriz e tambem a soma do numero de colunas da mesma. ---\n");
				mtzA = gerarDimMatriz(valMaxDim);//val max random para dimensões 6
				
				mtzB = new int[mtzA.length][rnd.nextInt(5) + 2];//cria matriz B com a quantidade de linhas da A e gera um valor aleatorio de 2 a 6 (só funcina se a quantidade de colunas for a mesma em todas as linhas)		
				
				
				
				mtzA = gerarValoresMtzRandom(mtzA, valMaxRnd);//insere valores random na mtz
				
				mtzB = gerarValoresMtzRandom(mtzB, valMaxRnd);
				
				mtzResultado = concatenarMtz(mtzA, mtzB, valMaxRnd);//concatena as matrizes (valores de linhas devem ser iguais) em uma mtz String 
				//mtzResultado = gerarMtzRandom(mtzResultado, valMaxRnd);
				
				
				lerMatriz(mtzA, mtzB, mtzResultado);
				
				//menu para sair
				System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
				String preEscolha = scan.next();
				op = Integer.parseInt(preEscolha);
				
			}catch(Exception e){System.out.println(e);}
			
		}while(op != 1);
		
		System.out.print("Fim!");
		scan.close();
	}
	
	static String[][] concatenarMtz(int[][] mtzQ, int[][] mtzW, int valMaxRandom){
		
		String mtzResultado[][] = new String[mtzQ.length][mtzQ[0].length + mtzW[0].length];	
		
		for(int i = 0; i < mtzResultado.length; i++) 
			mtzResultado[i] = new String[mtzResultado[i].length];	
		
		Random rnd = new Random();
		
		int mtzQLength = mtzQ[0].length, mtzWLength = mtzW[0].length;
				
		if(mtzQLength >= mtzWLength) {
			
			for(int i = 0; i < mtzW.length; i++) {//for para concatenar
				for(int x = 0; x < mtzW[i].length; x++) 
					mtzResultado[i][x] = Integer.toString(mtzQ[i][x]) + "-" + Integer.toString(mtzW[i][x]);				
			}
			for(int i = 0; i < mtzResultado.length; i++) {//for para adicionar rnd
				for(int x = mtzQLength; x < mtzResultado[i].length; x++) 
					mtzResultado[i][x] = Integer.toString(rnd.nextInt(valMaxRandom));					
			}
			//--			
			if(mtzQLength > mtzWLength) {
				for(int i = 0; i < mtzW.length; i++) {//for para adicionar
					for(int x = mtzW[i].length; x < mtzQ[i].length; x++)					
						mtzResultado[i][x] = Integer.toString(mtzQ[i][x]);						
				}
			}
		}else {
			
			for(int i = 0; i < mtzQ.length; i++) {//for para concatenar
				for(int x = 0; x < mtzQ[i].length; x++) 
					mtzResultado[i][x] = Integer.toString(mtzQ[i][x]) + "-" + Integer.toString(mtzW[i][x]);				
			}
			for(int i = 0; i < mtzResultado.length; i++) {//for para adicionar rnd
				for(int x = mtzWLength; x < mtzResultado[i].length; x++) 
					mtzResultado[i][x] = Integer.toString(rnd.nextInt(valMaxRandom));					
			}
			//--				
			for(int i = 0; i < mtzW.length; i++) {//for para adicionar
				for(int x = mtzQ[i].length; x < mtzW[i].length; x++)					
					mtzResultado[i][x] = Integer.toString(mtzW[i][x]);
			}	
			
		}		
			
		return mtzResultado;
	}
	
	static int[][] gerarValoresMtzRandom(int[][] mtz, int valMax) {
		Random rnd = new Random();
		int mtzResult[][] = new int[mtz.length][mtz[0].length];//so funciona se o numero de linhas for padrão em todas as colunas e vice verso.
		for(int i = 0; i < mtz.length; i++) {
			for(int x = 0; x < mtz[i].length; x++) 
				mtzResult[i][x] = rnd.nextInt(valMax);			
		}
		
		return mtzResult;
	}
	
	static void lerMatriz(int mtzQ[][], int mtzW[][], String mtzE[][]) {
		System.out.println("\n-Matriz A (N+M) gerada:");
		for(int i = 0; i < mtzQ.length; i++) {
			for(int x = 0; x < mtzQ[i].length; x++) 
				System.out.print((x == 0) ? mtzQ[i][x] : "\t" + mtzQ[i][x]);
			System.out.println();			
		}
		System.out.println("\n-Matriz B (N+P) gerada:");
		for(int i = 0; i < mtzW.length; i++) {
			for(int x = 0; x < mtzW[i].length; x++) 
				System.out.print((x == 0) ? mtzW[i][x] : "\t" + mtzW[i][x]);
			System.out.println();			
		}
		System.out.println("\n-Matriz resultado (N+(N+P)) gerada:");
		for(int i = 0; i < mtzE.length; i++) {
			for(int x = 0; x < mtzE[i].length; x++) 
				System.out.print((x == 0) ? mtzE[i][x] : "\t" + mtzE[i][x]);
			System.out.println();			
		}
	}
	
		
	static String[][] gerarDimMatrizNxMP(int mtzX[][], int mtzC[][]) {//só funciona se o valor de colunas em todas as linhas forem iguais!
		
		String mtzResultado[][] = new String[mtzX.length][mtzX[0].length + mtzC[0].length];				
		return mtzResultado;
	}
	
	 static int[][] gerarDimMatriz(int valMaxRandom){ 
		Random rnd = new Random();
    	int mtzQdd[][];
    	int dimN = 0, dimM = 0;//dimensão da matriz quadrada
    	
        do{
            rnd = new Random();
            dimN = rnd.nextInt(valMaxRandom);
            dimM = rnd.nextInt(valMaxRandom);
        }while(dimN < 2 || dimM < 2);
        
        //System.out.println("Random: " + dimN + " - " + dimM);
        
        mtzQdd = new int[dimN][dimM];
        
        
        return mtzQdd;
    }

}
