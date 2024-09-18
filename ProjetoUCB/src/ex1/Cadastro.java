package ex1;

import javax.swing.JOptionPane;

public class Cadastro {

	public static void main(String[] args) {

		String name;
		String endereco;
		String matricula;

		name = JOptionPane.showInputDialog("Digite seu nome: ");
		endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
		matricula = JOptionPane.showInputDialog("Digite sua matrícula: ");

		String mensagem = "Nome: " + name + "\nEndereço: " + endereco + "\nMatrícula: " + matricula;
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado!\n" + mensagem);
	}

}
