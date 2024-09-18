package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0;
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double VectAvg = sum / vect.length;
		
		System.out.printf("\nMédia do vetor = %.3f\n", VectAvg);
		
		System.out.println("Elementos abaixo da média:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < VectAvg) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		sc.close();
	}

}
