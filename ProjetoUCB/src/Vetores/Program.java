package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int maior;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		int[] vetor = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("\nDigite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		maior = vetor[0];
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				System.out.println("\nMaior número: " + maior + "\nPosição do maior número: " + (i + 1) + "º");
			}
		}
		
		sc.close();
	}
}
