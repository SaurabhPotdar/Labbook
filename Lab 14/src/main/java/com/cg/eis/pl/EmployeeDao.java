/**
 * 
 */
package com.cg.eis.pl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.cg.eis.bean.Employee;

/**
 * @author admin1
 *
 */
public class EmployeeDao implements IEmployeeDao {
	
	List<Employee> employeeList = new ArrayList<Employee>();

	/* (non-Javadoc)
	 * @see com.cg.eis.pl.IEmployeeDao#addEmployee(com.cg.eis.bean.Employee)
	 */
	public boolean addEmployee(Employee employee) {
		employeeList.add(employee);
		return false;
	}

	/* (non-Javadoc)
	 * @see com.cg.eis.pl.IEmployeeDao#findInsuranceScheme(java.math.BigDecimal, java.lang.String)
	 */
	public String findInsuranceScheme(BigDecimal employeeSalary,
			String employeeDesignation) {
		//int compareSalary = employeeSalary.compareTo(BigDecimal.valueOf())
		//if(employeeDesignation.equals("Syetem Associate") && (BigDecimal.valueOf(employeeSalary)>5000))
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cg.eis.pl.IEmployeeDao#showEmployee(java.math.BigInteger)
	 */
	public void showEmployee(BigInteger employeeId) {
		// TODO Auto-generated method stub

	}

}
