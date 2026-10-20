package com.daily.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountFrequencyEachCharacter {

	public static void main(String[] args)
	{
		String str = "banana";

		// With HashMap

		countWithHashmap(str);

		// Without HashMap
		
		countWithoutHashmap(str);


	}

	private static void countWithoutHashmap(String str) {

		// 
		
		int[] count = new int[26];
		
		for(char ch:str.toCharArray())
		{
			count[ch - 'a']++;
		}
		
		// 
		for(int i = 0; i <26;i++)
		{
			if(count[i] >0)
			{
				System.out.println((char) ('a' + i)+" = "+count[i]);
			}
		}
		
	}

	private static void countWithHashmap(String str) {
		Map<Character,Integer> frequency = new HashMap<>();

		// put 
		for(char ch:str.toCharArray())
		{
			frequency.put(ch, frequency.getOrDefault(ch, 0)+1);
		}

		for(Entry<Character, Integer>  entry: frequency.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
