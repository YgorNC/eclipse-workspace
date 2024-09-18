
public class TestaBank {

	public static void main(String[] args) {
		Cliente ygor = new Cliente();
		ygor.nome = "Ygor Neres Cortês";
		ygor.cpf = "066.000.000-14";
		ygor.profissao = "Apoio Administrativo";
		
		Conta contaDoYgor = new Conta();
		contaDoYgor.deposita(1500);
		System.out.println(contaDoYgor.getSaldo());
		
		contaDoYgor.titular = ygor;
		System.out.println(contaDoYgor.titular.nome);
	}
}
