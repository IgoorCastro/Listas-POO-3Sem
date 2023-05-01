/*
3) Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.
 Igor Kaue Nardes de Castro
 */
package lista04;

public class Lampada3 {
	String marca;
	String modelo;
	String tipo;
	byte ligada;//0: Desligada - 1: Ligada - outro: Meio-Ligada
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public byte getLigada() {
		return ligada;
	}
	public void setLigada(byte ligada) {
		this.ligada = ligada;
	}
	
	public String estado() {
		switch (ligada) {
		case 1: 
			return "Ligada";
		case 2:
			return "Desligada";
		case 3:
			return "Meia-luz";
		default:
			throw new IllegalArgumentException("Unexpected value: " + ligada);
		}
	}
	
}
