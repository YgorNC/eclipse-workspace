package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros pares:");
		int sum = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				sum++;
				System.out.print(vect[i] + "  ");
			}
		}
		
		System.out.println("\n\nQuantidade de pares = " + sum);
		
		sc.close();
	}

}
