package com.daily.interview;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args)
	{
		String str = "swiss";

		// without nested loop
		approchOne(str);
		System.out.println("----------------------------");
		// with nested loop
		approchTwo(str);
	}

	private static void approchTwo(String str) {

		for(int i = 0; i<= str.length();i++)
		{
			boolean repeted = false;
			for(int j = 0; j <= str.length();j++)
			{
				if(i != j && str.charAt(i) == str.charAt(j))
				{
					repeted = true;
					
					break;
				}
			}
			
			if(!repeted)
			{
				System.out.println(str.charAt(i));
				return;
			}
		}
	}

	private static void approchOne(String str) {
		Map<Character,Integer> map = new HashMap<>();

		//   Count the frequency of each character.

		for(char ch :str.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}

		for(Map.Entry<Character, Integer> entry :map.entrySet())
		{
			if(entry.getValue()  == 1)
			{
				System.out.println(entry.getKey());
			}
		}
	}
}
