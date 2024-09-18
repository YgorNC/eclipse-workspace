
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;	
		
		System.out.println("Seu saldo é de R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Seu saldo é de R$" + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Seu saldo é de R$" + primeiraConta.saldo);
		System.out.println("Seu saldo é de R$" + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("É a mesma conta!");
		}
	}
}
