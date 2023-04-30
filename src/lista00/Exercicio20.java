/*
16) Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista00;

import java.util.Scanner;
import java.util.Random;

public class Exercicio20 {
    
    
    static Scanner scan;
    static Random rnd;
    
    public static void main(String[] args) {        
        
        scan = new Scanner(System.in);
        int op = 0, mtzQddT[][];;
        
        do {

                try {

                        System.out.println("\n\n--- Veja os valores da diagonal principal (inclusa) da matriz gerada aleatoriamente ---\n");
                        mtzQddT = gerarMatrizQdd(7);//random max 6
                        lerMatriz(mtzQddT);
                        lerMatrizAmpulheta(mtzQddT);
                        
                        System.out.println();
                        System.out.println();
                        
                        //menu para sair
                        System.out.print("\nDigite '1' para sair ou outro valor para continuar: ");
                        String preEscolha = scan.next();
                        op = Integer.parseInt(preEscolha);

                }catch(Exception e){System.out.print(e);}

        }while(op != 1);
        
        System.out.print("Fim!");    
    }
    
    static void lerMatrizAmpulheta(int [][]mtz){
        System.out.print("* -Leitura da ampulheta da matriz: ");
        for(int i = 0; i < mtz.length; i++){
            for(int t = 0; t < mtz[i].length; t++)  
                if(i == t || mtz.length - t == i + 1 || ((i == 0 || i == mtz.length - 1) && t > 0 && t < mtz.length - 1))
                    System.out.print(mtz[i][t] + " "); 
                    
        }
    }
    
    static void lerMatriz(int[][] mtz) {
            System.out.println("\n\n-Matriz gerada\n");            
                       
            for(int i = 0; i < mtz.length; i++) {
                    for(int x = 0; x < mtz[i].length; x++) 
                            System.out.print((x == 0) ? mtz[i][x] : "\t" + mtz[i][x]);
                    System.out.println();
            }
    }
    
    static int[][] gerarMatrizQdd(int valMaxRandom){ 
    	int mtzQdd[][];
    	int dimN = 0;//dimensão da matriz quadrada
    	
        do{
            rnd = new Random();
            dimN = rnd.nextInt(valMaxRandom);
        }while(dimN < 2);
        
        System.out.println("Random: " + dimN);
        
        mtzQdd = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQdd.length; i++){
            for(int t = 0; t < mtzQdd[i].length; t++)  
            	mtzQdd[i][t] = rnd.nextInt(51);
        }
        return mtzQdd;
    }
    
}