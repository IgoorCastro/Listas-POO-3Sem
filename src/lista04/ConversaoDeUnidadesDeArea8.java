package lista04;



public class ConversaoDeUnidadesDeArea8 {
	
	private double medida;
	
	public ConversaoDeUnidadesDeArea8() {
		medida = 1;
	}

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		if(medida > 0)
			this.medida = medida;
	}
	
	public double metroQuadrado() {		
		return medida * 10.76;
	}
	
	public double peQuadrado() {	
		return medida * 929;
	}
	
	public double milhaQuadrada() {
		return medida * 640;
	}
	
	public double acre() {
		return medida * 43.560;
	}
}