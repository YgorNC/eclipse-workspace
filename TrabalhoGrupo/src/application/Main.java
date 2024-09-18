package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num = 1;

		System.out.println("========== SISTEMA DE CADASTRO ==========");

		while (num != 0) {

			System.out.print("\nCadastre o nome da empresa: ");
			String empresa = sc.nextLine();

			System.out.print("Cadastrar CNPJ: ");
			String cnpj = sc.nextLine();

			System.out.print("Cadastro de renda bruta (mensal): R$ ");
			double salario = sc.nextDouble();

			System.out.print("\nDeseja cadastrar novamente? \nPara finalizar, digite [0] ");
			num = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("\nCadastro realizado com sucesso!");

		sc.close();
	}
}
