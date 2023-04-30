/*
[POO-010] Crie um programa que solicite ao usuário três números inteiros. Através de um método, que
receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores.
Igor Kaue Nardes de Castro
 */
package lista02;

import java.util.Scanner;
//import java.util.Random;

public class Exercicio5 {

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
                
                System.out.print("Valor tr�s: ");
                preEscolha = scan.next();
                int valTestTres = Integer.parseInt(preEscolha);
                
                System.out.println("\n-Compara��o\n*Maior valor: " + testeMaior(valTestUm, valTestDois, valTestTres));

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
        return Math.max(valUm, valDois);
    }
    
    static int testeMaior(int valUm, int valDois, int valTres){
        return Math.max(valUm, Math.max(valDois, valTres));
    }
}
