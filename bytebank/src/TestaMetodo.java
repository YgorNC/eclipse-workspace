
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoYgor = new Conta();
		contaDoYgor.saldo = 100;
		contaDoYgor.deposita(50);
		System.out.println(contaDoYgor.saldo);
		
		boolean saqueProgresso = contaDoYgor.saca(10);
		System.out.println(contaDoYgor.saldo);
		System.out.println(saqueProgresso);
		
		Conta contaDaBrisa = new Conta();
		contaDaBrisa.deposita(1000);
		if(contaDaBrisa.transfere(300, contaDoYgor)) {
			System.out.println("Transferência concluída!");
		} else {
			System.out.println("Saldo insuficiente =(");
		}
		System.out.println(contaDaBrisa.saldo);
		System.out.println(contaDoYgor.saldo);
		
		contaDoYgor.titular = "Ygor Cortês";
		System.out.println(contaDoYgor.titular);
		
	}
}
