package com.daily.string;

public class CapitaliseFirstLetter {

	public static void main(String[] args)
	{
		String str = "hello rahul to the dsa world";

		// first convert string to arr to perform logic
		char[] arr = str.toCharArray();
		
		if(isLowerCase(arr[0]))
		{
			arr[0] = toUpperCase(arr[0]);
		}
		
		// run loop start from 1 to length of string
		for(int i=1;i<arr.length;i++)
		{
			if(isLowerCase(arr[i]) && (i == 0 || arr[i-1] == ' '))
			{
				arr[i] = toUpperCase(arr[i]);
			}
		}
		
		System.out.println("Result :"+new String(arr));


	}

	static boolean isLowerCase(char ch)
	{
		return (ch>='a' && ch <= 'z');
	}
	
	static char toUpperCase(char ch)
	{
		return (char)(ch-32);
	}



}
