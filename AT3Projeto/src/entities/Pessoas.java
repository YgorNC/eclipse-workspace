package entities;

public class Pessoas {

    private String nome;
    private String cpf;
    private int matricula;

    public Pessoas() {
    }

    public Pessoas(String nome, String cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
    	return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nMatrícula: " + getMatricula();
    }
}
