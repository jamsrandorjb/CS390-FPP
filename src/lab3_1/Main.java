package lab3_1;

public class Main {
	public static void main(String[] args)
	{
		Employee e = new Employee("Jamsrandorj", "Jama", 12000.50, 2017, 11, 10);
		Account aC = new Account(e, AccountType.CHECKING, 300.00);
		Account aS = new Account(e, AccountType.SAVINGS, 300.00);
		Account aR = new Account(e, AccountType.RETIREMENT, 300.00);
		System.out.println(aC.toString());
		System.out.println(aS.toString());
		System.out.println(aR.toString());
		
	}
}
