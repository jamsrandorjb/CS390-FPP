package lab3_1;

class Account {
	//public final static String CHECKING = "checking";
	//public final static String SAVINGS = "savings";
	//public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	
	private AccountType acctType;

	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {	
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {
		// implement
		setBalance(deposit);
	}
	
	public boolean makeWithdrawal(double amount) {
		// implement
		if(amount>this.balance)
			return false;
		
		setBalance(amount);
		return true;
	}
	
	
	private double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public AccountType getAcctType() {
		return acctType;
	}

	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}
}
