package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.empregadosTerceirizados;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();

		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.print(i + "º EMPREGADO(A) Tercerizado? (S/N) ");
			char opcao = sc.next().charAt(0);
			System.out.print("\nNOME: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("HORAS TRABALHADAS: ");
			int horasTrab = sc.nextInt();
			System.out.print("VALOR PORA HORA: ");
			double valorHora = sc.nextDouble();

			if (opcao == 's') {
				System.out.print("DESPESAS ADICIONAIS: ");
				double despesaAdicional = sc.nextDouble();
				list.add(new empregadosTerceirizados(nome, horasTrab, valorHora, despesaAdicional));
			} else {
				list.add(new Employee(nome, horasTrab, valorHora));
			}
		}

		System.out.println();
		System.out.println("============ PAGAMENTO ============");
		for (Employee employee : list) {
			System.out.println("\nNOME: " + employee.getNome() + "\nUSD " + String.format("%.2f", employee.pagamento()));
		}

		sc.close();
	}

}
