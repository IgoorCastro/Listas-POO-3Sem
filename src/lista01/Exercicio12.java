/*
12) Escreva um programa em Java para gerar uma matriz quadrada L de dimensão N. Imprimir os elementos da acima da diagonal principal (exclusa).
Igor Kaue Nardes de Castro - 3° ADS
*/
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio12 {
    
    static int mtzQddL[][], dimN = 0;
    static Scanner scan;
    static Random rnd;
    
    public static void main(String[] args) {        
        
        scan = new Scanner(System.in);
        int op = 0;
        
        do {

                try {

                        System.out.println("\n\n--- Veja os valores acima da diagonal principal (exclusa) da matriz gerada aleatoriamente ---\n");
                        gerarMatriz();
                        lerMatriz();
                        lerAcimaPrincipalExclusa();
                        
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
    
    static void lerAcimaPrincipalExclusa(){
        System.out.print("* -Acima da diagonal principal(exclusa): ");
        for(int i = 0; i < mtzQddL.length; i++){
            for(int t = 0; t < mtzQddL[i].length; t++)  {
                if(i < t)
                    System.out.print(mtzQddL[i][t] + " ");                
            }                
        }
    }
    
    static void lerMatriz() {
            System.out.println("\n\n-Matriz gerada\n");
            for(int i = 0; i < mtzQddL.length; i++) {
                    for(int x = 0; x < mtzQddL[i].length; x++) 
                        System.out.print((x == 0) ? mtzQddL[i][x] : "\t" + mtzQddL[i][x]);
                    System.out.println();
            }
    }
    
    static void gerarMatriz(){        
        
        do{
            rnd = new Random();
            dimN = rnd.nextInt(7);//max 6
        }while(dimN < 2);
        
        System.out.println("Random: " + dimN);
        
        mtzQddL = new int[dimN][dimN];
        
        for(int i = 0; i < mtzQddL.length; i++){
            for(int t = 0; t < mtzQddL[i].length; t++)  
                mtzQddL[i][t] = rnd.nextInt(51);
        }
        
    }
    
}
