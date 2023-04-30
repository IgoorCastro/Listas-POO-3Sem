package lista05;

public class Ano3 {
	private int ano;
	
	public Ano3() {
		ano = 0;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean ehBissexto() {		
		return (ano % 4 == 0 && ano % 100 != 0 | ano % 400 == 0) ? true : false;
	}

}
