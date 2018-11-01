package lab4_6_1;

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
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
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
		System.out.println("Does Person equals PersonWithJob : "+p.equals(p1));
		System.out.println("Does PersonWithJob equals Person : "+p1.equals(p));
		System.out.println("Does PersonWithJob equals PersonWithJob : "+p1.equals(p1));
		System.out.println("Does Person equals Persons : "+p.equals(p));
		
	}

}
