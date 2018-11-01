package employeeinfo;


public class Account {
	
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
		setBalance(deposit);
	}
	
	public boolean makeWithdrawal(double amount) {
		if(amount>this.balance)
			return false;
		setBalance(amount);
		return true;
	}
	
	
	public double getBalance() {
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
