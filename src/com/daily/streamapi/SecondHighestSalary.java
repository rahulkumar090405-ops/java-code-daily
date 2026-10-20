package com.daily.streamapi;

import java.util.*;

public class SecondHighestSalary {

	public static void main(String[] args)
	{
		Employee emp1 = new Employee(1, "Ajay", 15000, 24,"Sales");
		Employee emp2 = new Employee(1, "Puja", 18000, 21,"HR");
		Employee emp3 = new Employee(1, "Arjun", 28000, 22,"Tech");
		Employee emp4 = new Employee(1, "Priyanka", 25000, 28,"IT");
		Map<Integer,Employee> map = new HashMap<>();

		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp3);
		map.put(4, emp4);
		
		Optional<Employee> highestSalary = map.values().stream()
										   .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
										   
										   .map(e ->e.getSalary())
										   
										   .distinct()
										   
										   .skip(1)
										   
										   .findFirst()
										   
										   .map(salary -> map.values().stream()
												   .filter(e ->e.getSalary().equals(salary))
										   			.findFirst()
										   			.get());

		System.out.println(highestSalary);
	}
}
