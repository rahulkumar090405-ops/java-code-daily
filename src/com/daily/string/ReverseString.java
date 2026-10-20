package com.daily.string;

public class ReverseString {
	
	public static void main(String[] args)
	{
		String str = "rahul";
		String rev = "";
		
		// first init of rev string variable
		
		// i done it by for loop
		
		for(int i = str.length() -1;i >= 0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.print(rev);
	}
}
