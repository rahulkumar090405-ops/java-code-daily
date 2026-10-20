package com.daily.interview;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String str = "Java Is Easy";
		
		String[] words = str.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(String word :words)
		{
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			
			result.append(reversedWord).append(" ");
		}
		
		System.out.print(result.toString().trim());
	}
}
