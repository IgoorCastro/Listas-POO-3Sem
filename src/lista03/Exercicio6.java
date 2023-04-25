/*
[POO-011] Crie um programa que solicite ao usuário números inteiros. A cada número inserido,
perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o
menor dos valores.
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;
//import java.util.Random;

public class Exercicio6 {

    static Scanner scan;
    static int maiorValor = 0, contVet = 0;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int opExit = 0, vetValores[] = new int[100];
        String preEscolha;
        char opExitD;

        do {

            try {

                System.out.println("-Verifique o maior");
                
                do{
                    System.out.print("\nEntre com um n�mero inteiro: ");
                    preEscolha = scan.next();
                    vetValores[contVet] = Integer.parseInt(preEscolha);
                    contVet++;  
                    
                    System.out.print("\nInserir outro[s/n]: ");
                    preEscolha = scan.next();
                    opExitD = preEscolha.charAt(0);
                }while(opExitD == 's');
                
                System.out.println("\n-Compara��o\n*Menor valor: " + testeMenor(vetValores));

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                opExit = Integer.parseInt(preEscolha);

            }catch(Exception e){System.out.println("\nerro: " + e);}

        }while(opExit != 1);

        System.out.print("Fim!");
        scan.close();
    }        
    
    static int testeMenor(int[] valTest){
        int min = valTest[0];
        if(valTest.length != 0){
            for(int i = 1; i < contVet; i++){
            if(min > valTest[i])
                min = valTest[i];
            }
        }
        return min;
    }
    
}
