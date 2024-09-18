import java.util.Locale;
import java.util.Scanner;

public class pratica1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		float A, B, C, resultado1, resultado2, resultado3, resultado4, resultado5;
		double pi = 3.14159;
		
		System.out.println("Área do triângulo retângulo");
		System.out.print("Digite o valor da base do triângulo: ");
		A = sc.nextFloat();
		
		System.out.print("Digite o valor da altura do triângulo: ");
		C = sc.nextFloat();
		
		resultado1 = (A * C) / 2;
		
		System.out.println("\nÁrea do círculo de raio C");
		System.out.print("Digite o valor do raio: ");
		C = sc.nextFloat();
		
		resultado2 = (float) (pi * Math.pow(C, 2));
		
		System.out.println("\nÁrea do trapézio");
		System.out.print("Digite os valores da base: ");
		A = sc.nextFloat();
		B = sc.nextFloat();
		
		System.out.print("Digite o valor da altura: ");
		C = sc.nextFloat();
		
		resultado3 = (A+B)*C/2;
		
		System.out.println("\nÁrea do quadrado");
		System.out.print("Digite o valor lateral do quadrado: ");
		B = sc.nextFloat();
		
		resultado4 = (float) Math.pow(B, 2);
		
		System.out.println("\nÁrea do retângulo");
		System.out.print("Digite os valores das laterais do retângulo (base e altura)");
		A = sc.nextFloat();
		B = sc.nextFloat();
		
		resultado5 = A * B;
		
		System.out.printf("A área do triângulo retângulo é: %.3f", resultado1);
		System.out.printf("\nA área do raio do círculo é: %.3f", resultado2);
		System.out.printf("\nA área do trapézio é: %.3f", resultado3);
		System.out.printf("\nA área do quadrado é: %.3f", resultado4);
		System.out.printf("\nA área do retângulo é: %.3f", resultado5);
		
		sc.close();
	}
}
