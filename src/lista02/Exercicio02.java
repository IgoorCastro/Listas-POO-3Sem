/*
[POO-002] Crie programa que solicite ao usu�rio um n�mero tipo double. Ap�s verifique se o n�mero �
zero ou n�o. A verifica��o deve ser feita atrav�s de um m�todo que receba um valor (par�metro de
entrada) e informe se ele � zero ou n�o atrav�s de um retorno do tipo boolean. Declare como: boolean
isZero ( double num ).
Igor Kaue Nardes de Castro
 */
package lista02;

import java.util.Scanner;

public class Exercicio02 {

    static Scanner scan;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        int op = 0;
        String preEscolha;

        do {

            try {

                System.out.print("Valor para teste: ");
                preEscolha = scan.next();
                double val = Double.parseDouble(preEscolha);
                
                System.out.println((isZero(val) ? "\n" + val + " é zero": "\n" + val + " não é zero!"));
                

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){System.err.print(e);}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }
    
    static boolean isZero(double num){
        
        return (num == 0) ? true : false;
    }
    
}
