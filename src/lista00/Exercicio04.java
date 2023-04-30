/*
4) Escreva um programa em Java para ler uma matriz D de dimensão N x M,
onde N e M não poderem ser menores que um. Gerar os elementos
aleatoriamente. O usuário deve informar a dimensão (linha e coluna) e um
valor máximo para elementos aleatórios. O programa efetuar todas as
validações. Lembre-se de aproveitar os recursos da linguagem Java para
facilitar as validações.
Igor Kaue Nardes de Castro - 3° ADS
*/

package lista00;
import java.util.Scanner;
import java.util.Random;

public class Exercicio04 {
    
    static int d[][], valMaxRnd, n, m;//n, m = dimensão da matriz    
    static Scanner scan;
    
    public static void main(String[] args) {
        
        int op = 0;
        scan = new Scanner(System.in);
        
        
        
        do {
			
            try {
				
		System.out.print("Crie sua matriz.\nDimensoes nao podem ser menor que 1!\n");
                pegarDimensao();
                pegarValMax();
                gerarMatriz();
                lerMatriz();
				
		//menu para sair
		System.out.printf("\nDigite '1' para sair ou outro valor para continuar: ");
		String preEscolha = scan.next();
		op = Integer.parseInt(preEscolha);
				
		}catch(Exception e){System.out.print("***ERRO: Valor deve ser inteiro!\n\n");}
			
            }while(op != 1);
		
            System.out.print("Fim!");
        
        
    }
    
    static void pegarDimensao(){
        
        do{
            
            try{
                
                System.out.print("Valor de linhas: ");
                String preEscolha = scan.next();
                n = Integer.parseInt(preEscolha);
                System.out.print("Valor de colunas: ");
                preEscolha = scan.next();
                m = Integer.parseInt(preEscolha);
                //System.out.println("-pegarDimensao() = n: " + n + ", m: " + m);
                System.out.print((n < 1 | m < 1) ? "Valor deve ser maior que 0!\n\n" : "");
        
            }catch(Exception e){}
            
        }while(n < 1 | m < 1);
        
    }
    
    static void pegarValMax(){
        
        System.out.print("\nValor máximo para elementos aleatórios: ");
        String preEscolha = scan.next();
        valMaxRnd = Integer.parseInt(preEscolha);
        
    }
    
    static void gerarMatriz(){
        
        Random rnd = new Random();
        
        d = new int[n][m];
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < m - 1; j++)
                d[i][j] = rnd.nextInt(valMaxRnd + 1);                
            }
        
    }
    
    static void lerMatriz(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.print((j == 0) ? d[i][j] : "\t" + d[i][j] + " "); 
            System.out.println("");
        }
        
    }
}
