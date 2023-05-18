/*
Crie um sistema de vendas de produtos, onde cada pedido poderá ter no máximo
100 itens. O pedido deverá ser capaz de receber vários tipos produtos (superclasse),
como frios, pães, doces, etc (subclasses). Ao final da entrada dos produtos o pedido
deverá ter um método que calcule o valor total do pedido, onde ele varrerá o vetor de
produtos somando seus valores. Desafio: implementar a quantidade de produtos vezes
seu valor
Igor Kaue Nardes de Castro
 */

package exercicio01;

public class Pedido {

	private Produto[] produtos;
	private int contProduto;
	private double valorTotal;
	
	public Pedido() {
		//maximo de 100 pedidos
		produtos = new Produto[100]; 
		contProduto = 0;
		valorTotal = 0;
	}	
	
	public Produto[] getProdutos() {
		return produtos;
	}


	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public void addProdutos(Produto prod) {
		
		if(prod != null) {
			produtos[contProduto] = prod;
			contProduto++;
		}
		
	}
	
	public double valorDoPedido() {
		
		for(int i = 0; i < contProduto; i++){
			if(produtos[i] != null) 					
				//TOTAL
				valorTotal += produtos[i].getPreco() * produtos[i].getQuantidade();
		}

		return valorTotal;
	}
}
