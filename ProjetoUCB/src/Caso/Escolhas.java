package Caso;

import java.util.Scanner;

public class Escolhas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um produto\n");
		System.out.println("1 - Bolsa\n2 - Sapato\n3 - Blusa\n");
		System.out.print("Item: ");
		int opcao = sc.nextInt();
		String produto;

		switch (opcao) {
		case 1:
			produto = "Bolsa selecionada";
			break;
		case 2:
			produto = "Sapato selecionado";
			break;
		case 3:
			produto = "Blusa selecionada";
			break;
		default:
			produto = "Opção inválida!";
			break;
		}
		
		System.out.println("\nProduto: " + produto);

		sc.close();
	}

}
