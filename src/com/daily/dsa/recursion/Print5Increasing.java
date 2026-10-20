package com.daily.dsa.recursion;

public class Print5Increasing {
	
	static void rec(int n)
	{
		if(n>5)
			return;
		System.out.println(n);
		rec(n+1);
	}
	
	public static void main(String[] args)
	{
		rec(1);
	}
}
