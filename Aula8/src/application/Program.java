package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.print("Preço R$ ");
		 double preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		Produtos produtos = new Produtos(nome, preco, quantidade);
		
		System.out.println("\n" + produtos);
		
		System.out.print("\nAdicionar: ");
		quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.println("\nAtualização: \n" + produtos);
		
		System.out.print("\nRemover: ");
		quantidade = sc.nextInt();
		produtos.removeProdutos(quantidade);
		
		System.out.println("\nAtualização: \n" + produtos);
		
		System.out.print("\nAlterar nome: ");
		
		sc.nextLine();
		String name = sc.nextLine();
		produtos.setNome(nome);
		
		System.out.print("Alterar preço R$ ");
		double price = sc.nextDouble();
		produtos.setPreco(preco);
		
		System.out.println("\nAtualização: \n" + produtos);
		
		sc.close();
	}

}
