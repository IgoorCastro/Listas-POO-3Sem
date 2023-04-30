package lista04;
import java.util.Scanner;
public class UsaConta2 {

	public static void main(String[] args) {
		Conta2 conta = new Conta2();
		Scanner scan = new Scanner(System.in);
		int nmrDivisao = 1;
		double aux;
		
		System.out.println("- Controle de conta -");
		
		do {//detalhes do valor	da compra	
			try {
				aux = 0;
				System.out.print("\nValor da compra: ");
				aux = scan.nextDouble();
				conta.setValor(aux);
				System.err.print((conta.getValor() <= 0.01) ? "Valor minimo da compra: R$0.01\n" : "");
			}catch(Exception e) {/*System.err.println(e);*/}
			
		}while(conta.getValor() <= 0.01);
		
				
		do {
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
