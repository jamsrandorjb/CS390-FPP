package lab4_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class Employee implements Comparable {
	private String name;
	private int salary;
	private Date hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
		hireDate = cal.getTime();
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		Date returnVal = (Date) hireDate.clone();
		return returnVal;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Employee e1 = (Employee)o;
		int temp = 0;
		
		temp = this.name.compareTo(e1.name);
		if(temp != 0 ) return temp;
		
		temp = Integer.compare(this.getSalary(), e1.getSalary());
		if(temp != 0 ) return temp;
		
		return this.getHireDate().compareTo(e1.getHireDate());
	}
	@Override
	public String toString() {
		DateFormat df = new SimpleDateFormat("MM/dd/YY");
		return "name:"+this.getName()+" salary:"+this.getSalary()+" date:"
				+df.format(this.getHireDate());
	}

}
