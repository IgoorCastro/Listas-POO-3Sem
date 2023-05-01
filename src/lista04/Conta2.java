/*
2) Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que
dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe
para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a
quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os
dados inseridos não permitindo absurdos.
Igor Kaue Nardes de Castro
 */

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
		System.out.println("\n\n- Resumo da compra -\nValor: " + valor + "\nTotal pago: " + valPago + "\nTroco: " + troco + "\nStatus da compra: " + ((pagou) ? "Pago com sucesso." : "Não finalizada."));
	}
}
