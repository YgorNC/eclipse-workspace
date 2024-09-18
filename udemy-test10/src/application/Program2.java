package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("\nValores = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print("  " + vect[i]);
		}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		System.out.printf("\nSoma = %.2f%n", sum);
		
		double avg = sum / n;
		
		System.out.printf("Média = %.2f%n", avg);
		
		sc.close();
	}

}
