/*
[POO-004] Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo
Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores,
'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por
'b² - 4ac'.
Igor Kaue Nardes de Castro 
*/

package lista01;

import java.util.Scanner;

public class Exercicio04 {

	static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int op = 0;
        double eqA = 0, eqB = 0, eqC = 0;//valor a, b e c
        String preEscolha;

        do {

            try {

                System.out.print("Valor de a: ");
                preEscolha = scan.next();
                eqA = Double.parseDouble(preEscolha);
                
                System.out.print("Valor de b: ");
                preEscolha = scan.next();
                eqB = Double.parseDouble(preEscolha);
                
                System.out.print("Valor de c: ");
                preEscolha = scan.next();
                eqC = Double.parseDouble(preEscolha);
                
                System.out.println("Delta é " + equacaoSegundoGrauDelta(eqA, eqB, eqC));

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){System.err.print(e);}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }
    
    static double equacaoSegundoGrauDelta(double a, double b, double c){
        
        //calculo delta
        return Math.pow(b, 2) - (4 * a * c);        
    }

}
