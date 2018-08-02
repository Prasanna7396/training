package lti.bank;
public class Transcation {
	private String type;
	private double amount, balance;

	public Transcation() {
	}

	public Transcation(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return type + "\t " + amount + "\t" + balance;
	}

}
