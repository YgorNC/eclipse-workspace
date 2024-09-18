package entities;

public class tv_a1 {
	public String modelo = "A1 Samsung";
	public String cor = "Black";
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
