package lab4_6_2;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar) dateOfBirth.clone();
	}


	// alternative equals method in the Person class
	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson.getClass() != this.getClass())
			return false;
		Person p = (Person) aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}

	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar birthDate = new GregorianCalendar();
		Person p = new Person("Test", birthDate);
		PersonWithJob p1 = new PersonWithJob("Test", birthDate, 100000.00);
		System.out.println("Does Person equals PersonWithJob : " + p.equals(p1));
		System.out.println("Does PersonWithJob equals Person : " + p1.equals(p));
		System.out.println("Does PersonWithJob equals PersonWithJob : " + p1.equals(p1));
		System.out.println("Does Person equals Persons : " + p.equals(p));
	}

}
