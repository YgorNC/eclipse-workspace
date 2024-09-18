package FuncaoCount;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		double valor = sc.nextDouble();
		
		System.out.print("Digite o imposto: ");
		double imp = (valor * sc.nextDouble()) / 100;
		double total = imp + valor;
		
		System.out.println("\nTOTAL R$ " + total);
		
		sc.close();
	}

}
