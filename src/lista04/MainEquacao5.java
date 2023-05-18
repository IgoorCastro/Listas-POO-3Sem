package lista04;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MainEquacao5 {
	
	static Scanner scan;
	
	public static void main(String[] args) {
		Equacao5 equacao = new Equacao5();
		scan = new Scanner(System.in);
		double valores[]  = new double[3];
		
		System.out.println("- Equação do primeiro grau -\n");
		
		System.out.print("Valor de 'a': ");
		valores[0] = pegaValores();
		
		System.out.print("Valor de 'b': ");
		valores[1] = pegaValores();
		
		System.out.print("Valor de 'c': ");
		valores[2] = pegaValores();
		
		equacao.setValores(valores);
		
		gerarRaizes(equacao);
		
		System.out.println("Fim..");
	}
	
	static void gerarRaizes(Equacao5 equacao) {
		double[] raizes = equacao.primeiroGrau();
		
		if(raizes != null) {	
			NumberFormat formatter = new DecimalFormat("#0.000");
			System.out.println("-Raizes\nx': " + formatter.format(raizes[0]) + "\nx'': " + formatter.format(raizes[1]));
		}else
			System.out.println("A equação de 2º grau não possui raízes reais!");
	}
	
	static double pegaValores() {
		String aux;
		double op = 0;
		do {			
			aux = scan.next();
			op = Integer.parseInt(aux);
			System.out.println((op == 0) ? "\nerro: a deve ser diferente de 0!\n" : "");
		}while(op == 0);
		return op;
	}
}
