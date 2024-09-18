package entities;

public class Account {

	private String holder;
	private int accountNum;
	private double balance;
	
	public Account(String name, int accountNum) {
		this.holder = name;
		this.accountNum = accountNum;
	}
	
	public Account(String name, int accountNum, double initialBalance) {
		this.holder = name;
		this.accountNum = accountNum;
		depositBalance(initialBalance);
	}
	
	public void setName(String name) {
		this.holder = name;
	}
	
	public String getName() {
		return holder;
	}
	
	public double getAccountNum() {
		return accountNum;
	}
	
	public void depositBalance(double amount) {
		this.balance += amount;
	}
	
	public void withdrawBalance(double amount) {
		this.balance -= 5 + amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account " +
				accountNum +
				", holder: " +
				holder +
				", balance: $ " +
				String.format("%.2f", getBalance());
	}
	
}
