package lab4_6_2;

import java.util.GregorianCalendar;

final class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	// alternative equals method in the PersonWithJob class
	@Override
	public boolean equals(Object withJob) {
		if (withJob == null)
			return false;
		if (withJob.getClass() != this.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) withJob;
		boolean isEqual = getName().equals(p.getName()) && this.salary == p.salary && p.getDateOfBirth().equals(this.getDateOfBirth());
		return isEqual;
	}
}
