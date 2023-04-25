/*
) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do
segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja
maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma,
assim retorne zero.
Igor Kaue Nardes de Castro
 */
package lista02;

import java.util.Scanner;

public class Exercicio05 {

    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int op = 0;
        double eqA = 0, eqB = 0, eqC = 0;//valor a, b e c
        String preEscolha;

        do {

            try {
            	
            	do {
            		System.out.print("Valor de a: ");
                    preEscolha = scan.next();
                    eqA = Double.parseDouble(preEscolha);
                    System.out.print((eqA == 0) ? "\nerro: Valor deve ser diferente de 0!\n" : "");
            	}while(eqA == 0);
                
                
                System.out.print("Valor de b: ");
                preEscolha = scan.next();
                eqB = Double.parseDouble(preEscolha);
                
                System.out.print("Valor de c: ");
                preEscolha = scan.next();
                eqC = Double.parseDouble(preEscolha);
                
                System.out.println(equacaoSegundoGrau(eqA, eqB, eqC));

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){System.err.print(e);}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }
    
    static String equacaoSegundoGrau(double a, double b, double c){
        
        //calculo delta
        double delta =  Math.pow(b, 2) - (4 * a * c);
        
        if(delta < 0)
        	return "0";
        
        //calculo da raizes
    	double x1 = ((-1 * b) + Math.sqrt(delta)) / 2 * a;
        double x2 = ((-1 * b) - Math.sqrt(delta)) / 2 * a;
        return "-Raizes\nx1: " + x1 + " - x2: " + x2;
    }
        
}
