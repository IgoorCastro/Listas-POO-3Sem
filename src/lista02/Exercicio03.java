/*
[POO-003] Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número
tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas
através de métodos.

Igor Kaue Nardes de Castro
*/

package lista02;

import java.util.Scanner;

public class Exercicio03 {
	
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
                
                System.out.println(val + " é " + isOque(val));
                

                //menu para sair
                System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                preEscolha = scan.next();
                op = Integer.parseInt(preEscolha);

            }catch(Exception e){System.err.print(e);}

        }while(op != 1);

        System.out.print("Fim!");
        scan.close();
    }
    
    static String isOque(double num){
        
        if(num == 0)
            return "zero";
        else
            return (num < 0) ? "negativo" : "positivo";
            
    }

}
