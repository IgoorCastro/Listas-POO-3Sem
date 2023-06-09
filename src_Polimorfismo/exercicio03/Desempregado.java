/*
Desempregados, que tem o tempo em meses (int) que não trabalha
Igor Kaue Nardes de Castro
 */

package exercicio03;

public class Desempregado extends Candidato{
	
	private int tempoDesempregado;
	
	public Desempregado() {
		
		tempoDesempregado = 0;
	}

	public int getTempoDesempregado() {
		return tempoDesempregado;
	}

	public void setTempoDesempregado(int tempoDesempregado) {
		this.tempoDesempregado = tempoDesempregado;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + getNome() +
				"Idade: " + getIdade() +
				"Tempo desempregado: " + getTempoDesempregado();
	}
}
