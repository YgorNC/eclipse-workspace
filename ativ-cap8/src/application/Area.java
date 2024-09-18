package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calc;

public class Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calc rect = new Calc();
		
		System.out.println("Enter rectangle width and height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("\nArea = %.2f%n", rect.calcArea());
		System.out.printf("Perimeter = %.2f%n", rect.calcPerimeter());
		System.out.printf("Diagonal = %.2f%n", rect.calcDiagonal());
		
		sc.close();
	}

}
