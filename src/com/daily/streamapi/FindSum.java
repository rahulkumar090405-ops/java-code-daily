package com.daily.streamapi;

import java.util.Arrays;
import java.util.List;

public class FindSum {
	
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(3,5,6,6,7);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum :"+sum);
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);
		System.out.println("Sum :"+sum+" & Avg :"+avg);
	}
}
