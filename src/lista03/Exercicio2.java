/*
[POO-007] Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que
receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores.
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;
//import java.util.Random;

public class Exercicio2 {

    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int opExit = 0;
        String preEscolha;

        do {

            try {

                System.out.println("-Verifique o maior");
                
                System.out.print("\nValor um: ");
                preEscolha = scan.next();
                int valTestUm = Integer.parseInt(preEscolha);
                
                System.out.print("Valor dois: ");
                preEscolha = scan.next();
                int valTestDois = Integer.parseInt(preEscolha);
                
                System.out.println("\n-Compara��o\n*Maior valor: " + testeMaior(valTestUm, valTestDois));

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                opExit = Integer.parseInt(preEscolha);

            }catch(Exception e){System.out.println("\nerro: " + e);}

        }while(opExit != 1);

        System.out.print("Fim!");
        scan.close();
    }        
    
    static int testeMaior(int valUm, int valDois){
        return ((valUm <= valDois) ? valUm : valDois);
    }
}
