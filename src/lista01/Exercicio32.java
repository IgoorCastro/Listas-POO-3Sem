/*
32) Escreva um programa em Java para gerar uma matriz (N x M). A matriz
deve ser criada com a seguinte dimensão ((N+1) x (M+1)). Para cada linha
imprimir a soma na casa final. Repetir o processo para coluna. Na posição
((N+1) x (M+1)), apresentar a soma dos elementos da diagonal principal (linha = coluna).
Igor Kaue Nardes de Castro
 */
package lista01;

import java.util.Scanner;
import java.util.Random;

public class Exercicio32 {

    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int op = 0;
        
        

        do {
            
            System.out.println("Matriz gerada");
            
            int dimM = gerarRandom(7), dimN = gerarRandom(7);
            int mtzPrincipal[][] = new int[dimM + 1][dimN + 1], diagPrincipal = 0;

            try {
                for(int i = 0; i < mtzPrincipal.length; i++){
                    for(int x = 0; x < mtzPrincipal[i].length; x++){
                        if(i < mtzPrincipal.length - 1 && x < mtzPrincipal[i].length - 1)//adiciona random
                            mtzPrincipal[i][x] = gerarRandom(9);                        
                        if(x < mtzPrincipal[i].length - 1)//soma linha
                            mtzPrincipal[i][mtzPrincipal[i].length - 1] += mtzPrincipal[i][x];
                        if(i < mtzPrincipal.length - 1 && x < mtzPrincipal[i].length - 1)//soma coluna
                            mtzPrincipal[mtzPrincipal.length - 1][x] += mtzPrincipal[i][x];                        
                    }
                    
                    if(i < mtzPrincipal.length - 1)
                        diagPrincipal += mtzPrincipal[i][i];
                    
                    //System.out.println("Diag: "+diagPrincipal);
                }
                
                mtzPrincipal[mtzPrincipal.length - 1][mtzPrincipal[0].length - 1] = diagPrincipal;
                
                for(int i = 0; i < mtzPrincipal.length; i++){
                    for(int x = 0; x < mtzPrincipal[i].length; x++){
                        System.out.print((x == 0) ? mtzPrincipal[i][x] : "\t" + mtzPrincipal[i][x]);
                    }
                    System.out.println();
                }

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                String preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }
    
    static int gerarRandom(int valMaxRandom){
        Random rnd = new Random();
        int valRandom = 0;
        do{
            valRandom = rnd.nextInt(valMaxRandom);
        }while(valRandom < 2);
        
        return valRandom;
    }
}