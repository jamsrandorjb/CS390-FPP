package lab12_2;

public class Main {

	public static void main(String[] args) throws OverdrawnAccountException {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[1].createNewRetirement(9000);
		
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		for(Employee e : emps){
			AccountList accountList = e.getAccountList();
			for (int i = 0; i < accountList.size(); i++)
				try {
					e.withdraw(i, 20000);
				}
				catch(OverdrawnAccountException ex)
				{
					System.out.println(ex.getMessage());
				}
					/*System.out.println(e + " Withdrawals on " + 
							accountList.get(i).getClass().getSimpleName() + 
							":Withdrawal amount exceeds balance");*/
		}
	}
	
}
