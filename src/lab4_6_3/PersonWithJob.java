package lab4_6_3;

import java.util.GregorianCalendar;

public class PersonWithJob{
	private double salary;
	Person p;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		p = new Person(name, dob);
		this.salary = salary;
	}
	public boolean equals(Object o) {
		if(o == null) return false;
		if(!(o instanceof PersonWithJob)) return false;
		PersonWithJob pq = (PersonWithJob) o;
		if(!pq.p.equals(this.p) || pq.getSalary() != this.getSalary()) return false; 
		return true;
	}
	public double getSalary() {
		return salary;
	}
}
