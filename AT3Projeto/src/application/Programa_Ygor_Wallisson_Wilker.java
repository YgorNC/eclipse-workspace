package application;

import java.util.Scanner;

import entities.Graduacao_Ygor_Wallisson_Wilker;
import entities.Pessoas;
import entities.PosGraduacao_Ygor_Wallisson_Wilker;

public class Programa_Ygor_Wallisson_Wilker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoas[] registros = new Pessoas[10];
        int n;

        do {
            System.out.println("============== BEM-VINDO ==============");
            System.out.println("\n1 - Cadastro Graduação\n2 - Cadastro Pós-Graduação\n3 - Sair");

            while (true) {
                System.out.print("\nEscolha uma das opções acima: ");
                if (sc.hasNextInt()) {
                    n = sc.nextInt();
                    if (n >= 1 && n <= 3) {
                        break;
                    } else {
                        System.out.println("\nOpção inválida!\nPor favor, escolha uma das opções (1/2/3)");
                    }
                } else {
                    System.out.println("\nEntrada inválida!\nPor favor, escolha uma das opções (1/2/3)");
                    sc.next();
                }
            }

            switch (n) {
                case 1:
                    System.out.println("\n======== CADASTRO DE GRADUAÇÃO ========\n");
                    System.out.print("Digite seu nome: ");
                    sc.nextLine();
                    String nomeGraduacao = sc.nextLine();
                    System.out.print("Digite seu CPF: ");
                    String cpfGraduacao = sc.nextLine();

                    int matriculaGraduacao;
                    while (true) {
                        System.out.print("Digite sua matrícula: ");
                        if (sc.hasNextInt()) {
                            matriculaGraduacao = sc.nextInt();
                            break;
                        } else {
                            System.out.println("\nMatrícula inválida! Digite apenas números.");
                            sc.next();
                        }
                    }

                    System.out.print("Digite o nome do curso: ");
                    sc.nextLine();
                    String cursoGraduacao = sc.nextLine();
                    System.out.println();
                    Graduacao_Ygor_Wallisson_Wilker graduacao = new Graduacao_Ygor_Wallisson_Wilker(nomeGraduacao, cpfGraduacao, matriculaGraduacao, cursoGraduacao);

                    boolean addGraduacao = false;
                    for (int i = 0; i < registros.length; i++) {
                        if (registros[i] == null) {
                            registros[i] = graduacao;
                            addGraduacao = true;
                            break;
                        }
                    }

                    if (!addGraduacao) {
                        System.out.println("Limite de registros atingido.");
                    }
                    break;

                case 2:
                    System.out.println("\n======== CADASTRO DE PÓS-GRADUAÇÃO ========\n");
                    System.out.print("Digite seu nome: ");
                    sc.nextLine();
                    String nomePosGraduacao = sc.nextLine();
                    System.out.print("Digite seu CPF: ");
                    String cpfPosGraduacao = sc.nextLine();

                    int matriculaPosGraduacao;
                    while (true) {
                        System.out.print("Digite sua matrícula: ");
                        if (sc.hasNextInt()) {
                            matriculaPosGraduacao = sc.nextInt();
                            break;
                        } else {
                        	System.out.println("\nMatrícula inválida! Digite apenas números.");
                            sc.next();
                        }
                    }

                    System.out.print("Digite o nome do curso: ");
                    sc.nextLine();
                    String cursoPosGraduacao = sc.nextLine();
                    System.out.println();
                    PosGraduacao_Ygor_Wallisson_Wilker posGraduacao = new PosGraduacao_Ygor_Wallisson_Wilker(nomePosGraduacao, cpfPosGraduacao, matriculaPosGraduacao, cursoPosGraduacao);

                    boolean addPosGraduacao = false;
                    for (int i = 0; i < registros.length; i++) {
                        if (registros[i] == null) {
                            registros[i] = posGraduacao;
                            addPosGraduacao = true;
                            break;
                        }
                    }

                    if (!addPosGraduacao) {
                        System.out.println("Limite de registros atingido!");
                    }
                    break;

                case 3:
                    System.out.println("\n======== HISTÓRICO DE CADASTROS ========\n");
                    System.out.println("Registros cadastrados:");
                    for (Pessoas registro : registros) {
                        if (registro != null) {
                            System.out.println(registro);
                        }
                    }
                    break;
            }
        } while (n != 3);

        sc.close();
    }
}
