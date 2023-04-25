/*
15) Escreva um programa em Java para gerar uma matriz quadrada O de dimensão N.
Imprimir os elementos da abaixo da diagonal principal (inclusa) e acima da diagonal
secundária (inclusa).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio15 {
    
    static int mtzQddO[][], dimN = 0;
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
                        lerInclusasAbaixo();
                        
                        System.out.println();
                        System.out.println();
                        
                        //menu para sair
                        System.out.print("\nDigite '1' para sair ou outro valor para continuar: ");
                        String preEscolha = scan.next();
                        op = Integer.parseInt(preEscolha);

                }catch(Exception e){}

        }while(op != 1);

        System.out.print("Fim!");    
    }
    
    static void lerInclusasAbaixo(){
        System.out.print("* -Abaixo da diagonal principal (inclusas): ");
        for(int i = 0; i < mtzQddO.length; i++){
            for(int t = 0; i >= t; t++)                  
                    System.out.print(mtzQddO[i][t] + " ");                                 
        }
        //--
        System.out.print("\n* -Acima da diagonal secundaria (inclusa): ");
        for(int i = 0; i < mtzQddO.length; i++){
            for(int t = 0; t <= mtzQddO.length - i - 1; t++)
            		System.out.print(mtzQddO[i][t] + " ");                             
        }
    }
    
    static void lerMatriz() {
            System.out.println("\n\n-Matriz gerada\n");
            for(int i = 0; i < mtzQddO.length; i++) {
                    for(int x = 0; x < mtzQddO[i].length; x++) 
                            System.out.print((x == 0) ? mtzQddO[i][x] : "\t" + mtzQddO[i][x]);
                    System.out.println();
            }
    }
    
    static void gerarMatriz(){        
        
        do{
            rnd = new Random();
            dimN = rnd.nextInt(7);//max 6
        }while(dimN < 2);
        
        System.out.println("Random: " + dimN);
        
        mtzQddO = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQddO.length; i++){
            for(int t = 0; t < mtzQddO[i].length; t++)  
            	mtzQddO[i][t] = rnd.nextInt(51);
        }
        
    }
    
}