/*
11) Escreva um programa em Java para gerar uma matriz quadrada K de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio11 {
    
    static int mtzQddK[][], dimN = 0;
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
                        lerAbaixoPrincipalInclusa();
                        
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
    
    static void lerAbaixoPrincipalInclusa(){
        System.out.print("* -Abaixo da diagonal principal (inclusa): ");
        for(int i = 0; i < mtzQddK.length; i++){
            for(int t = 0; t < mtzQddK[i].length; t++)  {
                if(i >= t)
                    System.out.print(mtzQddK[i][t] + " ");                
            }                
        }
    }
    
    static void lerMatriz() {
            System.out.println("\n\n-Matriz gerada\n");
            for(int i = 0; i < mtzQddK.length; i++) {
                    for(int x = 0; x < mtzQddK[i].length; x++) 
                            System.out.print((x == 0) ? mtzQddK[i][x] : "\t" + mtzQddK[i][x]);
                    System.out.println();
            }
    }
    
    static void gerarMatriz(){        
        
        do{
            rnd = new Random();
            dimN = rnd.nextInt(7);//max 6
        }while(dimN < 2);
        
        mtzQddK = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQddK.length; i++){
            for(int t = 0; t < mtzQddK[i].length; t++)  
                mtzQddK[i][t] = rnd.nextInt(51);
        }
        
    }
    
}