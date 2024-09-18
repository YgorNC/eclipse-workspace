package PrimeiroProjeto;

public class Aula1 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 10;
		int soma, subtracao;
		double mult, divis;
		
		soma = num1 + num2;
		subtracao = num1 - num2;
		mult = num1 * num2;
		divis = num1 / num2;
		
		System.out.println("A soma é = " + soma
				+ "\nA subtração é = " + subtracao
				+ "\nA multiplicação é = " + mult
				+ "\nA divisão é = " + divis);
		
		String nome = "Garfield";
		int idade = 10;
		
		System.out.printf("\nNome: %s\nIdade: %d", nome, idade);
	}

}
