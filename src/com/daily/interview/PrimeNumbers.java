package com.daily.interview;

public class PrimeNumbers {
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int n :arr)
		{
			boolean isPrime = true;
			
			if(n <= 1)
			{
				isPrime =  false;
			}
			else
			{
				for(int i = 2;i <n; i++)
				{
					if(n % 2 == 0)
					{
						isPrime = false;
						break;
					}
				}
					
			}
			if(isPrime)
			{
				System.out.println(n+" ");
			}
		}
	}
}
