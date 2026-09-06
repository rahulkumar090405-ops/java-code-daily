package com.daily.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupinByStringIntoMapWithLength {

	// Coding: Compute the sum and average of a list of numbers using Streams.

	public static void main(String[] args)
	{	
		List<String> words = List.of("cat","loin","tiger","elephent","dog","owl","bear");

		Map<Integer,List<String>> lengths = words.stream().collect(Collectors.groupingBy(String::length));

		System.out.println("Result: "+lengths);
		
		
	}

}
