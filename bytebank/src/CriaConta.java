
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta ();
		segundaConta.saldo = 300;
		
		System.out.println("A primeira conta possui R$" + primeiraConta.saldo);
		System.out.println("A segunda conta possui R$" + segundaConta.saldo);
		
		primeiraConta.agencia = 212;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.conta);
		System.out.println(segundaConta.agencia);
		System.out.println(segundaConta.conta);
		
		segundaConta.agencia = 212;
		System.out.println("A segunda conta está vinculada à agência " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("É a mesma conta!");
		} else {
			System.out.println("Contas diferentes!");
			
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
	}
}

