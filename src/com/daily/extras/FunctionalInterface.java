package com.daily.extras;

public class FunctionalInterface {
	
	public static void main(String[] args)
	{
		Calculator addition = (a,b) -> a +b;
		
		System.out.println(addition.calculate(10, 20));
	}
	
}
