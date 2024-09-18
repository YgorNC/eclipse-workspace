
public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente outra = null;
		outra.deposita(200);
		
		ContaCorrente cc = new ContaCorrente(114, 84);
		cc.deposita(1200);
		
		ContaPoupanca cp = new ContaPoupanca(114, 264);
		cp.deposita(1200);
		
		cc.transfere(200, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
	}
}
