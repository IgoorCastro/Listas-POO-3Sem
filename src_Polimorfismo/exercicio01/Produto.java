/*
 * 
Igor Kaue Nardes de Castro
 */
package exercicio01;

public class Produto extends Pedido{
	
	private double preco;
	private double quantidade;
	
	public Produto() {
		
		preco = 0;
		quantidade = 0;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
