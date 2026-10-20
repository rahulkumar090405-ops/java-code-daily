package com.daily.interview;

public class FindSecondLargestNo {
	
	public static void main(String[] a)
	{
		int[] arr = {10, 5, 20, 8, 20, 15};
		
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int n:arr)
		{
				if(n >largest)
				{
					second = largest;
					largest = n;
				}
				
				// if number in between largest and second largest
				
				if(n > second && n < largest)
				{
					second = n;
				}
				
		}
		 // Print the answer
        System.out.println(second);
	}
}
