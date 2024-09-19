package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditues;

	public Individual() {
	}

	public Individual(String name, double anualInCome, double healthExpenditues) {
		super(name, anualInCome);
		this.healthExpenditues = healthExpenditues;
	}

	public double getHealthExpenditues() {
		return healthExpenditues;
	}

	public void setHealthExpenditues(double healthExpenditues) {
		this.healthExpenditues = healthExpenditues;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return getAnualIncome() * 0.15 - healthExpenditues * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditues * 0.5;
		}
	}
}
