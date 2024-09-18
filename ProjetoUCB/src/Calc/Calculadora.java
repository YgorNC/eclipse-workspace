package Calc;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----- CALCULADORA SIMPLES -----");
		char op;
		
		do {
			System.out.print("\n1º Valor: ");
			float num1 = sc.nextFloat();

			System.out.print("Operador: ");
			char operador = sc.next().charAt(0);

			System.out.print("2º Valor: ");
			float num2 = sc.nextFloat();

			if (operador == '+') {
				float resultado = num1 + num2;
				System.out.println("\nResultado = " + resultado);
			} else if (operador == '-') {
				float resultado = num1 - num2;
				System.out.println("\nResultado = " + resultado);
			} else if (operador == '*') {
				float resultado = num1 * num2;
				System.out.println("\nResultado = " + resultado);
			} else if (operador == '/') {
				float resultado = num1 / num2;
				System.out.println("\nResultado = " + resultado);
			} else {
				System.out.println("\nOperador lógico não reconhecido, tente novamente!");
			}
			
			System.out.print("\nRealizar cálculo? ");
			op = sc.next().charAt(0);
		} while (op == 's');

		sc.close();
	}

}
