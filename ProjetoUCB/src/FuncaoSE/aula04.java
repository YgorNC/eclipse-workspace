package FuncaoSE;

import java.util.Scanner;

public class aula04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a hora: ");
		int hora = sc.nextInt();
		
		if (hora >= 0 && hora <= 6) {
			System.out.println("Madrugada");
		} else if (hora > 6 && hora <= 12) {
			System.out.println("Manhã");
			} else if (hora > 12 && hora <= 18) {
				System.out.println("Tardê");
				} else {
						System.out.println("Noitê");
				}
		
		System.out.println("Digite sua idadde: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade!");
		} else {
			System.out.println("Menor de idade!");
		}
		
		sc.close();
	}

}
