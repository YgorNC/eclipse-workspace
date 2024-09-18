package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

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
		
		int posmaior = 0;
		double maior = vect[0];
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.printf("\nMaior valor = %.1f\n", maior);
	    System.out.printf("Posição do maior valor = %dº num.\n", posmaior);
		
		sc.close();
	}

}
