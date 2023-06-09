/*
Estágio, que em o tempo em meses (int) 
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Estagio extends Vaga{
	
	private int meses;
	
	public Estagio() {
		
		meses = 0;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		if(meses > 0)
			this.meses = meses;
	}
	
	@Override
	public String toString() {
		return 	"\nTipo: Estágio" +
				"\nDescrição: " + getDescricao() +
				"\nSálario: " + getSalario() + " R$" +
				"\nMeses: " + getMeses();
	}

}
