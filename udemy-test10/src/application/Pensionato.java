package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] pension = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\nRent #%d:", i);
			System.out.print("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String mail = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			pension[roomNumber] = new Rent(name, mail);
		}

		System.out.println("\nBusy rooms:");
		for (int i = 0; i < 10; i++) {
			if (pension[i] != null) {
				System.out.println(i + ": " + pension[i]);
			}

			sc.close();
		}
	}
}
