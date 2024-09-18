
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(120 , 1337);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(120 , 1338);
		
		System.out.println(Conta.getTotal());
	}
}
