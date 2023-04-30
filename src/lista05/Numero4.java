package lista05;

public class Numero4 {
	private int numero;
	
	public Numero4() {
		numero = 0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int inverter() {
		int invertido = 0;	    
	    
    	while (numero > 0) {
	        int digito = numero % 10;
	        invertido = invertido * 10 + digito;
	        numero /= 10;
	    }
		return invertido;
	}
}
