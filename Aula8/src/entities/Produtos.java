package entities;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtos() {
	}
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produtos(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double total() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " / Preço = R$ " + String.format("%.2f", preco) + " / Quantidade: " + quantidade + " / Total R$ "
				+ String.format("%.2f", total());
	}
}
