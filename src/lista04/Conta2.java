package lista04;

public class Conta2 {
	private double valor;
	private double valPago;
	private double troco;
	private boolean pagou;
	
	public Conta2() {
		valor = 0.0;
		valPago = 0.0;
		troco = 0.0;
		pagou = false;
	}
	
	public double getValPago() {
		return valPago;
	}

	public void setValPago(double valPago) {
		this.valPago = valPago;
	}

	public double getTroco() {
		return troco;
	}

	public void setTroco(double troco) {
		this.troco = troco;
	}

	public boolean isPagou() {
		return pagou;
	}

	public void setPagou(boolean pagou) {
		this.pagou = pagou;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void pagarConta() {
		if(valPago >= valor) {
			troco = valPago - valor;
			pagou = true;
			System.out.println("Troco: " + troco);
			System.out.println("\nConta paga!\n\n-Obrigado!");
		}else {
			System.err.println("Total: " + valor + "\nValor abaixo do total!");
		}
	}
	
	public void resumoConta() {
		System.out.println("- Resumo da compra -\nValor: " + valor + "\nTotal pago: " + valPago + "\nTroco: " + troco);
	}
}
