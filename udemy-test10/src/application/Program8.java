package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int sum = 0;
		int par = 0;
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				sum += vect[i];
				par++;
			}
		}
		
		if(sum > 0 && par > 0) {
			double avg = (double) sum / par;
			System.out.printf("Média dos pares = %.1f%n", avg);
		} else {
			System.out.println("Nenhum número par!");
		}
		
		sc.close();
	}
}
