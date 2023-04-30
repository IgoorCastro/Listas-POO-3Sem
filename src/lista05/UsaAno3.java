package lista05;
import java.util.Scanner;
public class UsaAno3 {

	public static void main(String[] args) {
		Ano3 ano = new Ano3();
		Scanner scan = new Scanner(System.in);
		int op;
		do {//apenas para repetição
			System.out.print("Valor: ");
			op = scan.nextInt();
			ano.setAno(op);
			System.out.println((ano.ehBissexto() ? "\n-É bissexto!" : "\nNão é bissexto"));
		}while(op != 0);
		scan.close();
	}

}
