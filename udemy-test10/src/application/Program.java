package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i ++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println("\nNúmeros negativos:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.printf("%.0f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
