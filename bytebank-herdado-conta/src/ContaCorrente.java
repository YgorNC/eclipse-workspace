
public class ContaCorrente extends Conta implements Tributavel{

	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}
