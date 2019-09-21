package com.cg.eis.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {
	
	public boolean addEmployee(Employee employee);
	
	public String findInsuranceScheme(BigDecimal employeeSalary, String employeeDesignation);
	
	public void showEmployee(BigInteger employeeId);

}
