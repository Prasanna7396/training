
public class Current extends Account {
	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, INIT_CUR_BAL);
		this.overdraft=10000;
	}

	@Override
	public void withdraw(double amount) {
		// super.withdraw(amount);

		if (amount <= balance) {
			balance -= amount;
		} 
		else if (amount > balance)
		{
			if ((amount - balance) > OVERDRAFT_AMT)
				System.out.println("isufficient funds");
			
			else 
			{
				overdraft = overdraft - (amount - balance);
				balance = MIN_CUR_BAL;
				System.out.println("overdraft:" + overdraft);
			}
		}
		 else if (amount > (balance + overdraft))
			System.out.println("insufficient funds");
	}

	@Override
	public void deposit(double amount) {
		if(balance<=MIN_CUR_BAL)
		{
			if(overdraft<OVERDRAFT_AMT)
			{
				overdraft=OVERDRAFT_AMT-overdraft;
			    balance=amount-overdraft;
			}
			else
				balance+=amount;
		}
		else if(balance>MIN_CUR_BAL)
			balance+=amount;
	}

}
