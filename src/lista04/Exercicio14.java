/*
14) [POO-027] Crie um programa que solicite ao usuário um número inteiro. Através de um método que
receba esse número inteiro como parâmetro de entrada, inverta dígito-a-dígito e retorne um valor inteiro
com o número invertido.
Igor Kaue Nardes de Castro
*/
package lista04;

import java.util.Scanner;

public class Exercicio14 {

    static Scanner scan;

	public static void main(String[] args) {

            scan = new Scanner(System.in);
            int op = 0;
            String preEscolha;
		
            do {

                try {

                    System.out.print("Entre com um número: ");
                    preEscolha = scan.next();
                    op = Integer.parseInt(preEscolha);
                    
                    System.out.println(invertNum(op));

                    //menu para sair
                    System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                    preEscolha = scan.next();
                    op = Integer.parseInt(preEscolha);

                }catch(Exception e){}

            }while(op != 1);
		
            System.out.print("Fim!");
            scan.close();
	}
    
	static int invertNum(int valor) {
	    int invertido = 0;
	    
	    while (valor > 0) {
	        int digito = valor % 10;
	        invertido = invertido * 10 + digito;
	        valor /= 10;
	    }
	    return invertido;
	}

	
            
}