package entities;

public class Produtos {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double total () {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		System.out.println();
		return nome
				+ " / Preço: $"
				+ String.format("%.2f", preco)
				+ " / Quantidade: "
				+ quantidade
				+ " / Total: $ "
				+ String.format("%.2f", total());
	}
}
