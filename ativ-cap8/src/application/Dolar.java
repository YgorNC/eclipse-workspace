package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Convert;

public class Dolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Convert dollar = new Convert();
		
		System.out.print("What is the dollar price? ");
		dollar.priceDollar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dollar.bought = sc.nextDouble();
		
		System.out.print(dollar);
		
		sc.close();
	}

}
