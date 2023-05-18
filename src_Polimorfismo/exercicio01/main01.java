package exercicio01;

public class main01 {

	public static void main(String[] args) {
		
		//PRODUTOS
		Produto newDoce = new Doces();
		newDoce.setPreco(2.99);
		newDoce.setQuantidade(2);
		
		Produto newPao = new Pao();
		newPao.setPreco(0.50);
		newPao.setQuantidade(5);
		
		Produto newFrio = new Frios();
		newFrio.setPreco(2.50);
		newFrio.setQuantidade(9);
		
		//PEDIDO
		Pedido pedido = new Pedido();
		pedido.addProdutos(newDoce);
		pedido.addProdutos(newPao);
		pedido.addProdutos(newFrio);
		
		System.out.println(	"-PEDIDO-\n" +
				 			"-------------------\n" + 
							">Doce\n" + 
							"Preço: " + newDoce.getPreco() + "\n" +
							"Quantidade: " + newDoce.getQuantidade() + "\n" +
							">Pao: " + "\n" +
							"Preço: " + newPao.getPreco() + "\n" +
							"Quantidade: " + newPao.getQuantidade() + "\n" +
							">Frio: " + "\n" +
							"Preço: " + newFrio.getPreco() + "\n" +
							"Quantidade: " + newFrio.getQuantidade());
		
		System.out.println("\nTotal: " + pedido.valorDoPedido());
		
	}

}
