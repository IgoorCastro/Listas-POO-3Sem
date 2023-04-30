/*
1) Criar uma classe para representar uma lâmpada vendida em um supermercado. Além de marca, modelo
e tipo, esta deve conter um atributo que indique um dos dois possíveis estados da lâmpada (acesa ou
apagada).
Igor Kaue Nardes de Castro
 */
package lista04;
import java.util.Scanner;
public class UsaLampada1 {

	public static void main(String[] args) {
		Lampada1 lmpd = new Lampada1();
		Scanner scan = new Scanner(System.in);
		int op = 0;
		String aux;
		
		System.out.println("- Cadastre a lampada -\n");	
		aux = null;			
		
		System.out.print("Marca: ");
		aux = scan.next();
		lmpd.setMarca(aux);
		
		System.out.print("Modelo: ");
		aux = scan.next();
		lmpd.setModelo(aux);
		
		System.out.print("Tipo: ");
		aux = scan.next();
		lmpd.setTipo(aux);
		
		do {			
			System.out.print("\n[1] ligar - [2] desligar - [0] sair: ");
			op = scan.nextInt();
			lmpd.setLigada((op == 1) ? true : false);
			
			System.out.println("Marca: " + lmpd.getMarca() + "\nModelo: " + lmpd.getModelo() + "\nTipo: " + lmpd.getTipo() + "\nStatus: " + ((lmpd.isLigada()) ? "Ligada" : "Desligada"));
		}while(op != 0);
		
		scan.close();
	}

}
