import java.util.Locale;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// CALCULANDO MÉDIA PONDERADA DE NOTAS

		System.out.print("Informe quantos alunos: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("\nDigite a 1ª nota: ");
			double a = sc.nextDouble();
			System.out.print("Digite a 2ª nota: ");
			double b = sc.nextDouble();
			System.out.print("Digite a 3ª nota: ");
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("\nMédia: %.1f%n", media);
		}

		// DIVISÃO DE ENTRADAS

		System.out.println("\nDIVISÃO");

		System.out.print("\nQuantidade de repetições: ");
		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			System.out.print("\nDigite o 1º valor: ");
			int a = sc.nextInt();
			System.out.print("Digite o 2º valor: ");
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("\nDivisão impossível");
				break;
			}

			double resultado = (double) a / b;

			System.out.printf("\nResultado da divisão: %.1f%n", resultado);

		}

		// CÁLCULO DE FATORIAL

		System.out.println("\nCálculo de Fatorial");
		System.out.print("\nDigite um número: ");
		int n2 = sc.nextInt();

		int fat = 1;
		for (int i = 1; i <= n2; i++) {
			fat = fat * i;
		}

		System.out.printf("\nResultado do fatorial: %s", fat);

		// TODAS POSSÍVEIS DIVISÕES COM RESULTADOS 0

		System.out.println("\n\nCálculo de Divisão");
		System.out.print("\nInforme o número: ");
		int n3 = sc.nextInt();

		for (int i = 1; i <= n3; i++) {

			if (n3 % i == 0) {
				System.out.printf("\nDivisível por: %s%n", i);
			}
		}

		// ELEVANDO AO QUADRADO E AO CUBO

		System.out.println("\nPotência");
		System.out.print("\nDigite o número: ");
		int n4 = sc.nextInt();
		System.out.print("\n");

		for (int i = 1; i <= n4; i++) {

			int potencia = (int) (Math.pow(i, 2));
			int potencia1 = (int) (Math.pow(i, 3));

			System.out.println(i + " " + potencia + " " + potencia1);
		}

		sc.close();
	}
}
