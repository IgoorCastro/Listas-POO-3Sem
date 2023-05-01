/*
3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
Igor Kaue Nardes de Castro
 */
package lista04;
import java.util.Scanner;
public class UsaLampada3 {

	public static void main(String[] args) {
		Lampada3 lmpd = new Lampada3();
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
			do {
				System.out.print("\n[1] ligar - [2] desligar - [3] meia-luz - [0] sair: ");
				op = scan.nextInt();
			}while(op < 0 || op > 3);
			
			lmpd.setLigada((byte)op);
			
			System.out.println((op != 0) ? "Marca: " + lmpd.getMarca() + "\nModelo: " + lmpd.getModelo() + "\nTipo: " + lmpd.getTipo() + "\nStatus: " + lmpd.estado() : "fim");
		}while(op != 0); 
		
		scan.close();
	}

}
