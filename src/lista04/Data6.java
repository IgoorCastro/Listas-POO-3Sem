/*
6) Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos
para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor
anos de 365 dias.
Igor Kaue Nardes de Castro
*/
package lista04;

public class Data6 {

    private byte dia;
	private byte mes;
	private int ano;
	
	public Data6(byte dia, byte mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data6() {
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}
	
	public byte getDia() {
		return dia;
	}
	public void setDia(byte dia) {
		if(dia > 0)
			this.dia = dia;		
	}
	public byte getMes() {
		return mes;
	}
	public void setMes(byte mes) {
		if(mes > 0)
			this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


	public boolean dataValida() {//baseado em 2023
	
		switch (mes) {
		case 1: {//janeiro
			if(dia <= 31)
				return true;
		}
		case 2: {//fevereiro
			if(dia <= 28)
				return true;
		}
		case 3: {//março
			if(dia <= 31)
				return true;
		}
		case 4: {//abril
			if(dia <= 30)
				return true;
		}
		case 5: {//maio
			if(dia <= 31)
				return true;
		}
		case 6: {//junho
			if(dia <= 30)
				return true;
		}
		case 7: {//julho
			if(dia <= 31)
				return true;
		}
		case 8: {//agosto
			if(dia <= 31)
				return true;
		}
		case 9: {//setembro
			if(dia <= 30)
				return true;
		}
		case 10: {//outubro
			if(dia <= 31)
				return true;
		}
		case 11: {//novembro
			if(dia <= 30)
				return true;
		}
		case 12: {//dezembro
			if(dia <= 31)
				return true;
		}
		default:
			return false;
		}
	
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}