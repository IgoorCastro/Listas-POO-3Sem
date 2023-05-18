package exercicio02;

public class Arvore extends Planta{
	
	private boolean frutifera;
	
	public Arvore() {
		frutifera = false;
	}

	public boolean isFrutifera() {
		return frutifera;
	}

	public void setFrutifera(boolean frutifera) {
		this.frutifera = frutifera;
	}
	
	@Override
	public String toString() {
		return 	"\nPlanta: Arvore" +
				"\nNome: " + getNome() +
				"\nEspecie: " + getEspecie() +
				"\nFrutifera: " + ((isFrutifera()) ? "Sim" : "Não");
	}
	
}
