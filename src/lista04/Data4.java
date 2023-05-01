/*
4) Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano
que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.
Igor Kaue Nardes de Castro
 */
package lista04;

public class Data4 {
	private byte dia;
	private byte mes;
	private int ano;
	
	public Data4() {
		dia = 0;
		mes = 0;
		ano = 0;
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
}
