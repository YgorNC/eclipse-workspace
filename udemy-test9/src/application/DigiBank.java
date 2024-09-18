package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class DigiBank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNum = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit? (Y/N) ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, accountNum, initialDeposit);
		} else {
			account = new Account(holder, accountNum);
		}
		
		System.out.println("\nAccount data: \n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.depositBalance(depositValue);
		
		System.out.print("Updated account data: \n" + account);
		
		System.out.print("\n\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdrawBalance(withdrawValue);
		
		System.out.print("Updated account data: \n" + account);
		
		sc.close();
	}

}
