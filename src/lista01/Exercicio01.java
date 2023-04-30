/*
[POO-001] Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é
positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de
entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número
zero como positivo. Declare como: boolean isPositivo ( double num ).
Igor Kaue Nardes de Castro 
*/

package lista01;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int op = 0;        
        String preEscolha;

        do {

            try {

                System.out.print("Digite um valor para verificar: ");
                preEscolha =scan.next();
                //double valEscolhido = Double.parseDouble(preEscolha);
                System.out.println(isPositivo(Double.parseDouble(preEscolha)) ? "Valor positivo!" : "Valor negativo!");

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){System.err.print(e);}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }   
   
    static boolean isPositivo(double num) {    	
    	return (num < 0) ? false : true;
    }

}
