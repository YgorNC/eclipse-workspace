
public class ContaPoupanca extends Conta {

	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	public ContaPoupanca (int agencia, int numero) {
		super(agencia, numero);
	}
}
