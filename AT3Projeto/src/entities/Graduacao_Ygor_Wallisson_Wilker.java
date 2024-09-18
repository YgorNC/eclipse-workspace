package entities;

public class Graduacao_Ygor_Wallisson_Wilker extends Pessoas {

	private String cursoGraduacao;

	public Graduacao_Ygor_Wallisson_Wilker() {
	}

	public Graduacao_Ygor_Wallisson_Wilker(String nome, String cpf, int matricula, String cursoGraduacao) {
		super(nome, cpf, matricula);
		this.cursoGraduacao = cursoGraduacao;
	}

	public String getCursoGraduacao() {
		return cursoGraduacao;
	}

	public void setCursoGraduacao(String cursoGraduacao) {
		this.cursoGraduacao = cursoGraduacao;
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nMatrícula: " + getMatricula() + "\nGraduação: "
				+ cursoGraduacao;
	}
}
