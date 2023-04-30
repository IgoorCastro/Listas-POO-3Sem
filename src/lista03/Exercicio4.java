/*
[POO-017] Um professor, muito legal, fez 3 provas durante um semestre, mas só vai levar em conta as
duas notas mais altas para calcular a média. Crie um programa que solicite ao usuário o valor double das 3
notas, mostre como seria a média com essas 3 provas, a média com as 2 notas mais altas, bem como a nota
mais alta e a nota mais baixa. Tente criar apenas um método para retornar essas médias. Este método
deverá receber as 3 notas como parâmetros de entrada e retornar os valores solicitados. As notas devem
ser de zero a dez e qualquer valor diferente deverá ser desconsiderado, assumindo zero.
Igor Kaue Nardes de Castro
 */
package lista03;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {

    static Scanner scan;
    

    public static void main(String[] args) {

            scan = new Scanner(System.in);
            int op = 0;
            String preEscolha;
            double[] notas = new double[3];

            do {
                try {
                    System.out.println("-- Calculo de média --");
                    imprimirRegra();
                    System.out.println();
                    
                    for(int i = 0; i < 3; i++){
                        do{
                            System.out.print("Entre com a nota [" + (i + 1) + "]: ");
                            preEscolha = scan.next();
                            notas[i] = Double.parseDouble(preEscolha);
                            if(notas[i] < 0 || notas[i] > 10)
                                imprimirRegra();
                        }while(notas[i] < 0 || notas[i] > 10);                        
                    }
                    
                    double[] resultado = calculoMedia(notas);
                    
                    System.out.print("\n--Médias--");
                    System.out.println( "\nMédia maiores: " + resultado[0] +
                                        "\nMédia aritmética: " + resultado[1] +
                                        "\nMaior nota: " + resultado[2] +
                                        "\nMenor nota: " + resultado[3]);

                    //menu para sair
                    System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
                    preEscolha = scan.next();
                    op = Integer.parseInt(preEscolha);

                }catch(Exception e){System.err.print(e);}

            }while(op != 1);

            System.out.print("Fim!");
            scan.close();
    }
    
    static double[] calculoMedia(double[] notas){  
        Arrays.sort(notas);//ordena as notas, as duas primeiras sao as maiores!     
        double[] results = new double[4];
        
        results[0] = (notas[1] + notas[2]) / 2;//média maior
        results[1] = (notas[0] + notas[1] + notas[2]) / 3;//média aritimética
        results[2] = notas[2];//maior nota
        results[3] = notas[0];
        
        return results;
    }
    
    static void imprimirRegra(){
        System.err.println("-Valores de 0 a 10!");
    }
}