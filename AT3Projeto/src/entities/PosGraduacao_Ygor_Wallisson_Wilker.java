package entities;

public class PosGraduacao_Ygor_Wallisson_Wilker extends Pessoas {

	private String cursoPosGraduacao;

	public PosGraduacao_Ygor_Wallisson_Wilker() {
	}

	public PosGraduacao_Ygor_Wallisson_Wilker(String nome, String cpf, int matricula, String cursoPosGraduacao) {
		super(nome, cpf, matricula);
		this.cursoPosGraduacao = cursoPosGraduacao;
	}

	public String getCursoPosGraduacao() {
		return cursoPosGraduacao;
	}

	public void setCursoPosGraduacao(String cursoPosGraduacao) {
		this.cursoPosGraduacao = cursoPosGraduacao;
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nMatrícula: " + getMatricula() + "\nPós Graduação: "
				+ cursoPosGraduacao;
	}
}
