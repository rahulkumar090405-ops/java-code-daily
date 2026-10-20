package com.daily.streamapi;

import java.util.*;

public class HighestSalary {

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

		// 1. Highest salary employee

		Employee highestSalary = map.values().stream().max(Comparator.comparingInt(Employee::getSalary)).orElse(null);
		System.out.println("Highest salary: " + highestSalary.getSalary());

		// 2. Second-highest distinct salary employee
		
		Optional<Object> secondHighest = 
										// Step 1: Extract only salaries using map()
										map.values().stream()
										
										// Step 2: Sort employees by salary in descending order
								        // Highest salary comes first
										.sorted(Comparator.comparing(Employee::getSalary).reversed())
									   
										 // Step 3: Extract only the salary from each Employee
										.map(e -> e.getSalary())
									 
										 // Step 4: Remove duplicate salaries
								        // Example: 95000, 95000 becomes 95000
									   .distinct()
									   
									// Step 5: Skip the highest distinct salary
									   .skip(1)
									   
									   // Step 6: Get the second-highest distinct salary
									   .findFirst()
									   
									   // Step 7: Find the Employee whose salary matches
									   .map(salary -> map.values().stream()
											   
											   // Filter employees having this salary
											   .filter(e -> e.getSalary().equals(salary))
											   
											   // Get the first matching Employee
											   .findFirst()
											   
											   // Return the Employee from Optional
											   .get());
		
		secondHighest.ifPresent(System.out::println);
	}
}
