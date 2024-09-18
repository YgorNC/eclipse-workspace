package joption;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		double nota1 = 0;
		double nota2 = 0;

		try {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota: "));
			System.out.println(nota1);
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota: "));
			System.out.println(nota2);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!");
		}
	}
}