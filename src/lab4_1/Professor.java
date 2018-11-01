package lab4_1;

import java.util.Date;

public class Professor extends DeptEmployee {
	private int _numberOfPublications;
	
	public Professor(String name, double salary, Date hireDate, int numberOfPublications)
	{
		super(name, salary, hireDate);
		this._numberOfPublications = numberOfPublications;
	}
	
	public int getNumberOfPublications() {
		return _numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this._numberOfPublications = numberOfPublications;
	}
	
}
