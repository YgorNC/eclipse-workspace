import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// CONTAGEM DE NÚMEROS ÍMPARES EM UM INTERVALO

		int x;

		System.out.print("Digite um número X: ");
		x = sc.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// CONTAGEM DE NÚMEROS DENTRO E FORA DE UM INTERVALO

		int n;

		int in = 0;
		int out = 0;

		System.out.print("\nDigite um valor X de repetições: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Digite um valor: ");
			int z = sc.nextInt();

			if (z >= 10 && z <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println("\n");
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
