package com.daily.interview;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String[] rgs)
	{
		String str1 = "listen";
		String str2 = "silent";
		
		if(str1.length() != str2.length())
		{
			System.out.println(false);
			
			return;
		}
		
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		System.out.println(Arrays.equals(a, a));
	}
	
}
