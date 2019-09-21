package com.cg.eis.bean;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {

	private BigInteger employeeId;
	private String employeeName;
	private BigDecimal salary;
	private String employeeDesignation;
	private String insuranceScheme;
	
	public Employee(BigInteger employeeId, String employeeName,
			BigDecimal salary, String employeeDesignation,
			String insuranceScheme) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.employeeDesignation = employeeDesignation;
		this.insuranceScheme = insuranceScheme;
	}
	public Employee() {
		super();
	}
	public BigInteger getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(BigInteger employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((employeeDesignation == null) ? 0 : employeeDesignation
						.hashCode());
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result
				+ ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result
				+ ((insuranceScheme == null) ? 0 : insuranceScheme.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeDesignation == null) {
			if (other.employeeDesignation != null)
				return false;
		} else if (!employeeDesignation.equals(other.employeeDesignation))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (insuranceScheme == null) {
			if (other.insuranceScheme != null)
				return false;
		} else if (!insuranceScheme.equals(other.insuranceScheme))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary
				+ ", employeeDesignation=" + employeeDesignation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
	
}
