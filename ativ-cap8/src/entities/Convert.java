package entities;

public class Convert {

	public double priceDollar;
	public double bought;
	public double percent = 6;
	
	public double currencyConverter() {
		return (bought * priceDollar) + (bought * priceDollar * percent / 100);
	}
	
	public String toString() {
		return "Amount to be paid in reais R$ " + String.format("%.2f", currencyConverter());
	}
}
