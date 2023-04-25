/*
16) Escreva um programa em Java para gerar uma matriz quadrada P de dimensão N. Imprimir os elementos da abaixo da diagonal principal (inclusa) e
abaixo da diagonal secundária (inclusa).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio19 {
    
    static int mtzQddS[][], dimN = 0;
    static Scanner scan;
    static Random rnd;
    
    public static void main(String[] args) {        
        
        scan = new Scanner(System.in);
        int op = 0;
        
        do {

                try {

                        System.out.println("\n\n--- Veja os valores da diagonal principal (inclusa) da matriz gerada aleatoriamente ---\n");
                        gerarMatriz();
                        lerMatriz();
                        lerAsaDeBorboleta();
                        
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
    
    static void lerAsaDeBorboleta(){
        System.out.print("* -Asa de borboleta: ");
        for(int i = 0; i < mtzQddS.length; i++){
            for(int t = 0; t < mtzQddS[i].length; t++)  
                if(i == t || mtzQddS.length - t == i + 1 || (i > t && i < mtzQddS.length - 1 && t < 1) || (mtzQddS.length - 1 == t && i < mtzQddS.length - 1))
                    System.out.print(mtzQddS[i][t] + " "); 
                    
        }
    }
    
    static void lerMatriz() {
            System.out.println("\n\n-Matriz gerada\n");            
                       
            for(int i = 0; i < mtzQddS.length; i++) {
                    for(int x = 0; x < mtzQddS[i].length; x++) 
                            System.out.print((x == 0) ? mtzQddS[i][x] : "\t" + mtzQddS[i][x]);
                    System.out.println();
            }
    }
    
    static void gerarMatriz(){        
        
        do{
            rnd = new Random();
            dimN = rnd.nextInt(7);//max 6
        }while(dimN < 3);
        
        System.out.println("Random: " + dimN);
        
        mtzQddS = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQddS.length; i++){
            for(int t = 0; t < mtzQddS[i].length; t++)  
            	mtzQddS[i][t] = rnd.nextInt(51);
        }
        
    }
    
}