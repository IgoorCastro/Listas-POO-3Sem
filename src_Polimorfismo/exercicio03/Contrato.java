/*
Contrato, que pode ser temporário ou não (boolean).
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Contrato extends Vaga{
	
	private boolean temporario;
	
	public Contrato() {
		
		temporario = false;
	}

	public boolean isTemporario() {
		return temporario;
	}

	public void setTemporario(boolean temporario) {
		this.temporario = temporario;
	}
	
	@Override
	public String toString() {
		return "\nDescrição: " + getDescricao() +
				"\nSálario: " + getSalario() + " R$" +
				"\nTemporario: " + ( isTemporario() ? "Sim" : "Não");
	}

}
