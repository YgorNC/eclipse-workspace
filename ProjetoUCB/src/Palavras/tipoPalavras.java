package Palavras;

import java.util.Scanner;

public class tipoPalavras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char code;
		String name;
		String rest;
		
		System.out.print("Digite seu código de acesso, nome e sobrenome: ");
		code = sc.next().charAt(0);
		name = sc.next();
		rest = sc.nextLine();
		
		System.out.printf("\nCódigo de usuário: %s\nNome: %s\nSobrenome: %s", code, name, rest);
		
		sc.close();
	}

}
