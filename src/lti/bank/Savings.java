package lti.bank;

public class Savings extends Account {
	public Savings() {
	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance - 1000)) {
			balance -= amount;
			txns[idx++] = new Transcation("cr", amount, balance);
		} else
			System.out.println("insufficient funds");
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transcation("cr", amount, balance);
	}

}
