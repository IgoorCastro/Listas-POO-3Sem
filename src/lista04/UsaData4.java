package lista04;

import java.util.Scanner;

public class UsaData4 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Data4 data = new Data4();
		
		System.out.println("- Teste de datas -");
		
		enviaDia(data);
		
		enviaMes(data);
		
		enviaAno(data);
		
		System.out.println("Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + "\n-Teste: " + ((data.dataValida()) ? "data encontrada!" : "data não encontrada"));
	}

	static void enviaAno(Data4 data) {
		int aux = 0;
		
		System.out.print("Ano: ");
		aux = scan.nextInt();
		
		data.setAno(aux);
	}
	
	static void enviaMes(Data4 data) {
		byte aux = 0;
		
		do{
			System.out.print("Mês: ");
			aux = scan.nextByte();
			System.err.print((aux < 1 || aux > 99) ? "\nValor invalido!\n\n" : "");
		}while(aux < 1 || aux > 99);
		
		data.setMes(aux);
	}
	
	static void enviaDia(Data4 data) {
		byte aux = 0;
		
		do {
			System.out.print("Dia: ");
			aux = scan.nextByte();
			System.err.print((aux < 1 || aux > 99) ? "\nValor invalido!\n\n" : "");
		}while(aux < 1 || aux > 99);
		
		data.setDia(aux);
	}
}
