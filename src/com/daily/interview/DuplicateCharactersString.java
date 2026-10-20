package com.daily.interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersString {
	
	public static void main(String[] args)
	{
		String str = "programming";
		// Array Approach
		usingArrayApproch(str);
		System.out.println("--------------");
		
		// HashMap
		
		// HashSet
		
		usingHashSetApproch(str);
	}

	private static void usingHashSetApproch(String str) {
		
		Set<Character> seen = new HashSet<Character>();
		
		Set<Character> duplicates = new HashSet<>();
		
		for(char ch:str.toCharArray())
		{
			if(!seen.add(ch))
			{
				duplicates.add(ch);
			}
		}
		System.out.println(duplicates);
	}

	private static void usingArrayApproch(String str) {
		
		// create a array for lowercase latters a-z
		
		int[] count = new int[26];
		
		for(char ch:str.toCharArray())
		{
			count[ch - 'a']++;
		}
		
		
		 // Print only duplicate characters
		
		for(int i = 0; i < 26; i++)
		{
			if(count[i] >0)
			{
				// convert array index to back 
				
				char ch = (char) ('a' - i);
				
				System.out.println(ch+ " = "+ count[i]);
			}
		}
	}
}
