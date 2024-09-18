package Valores;

import java.util.Scanner;

public class Aula2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		double sal, va, vt;
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.print("Digite seu salário: ");
		sal = sc.nextDouble();
		System.out.print("Digite seu Vale-Alimentação: ");
		va = sc.nextDouble();
		System.out.print("Digite seu Vale-Transporte: ");
		vt = sc.nextDouble();
		
		System.out.printf("\nIdade: %s\nSalário: R$ %.2f\nVale-Alimentação: R$ %.2f\nVale-Transporte: R$ %.2f", idade,
				sal, va, vt);
		
		sc.close();
	}
}
