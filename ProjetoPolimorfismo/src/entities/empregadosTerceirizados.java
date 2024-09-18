package entities;

public class empregadosTerceirizados extends Employee {

	private Double despesaAdicional;
	
	public empregadosTerceirizados () {
		super();
	}

	public empregadosTerceirizados(String nome, Integer horasTrab, Double valorHora, Double despesaAdicional) {
		super(nome, horasTrab, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento () {
		return super.pagamento() + despesaAdicional * 1.1;
 	}
}
