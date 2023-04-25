/*
10) Escreva um programa em Java para gerar uma matriz quadrada H de dimensão N. Imprimir os elementos da diagonal secundária (linha + coluna =
dimensão + 1).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    
    static int mtzQddH[][], dimN = 0;
    static Scanner scan;
    static Random rnd;
    
    public static void main(String[] args) {        
        
        scan = new Scanner(System.in);
        int op = 0;
        
        do {

                try {

                        System.out.println("\n\n--- Veja os valores da diagonal secundaria da matriz gerada aleatoriamente ---\n");
                        gerarMatriz();
                        lerMatriz();
                        lerDiagonalSecundaria();
                        
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
    
    static void lerDiagonalSecundaria(){
        System.out.print("* -Diagonal secundaria: ");
        for(int i = 0; i < mtzQddH.length; i++){ 
            for(int t = 0; t < mtzQddH[i].length; t++)  {
                if(mtzQddH.length - t == i + 1)
                    System.out.print(mtzQddH[i][t] + " ");                
            }                
        }
        /*
         * tente if(mtzQddH.length - t != i + 1) para pegar valores que não sejam da diagonal secundaria
         */
    }
    
    static void lerMatriz() {
            System.out.println("\n\n-Matriz gerada\n");
            for(int i = 0; i < mtzQddH.length; i++) {
                    for(int x = 0; x < mtzQddH[i].length; x++) 
                            System.out.print((x == 0) ? mtzQddH[i][x] : "\t" + mtzQddH[i][x]);
                    System.out.println();
            }
    }
    
    static void gerarMatriz(){        
        
        do{
            rnd = new Random();
            dimN = rnd.nextInt(7);//max 6
        }while(dimN < 2);
        
        System.out.println("Random: " + dimN);
        
        mtzQddH = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQddH.length; i++){
            for(int t = 0; t < mtzQddH[i].length; t++)  
                mtzQddH[i][t] = rnd.nextInt(51);
        }
        
    }
    
}
