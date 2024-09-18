package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtos produtos = new Produtos();
		
		System.out.print("Nome do produto: ");
		produtos.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produtos.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produtos.quantidade = sc.nextInt();
		
		System.out.println(produtos);
		
		System.out.print("\nAdicionar quantidade: ");
		int quantidade = sc.nextInt();
		produtos.addProdutos(quantidade);
		
		System.out.print("Atualização\n\n" + produtos);
		
		System.out.print("\n\nRemover quantidade: ");
		quantidade = sc.nextInt();
		produtos.removeProdutos(quantidade);
		
		System.out.print("Atualização\n\n" + produtos);
		
		sc.close();
	}

}
