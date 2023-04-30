package lista05;
import java.util.Scanner;
public class UsaNumero {

	public static void main(String[] args) {
		Numero4 num = new Numero4();
		Scanner scan = new Scanner(System.in);
		int op;
		do {//apenas para repetição
			System.out.print("Valor: ");
			op = scan.nextInt();
			num.setNumero(op);
			System.out.println("\nValor invertido: " + num.inverter());
		}while(op != 0);
		scan.close();

	}

}
