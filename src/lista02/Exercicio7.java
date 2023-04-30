/*
[POO-012] Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de
um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa
deve ser executado enquanto o usuário quiser continuar jogando o dado.
Igor Kaue Nardes de Castro
 */
package lista02;

import java.util.Scanner;
//import java.util.Random;

public class Exercicio7 {

    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int opExit = 0;
        String preEscolha;
        char opJogar;

        do {

            try {

                System.out.println("-Jogue o dado");                                
                
                do{
                    System.out.print("\nJogar o dado[s/n]: ");
                    preEscolha = scan.next();
                    opJogar = preEscolha.charAt(0);                
                    System.out.print((opJogar == 's') ? "Saiu: " + dado() : "");
                }while(opJogar == 's');
                
                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                opExit = Integer.parseInt(preEscolha);

            }catch(Exception e){System.out.println("\nerro: " + e);}

        }while(opExit != 1);

        System.out.print("Fim!");
        scan.close();
    }        
    
    static int dado(){
        
        return (int) (Math.random() * 100);
    }
    
}
