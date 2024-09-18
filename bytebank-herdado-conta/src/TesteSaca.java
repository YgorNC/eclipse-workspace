
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(122, 110);
		
		conta.deposita(200);
		
		try {
			conta.saca(210);
		} catch (Exception ex) {
			System.out.println("Saldo insuficiente: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}
}
