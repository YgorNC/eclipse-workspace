import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		//LEITURA DE SENHA
		
		Scanner sc = new Scanner(System.in);

		int senha = 1100;

		do {
			System.out.print("Senha: ");
			senha = sc.nextInt();
			if(senha != 1100) {
				System.out.println("Senha inválida!\n");
			} else {
				System.out.println("Acesso liberado!\n");
			}
		} while (senha != 1100);
		
		//LEITURA DE COORDENADAS
		
		double x, y;
		
		System.out.println("Digite as coodernadas\n");
		System.out.print("X: ");
		x = sc.nextDouble();
		System.out.print("Y: ");
		y = sc.nextDouble();
		
		while(x != 0.0 && y != 0.0) {
			
			if(x > 0.0 && y > 0.0) {
				System.out.println("\nPrimeiro quadrante!\n");
			} else if(x < 0.0 && y > 0.0) {
				System.out.println("\nSegundo quadrante!\n");
			} else if(x < 0.0 && y < 0.0) {
				System.out.println("\nTerceiro quadrante!\n");
			} else if(x > 0.0 && y < 0.0) {
				System.out.println("\nQuarto quadrante!\n");
			}
			
			System.out.print("X: ");
			x = sc.nextDouble();
			System.out.print("Y: ");
			y = sc.nextDouble();
		}

		//LEVANTAMENTO DE DADOS POR CLIENTE
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int opcao;
		
		do {
			System.out.println("Cadastro de opções\n");
			System.out.println("Digite a opção escolhida\n");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Sair");
			System.out.print("\nDigite uma opção: ");
			
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				alcool += 1;
			}else if(opcao == 2) {
				gasolina += 1;
			}else if(opcao == 3) {
				diesel += 1;
			}else {
				System.out.println("Opção inválida!\n");
			}
			
		} while(opcao != 4);
		
		System.out.println("===== Quantidade de clientes por combustível =====");
		System.out.printf("\nÁlcool: %s\nGasolina: %s\nDiesel: %s\n", alcool, gasolina, diesel);	
		System.out.println("\nMuito obrigado!");	
		
		sc.close();
	}
}
