package exercicio02;

public class Carnivora extends Planta{
	
	private boolean venenosa;
	
	public Carnivora() {
		venenosa = false;
	}

	public boolean isVenenosa() {
		return venenosa;
	}

	public void setVenenosa(boolean venenosa) {
		this.venenosa = venenosa;
	}	
	
	@Override
	public String toString() {
		return 	"\nPlanta: Carnivora" +
				"\nNome: " + getNome() +
				"\nEspecie: " + getEspecie() +
				"\nVenenosa: " + ((isVenenosa()) ? "Sim" : "Não");
	}
}
