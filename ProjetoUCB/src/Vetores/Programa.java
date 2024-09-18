package Vetores;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos candidatos(as) serão cadastrados(as)? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] media = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println(i + 1 + "º CANDIDATO");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Nota 1: ");
			nota1[i] = sc.nextDouble();
			
			System.out.print("Nota 2: ");
			nota2[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		System.out.println("\n============ CANDIDATOS APROVADOS ============");
		for (int i = 0; i < n; i++) {
			if (media[i] >= 7) {
				System.out.println("Candidato: " + nome[i] + " / " + "Nota: " + media[i]);
			}
		}
		
		sc.close();
	}

}
