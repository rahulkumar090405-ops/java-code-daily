package com.daily.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNo {
	
	// Find second 
	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(10,20,30,50,60);
		
		Integer secondHigest = numbers.stream().distinct().sorted(Comparator.reverseOrder())
				               .skip(1).findFirst().orElse(null);
		
		System.out.println("Second Highest: "+secondHigest);
		
	}
}
