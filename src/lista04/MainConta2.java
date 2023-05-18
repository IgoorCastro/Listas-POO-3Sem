/*
2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
dados inseridos não permitindo absurdos.
Igor Kaue Nardes de Castro
 */
package lista04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConta2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("- Controle de conta -");
		
		//Conta2 conta1 = new Conta2();
		List<Conta2> listConta = new ArrayList<Conta2>();
		
		for(int i = 0; i < 5; i++) {
			listConta.add(new Conta2());
			
			mainProgram(listConta.get(i));
			
			listConta.get(i).resumoConta();
		}
		
		scan.close();
	}
	
	static void mainProgram(Conta2 conta) {		
		Scanner scan = new Scanner(System.in);
		int nmrDivisao = 1;
		double aux;
		
		do {//detalhes do valor	da compra	
			try {
				aux = 0;
				System.out.print("\nValor da compra: ");
				aux = scan.nextDouble();
				conta.setValor(aux);
				System.err.print((conta.getValor() <= 0.01) ? "Valor minimo da compra: R$0.01\n" : "");
			}catch(Exception e) {/*System.err.println(e);*/}
			
		}while(conta.getValor() <= 0.01);
		
				
		do {//detalhes da divisao
			System.out.print("\nDividir a compra em quantas pessoas: ");
			nmrDivisao = scan.nextInt();
			System.err.print((nmrDivisao == 0 || nmrDivisao > 10) ? "Divisão minima '1', dovisão maxima '10'" : "");
		}while(nmrDivisao < 1 || nmrDivisao > 10);//Minimo de 1 pessoa, maximo de 10
		
		do {//detalhes do pagamento	
			aux = 0;
			
			for(int i = 0; i < nmrDivisao; i++) {
				System.out.print((i + 1) + "° valor: ");
				aux += scan.nextDouble();
				System.out.println("Valor pago: " + aux);
			}
			conta.setValPago(aux);
			
			conta.pagarConta();
			
			System.err.print((!conta.isPagou()) ? "\n -Erro: O valor não foi o suficiente, vamos tentar de novo!\n\n" : "");
		}while(!conta.isPagou());
		scan.close();
	}	
}
