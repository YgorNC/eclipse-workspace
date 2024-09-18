package repetition;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas senhas serão geradas? ");
		int senha = sc.nextInt();
		
		for (int i = 0; i < senha; i++) {
			System.out.print("SENHA: ");
			int x = sc.nextInt();
			System.out.println("SENHA Nº " + i);
		}
		
		String nome = "Teste de Letras ";
		System.out.printf("\n\n==== Frase original====> (" + nome + ")");
		
		String nome1 = nome.toLowerCase();
		System.out.println("\nMinúsculo => (" + nome1 + ")");
		
		String nome2 = nome.toUpperCase();
		System.out.println("Maiúsculo => (" + nome2 + ")");
		
		String nome3 = nome.trim();
		System.out.println("Remove espaços => (" + nome3 + ")");
		
		String nome4 = nome.substring(3);
		System.out.println("recorta a partir do caractere(3) => (" + nome4 + ")");
		
		String nome5 = nome.substring(3, 10);
		System.out.println("recorta a partir do caractere(3, 10) => (" + nome5 + ")");
		
		String nome6 = nome.replace('e','A');
		System.out.println("substituir a letra 'e' por 'A' => (" + nome6 + ")");
		String nome7 = nome.replace("Letra","Sinal");
		System.out.println("substituir a palavra 'Letra' por 'Sinal' => (" + nome7 + ")");
		
		sc.close();
	}

}
