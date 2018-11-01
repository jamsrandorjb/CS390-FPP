package lab4_1;

import java.util.Date;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(String name, double salary, Date hireDate, double overtimeHours)
	{
		super(name, salary, hireDate);
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary() + 12 * this.overtimeHours;
	}
	

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	

}
