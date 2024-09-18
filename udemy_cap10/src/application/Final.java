package application;

import java.util.Locale;
import java.util.Scanner;

public class Final {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantas linhas a matriz terá: ");
		int n = sc.nextInt();

		System.out.print("Agora digite quantas colunas a matriz terá: ");
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		System.out.println();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.print("\nEscolha um número: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("\nNumber position " + i + ", " + j + ":");
					if (j > 0) {
						System.out.println("\nLeft: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
