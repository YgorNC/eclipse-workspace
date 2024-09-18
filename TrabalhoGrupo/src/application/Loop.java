package application;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha;
		int i = 0;

		do {
			System.out.print("Digite sua senha: ");
			senha = sc.nextInt();
			if (senha == 123) {
				System.out.println("SENHA CORRETA\n");
			} else {
				System.out.println("ERRO DE SENHA\n");
			}
		} while (senha != 123);

		while (i == 0) {
			int numero;
			do {
				System.out.println("1 - Cadastrar Cliente");
				System.out.println("2 - Comprar Carro");
				System.out.println("3 - Comprar Acessório");
				System.out.print("\nEscolha uma das opções (1/2/3): ");

				numero = sc.nextInt();

				System.out.println("\n=============================");

				switch (numero) {
				case 1:
					System.out.println("\n1 - Cadastro de Cliente\n");
					System.out.print("Nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					System.out.print("Endereço: ");
					String endereco = sc.nextLine();
					System.out.print("Telefone: ");
					String tel = sc.nextLine();
					break;
				}

				switch (numero) {
				case 2:
					int car;
					do {
						System.out.println("\nCOMPRA DE CARRO\n");
						System.out.println("1 - Ford Ka");
						System.out.println("2 - Renault Logan");
						System.out.println("3 - Chevrolet Vectra");
						System.out.print("\nEscolha uma das opções (1/2/3): ");
						car = sc.nextInt();

						switch (car) {
						case 1:
							System.out.println("\nFord Ka selecionado!");
							break;
						case 2:
							System.out.println("\nRenault Logan selecionado!\n");
							break;
						case 3:
							System.out.println("\nChevrolet Vectra selecionado!\n");
							break;
						default:
							System.out.println("\nOPÇÃO INVÁLIDA!");
							break;
						}
					} while (car <= 0 || car > 3);

					System.out.print("Qual cor deseja? ");
					sc.nextLine();
					String cor = sc.nextLine();

					int pay;
					do {
						System.out.println("\nQual a forma de pagamento? \n");
						System.out.println("1 - Financiamento");
						System.out.println("2 - Cartão");
						System.out.println("3 - PIX");
						System.out.println("4 - Dinheiro");
						System.out.print("\nEscolha uma das opções (1/2/3/4): ");
						pay = sc.nextInt();

						switch (pay) {
						case 1:
							System.out.println("\nOPÇÃO FINANCIAMENTO SELECIONADA!");
							break;
						case 2:
							System.out.println("\nOPÇÃO CARTÃO SELECIONADA!");
							break;
						case 3:
							System.out.println("\nOPÇÃO PIX SELECIONADA!");
							break;
						case 4:
							System.out.println("\nOPÇÃO DINHEIRO SELECIONADA!");
							break;
						default:
							System.out.println("\nOPÇÃO INVÁLIDA!");
							break;
						}
					} while (pay <= 0 || pay > 4);
				}

				switch (numero) {
				case 3:
					int acessorio;
					do {
						System.out.println("\nCOMPRA DE ACESSÓRIO\n");
						System.out.println("1 - Bodykit");
						System.out.println("2 - Multimídia");
						System.out.println("3 - Aerofólio");
						System.out.print("\nEscolha uma das opções (1/2/3): ");
						acessorio = sc.nextInt();

						switch (acessorio) {
						case 1:
							System.out.println("\nBodykit selecionado!");
							System.out.print("Quantas unidades? ");
							sc.nextLine();
							String uni = sc.nextLine();
							break;
						case 2:
							System.out.println("Multimídia selecionado!\n");
							System.out.print("Quantas unidades? ");
							sc.nextLine();
							uni = sc.nextLine();
							break;
						case 3:
							System.out.println("Aerofólio selecionado!\n");
							System.out.print("Quantas unidades? ");
							sc.nextLine();
							uni = sc.nextLine();
							break;
						default:
							System.out.println("\nOPÇÃO INVÁLIDA!");
							break;
						}
					} while (acessorio <= 0 || acessorio > 3);
				}
				
				if (numero <= 0 || numero > 3) {
					System.out.println("\nOPÇÃO INVÁLIDA!");
				}
				
				System.out.println("\n=============================\n");
			} while (numero <= 0 || numero > 3);
		}

		sc.close();
	}

}
