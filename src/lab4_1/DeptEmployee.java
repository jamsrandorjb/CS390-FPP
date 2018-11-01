package lab4_1;

import java.util.Date;

public class DeptEmployee {
	
	private String _name;
	private double _salary;
	private Date _hireDate;
	
	
	public DeptEmployee(String name, double salary, Date hireDate) {
		this._hireDate = hireDate;
		this._salary = salary;
		this._name = name;
	}
	
	
	public double computeSalary() {
		return _salary;
	}
	
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public Date get_hireDate() {
		return _hireDate;
	}
	public void set_hireDate(Date _hireDate) {
		this._hireDate = _hireDate;
	}
}
