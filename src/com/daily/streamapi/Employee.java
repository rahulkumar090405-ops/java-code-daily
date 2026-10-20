package com.daily.streamapi;

public class Employee
{
	private Integer empId;
	private String empName;
	private Integer salary;
	private Integer age;
	private String department;

	// constructor
	public Employee(Integer empId,String empName,Integer salary,Integer age,String department)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.department = department;
	}

	// getter 
	public Integer getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public Integer getSalary()
	{
		return salary;
	}
	public Integer getAge()
	{
		return age;
	}
	// setter
	public void setEmpId(Integer empId)
	{
		this.empId = empId;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public void setSalary(Integer salary)
	{
		this.salary = salary;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	
	// Print employee details
    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}