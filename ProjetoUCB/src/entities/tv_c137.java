package entities;

public class tv_c137 {

	public String modelo = "C137_LG";
	public String cor = "Black Piano";
	public Float tamanho = 32f;
	public boolean energia;
	
	public void ligar() {
		this.energia = true;
	}
	
	public void desligar() {
		this.energia = false;
	}
	
	public String toString() {
		return "\nModelo: "
				+ modelo
				+ "\nCor: "
				+ cor
				+ "\nPolegadas: "
				+ tamanho
				+ "\nLigado: "
				+ energia
				+ "\n===================";
	}
}
