/*
[POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o dado 1 milhão de vezes.
Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números
foi parecida?
Igor Kaue Nardes de Castro
 */
package lista02;

import java.util.Scanner;
import java.util.Random;

public class Exercicio8 {

    static Scanner scan;
    static Random rnd = new Random();
    static int[] contValDado = new int[6];

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int opExit = 0, opJogar = 0;
        String preEscolha;

        do {

            try {

                System.out.println("-Jogue o dado");                                
                
                do{                                  
                    dado();
                    opJogar++;
                }while(opJogar <= 1000000);
                
                System.out.println(	"\n1: " + contValDado[0] + " - " + (double)(contValDado[0] * 100) / 1000000 +
                					"\n2: " + contValDado[1] + " - " + (double)(contValDado[1] * 100) / 1000000 +
                					"\n3: " + contValDado[2] + " - " + (double)(contValDado[2] * 100) / 1000000 +
                					"\n4: " + contValDado[3] + " - " + (double)(contValDado[3] * 100) / 1000000 +
                					"\n5: " + contValDado[4] + " - " + (double)(contValDado[4] * 100) / 1000000 +
                					"\n6: " + contValDado[5] + " - " + (double)(contValDado[5] * 100) / 1000000);
                
                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                opExit = Integer.parseInt(preEscolha);

            }catch(Exception e){System.out.println("\nerro: " + e);}

        }while(opExit != 1);

        System.out.print("Fim!");
        scan.close();
    }        
    
    static void dado(){   
        //int valResult = (int) Math.random() * 100;
        int valResult = rnd.nextInt(6) + 1;
    	
        if(valResult == 1)
            contValDado[0]++;
        else
            if(valResult == 2)
                contValDado[1]++;
            else
                if(valResult == 3)
                contValDado[2]++;
                else
                    if(valResult == 4)
                    contValDado[3]++;
                    else
                        if(valResult == 5)
                        contValDado[4]++;
                        else
                            contValDado[5]++;
    }
    
}
