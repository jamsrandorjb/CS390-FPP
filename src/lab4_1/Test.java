package lab4_1;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		double allSal = 0.00;
		Professor p1 = new Professor("Professor1", 100000.00, new Date(), 10);
		Professor p2 = new Professor("Professor2", 100000.00, new Date(), 10);
		Professor p3 = new Professor("Professor3", 100000.00, new Date(), 10);
		Secretary s1 = new Secretary("Professor3", 100000.00, new Date(), 200.00);
		Secretary s2 = new Secretary("Professor3", 100000.00, new Date(), 200.00);
		
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to see the sum of salaries? Y/N");
		String res = sc.nextLine();
		if(!res.equals("Y")) return;
		
		for(int i =0; i < department.length; i++)
			allSal += department[i].computeSalary();
		System.out.println("Department's sum of salary is : "+allSal);
	}
	
}
