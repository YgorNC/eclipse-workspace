
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(120 , 1337);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente ygor = new Cliente();
		ygor.setNome("Ygor Cortês");
		conta.setTitular(ygor);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// Agora em 2 linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(ygor);
		System.out.println(conta.getTitular());
	}
}
