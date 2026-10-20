package com.daily.string;

public class FirstNonRepeatedCharacter {


	public static void main(String[] args)
	{
		String s = "swiss";

		System.out.println("First Unique Char:  "+ firstNonRepeated(s));
	}

	static String firstNonRepeated(String str) {
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(str.indexOf(ch) == str.lastIndexOf(ch))
			{
				return String.valueOf(ch);
			}
		}
		
		return "_";
	}
}	
