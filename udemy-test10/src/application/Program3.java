package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Provider;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nmenores;
		double alturaTotal, alturaMedia, percentualMenores;
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		int n = sc.nextInt();
		
		Provider[] vect = new Provider[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("\nDados da %dª pessoa:", i + 1);
			System.out.print("\nNome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Provider(name, idade, altura);
		}
		
		nmenores = 0;
		alturaTotal = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				nmenores++;
			}
			alturaTotal += vect[i].getAltura();
		}
		
		alturaMedia = alturaTotal / vect.length;
		percentualMenores = ((double)nmenores / vect.length) * 100;
		
		System.out.printf("\nAltura media = %.2f\n", alturaMedia);
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
	    
	    for(int i=0; i < vect.length; i++) {
	    	if(vect[i].getIdade() < 16) {
	    		System.out.println(vect[i].getName());
	    	}
	    }
		
		sc.close();
	}

}
