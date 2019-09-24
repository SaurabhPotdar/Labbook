package com.cg.spring.lab;

public class Employee {
	
	int employeeId;
	String employeeName;
	double employeeSalary;
	String bussinessUnit;
	int employeeAge;
	private SBU sbu;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getBussinessUnit() {
		return bussinessUnit;
	}
	public void setBussinessUnit(String bussinessUnit) {
		this.bussinessUnit = bussinessUnit;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", bussinessUnit=" + bussinessUnit + ", employeeAge=" + employeeAge + ", sbu=" + sbu
				+ "]";
	}
	
	
	public Employee(int employeeId, String employeeName, double employeeSalary, String bussinessUnit, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.bussinessUnit = bussinessUnit;
		this.employeeAge = employeeAge;
	}
	public Employee(int employeeId, String employeeName, double employeeSalary, String bussinessUnit, int employeeAge,
			SBU sbu) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.bussinessUnit = bussinessUnit;
		this.employeeAge = employeeAge;
		this.sbu = sbu;
	}
	public Employee() {
		super();
	}
	
	

}
