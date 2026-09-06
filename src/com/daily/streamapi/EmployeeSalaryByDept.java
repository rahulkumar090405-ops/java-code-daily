package com.daily.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSalaryByDept {
	
	// Highest salary in each department
	
	class Employee{
		private String employeeCode;
		private int salary;
		private String department;
		public String getEmployeeCode() {
			return employeeCode;
		}
		public void setEmployeeCode(String employeeCode) {
			this.employeeCode = employeeCode;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	}
	
	List<Employee> employees;
	

//	Map<String,Optional<Employee>> result = employees.stream().
//											collect(Collectors.groupingBy(Employee::getDepartment),
//													Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	
	Map<String, Optional<Employee>> result =
			employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		            Collectors.maxBy(
		                Comparator.comparing(Employee::getSalary)
		            )
		        ));
	
}
