package exercicio02;

public class Flor extends Planta{
	
	private String cor;
	
	public Flor() {
		cor = "Desconhecida";
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return 	"\nPlanta: Flor" +
				"\nNome: " + getNome() +
				"\nEspecie: " + getEspecie() +
				"\nCor: " + getCor();
	}

}
