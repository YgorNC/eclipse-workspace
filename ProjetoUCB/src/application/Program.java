package application;

import entities.tv_a1;
import entities.tv_c137;

public class Program {

	public static void main(String[] args) {
		tv_a1 tv1 = new tv_a1();
		tv_c137 tv2 = new tv_c137();
		
		tv1.desligar();
		System.out.println(tv1);
		
		tv2.ligar();
		System.out.println(tv2);
	}
}
