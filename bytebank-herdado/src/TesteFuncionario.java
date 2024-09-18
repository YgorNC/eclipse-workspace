
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario ygor = new Gerente();
		ygor.setNome("Ygor Cortês");
		ygor.setCpf("066.000.000-14");
		ygor.setSalario(18000.00);
		
		System.out.println(ygor.getNome());
		System.out.println(ygor.getBonificacao());
		
	}
}
