package employeeinfo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;


public class Employee {
	
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	public static final String DATE_PATTERN = "MM/dd/yyyy";

	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) 
	{
		this.name = name;
		hireDate = LocalDate.of(yearOfHire,monthOfHire,dayOfHire);//LocalDate.parse((monthOfHire-1)+"/"+dayOfHire+"/"+yearOfHire, 
	}

	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}
	

	public void deposit(AccountType acctType, double amt) {
		switch(acctType) {
			case CHECKING :
				this.checkingAcct.makeDeposit(amt);
				break;
			case RETIREMENT :
				this.retirementAcct.makeDeposit(amt);
				break;
			case SAVINGS :
				this.savingsAcct.makeDeposit(amt);
				break;
			default:
				break;
		}
	}

	public boolean withdraw(AccountType acctType, double amt) {
		boolean ret = false;
		switch(acctType) {
			case CHECKING :
				ret = this.checkingAcct.makeWithdrawal(amt);
				break;
			case RETIREMENT :
				ret = this.retirementAcct.makeWithdrawal(amt);
				break;
			case SAVINGS :
				ret = this.savingsAcct.makeWithdrawal(amt);
				break;
			default:
				break;
		}
		return ret;
	}

	public String getFormattedAcctInfo() {
		String ret = "ACCOUNT INFO FOR "+ this.name +"\n";
		if(this.checkingAcct != null)
		{
			ret += "Account type: "+ this.checkingAcct.getAcctType()+"\n";
			ret += "Current bal: "+ this.checkingAcct.getBalance()+"\n";
		}
		if(this.savingsAcct != null)
		{
			ret += "Account type: "+ this.savingsAcct.getAcctType()+"\n";
			ret += "Current bal: "+ this.savingsAcct.getBalance()+"\n";
		}
		if(this.retirementAcct != null)
		{
			ret += "Account type: "+ this.retirementAcct.getAcctType()+"\n";
			ret += "Current bal: "+ this.retirementAcct.getBalance()+"\n";
		}
		return ret;
	}
}