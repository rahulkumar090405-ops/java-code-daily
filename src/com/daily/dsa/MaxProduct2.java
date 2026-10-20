package com.daily.dsa;

public class MaxProduct2 {
	
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {3,4,5,2};
		
		// index 1 val 4 and index pick 2 val = 5 (4)*(3)
		
		// set 2 integer max and secmax to -1;
		int max = -1; int secmax = -1;
		
		// run foreach loop over the array element
		for(int element:arr)
		{
			if(element >= max)
			{
				secmax=  max;
				max = element;
			}
			else if(element >= secmax)
			{
				secmax = element;
			}
		}
		
		System.out.println("Ans: "+(max-1) * (secmax-1));
	}
	
	
	
	
}
