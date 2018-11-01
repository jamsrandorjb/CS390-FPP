package lab11_1;

import java.util.HashMap;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	@SuppressWarnings("rawtypes")
	private HashMap salaryRecord;
	
	@SuppressWarnings("rawtypes")
	public Employee() {
		salaryRecord = new HashMap();
	}
	@SuppressWarnings("unchecked")
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		if(salaryRecord.get(date)!=null)
			System.out.println(getFirstName()+" "+getLastName()+" was paid "+salaryRecord.get(date)+" on "+date);
		else
			System.out.println(getFirstName()+" "+getLastName()+" did not receive a paychek on on "+date);
	}
	@SuppressWarnings("unchecked")
	public void printAveragePaycheck() {
		//implement
		double sum = 0;
        for(Object key: salaryRecord.values())
        		sum += (double) key;
		System.out.println("Average paycheck for Jim Jones was "+sum/salaryRecord.size());
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
