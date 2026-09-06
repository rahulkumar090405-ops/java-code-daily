package com.daily.streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertStringIntoMapWithLength {

	// Coding: Compute the sum and average of a list of numbers using Streams.

	public static void main(String[] args)
	{	
		List<String> words = List.of("cat","loin","tiger","elephent");

		Map<String,Integer> lengths = words.stream().collect(Collectors.toMap(w->w, String::length));

		System.out.println("Result: "+lengths);
	}

}
