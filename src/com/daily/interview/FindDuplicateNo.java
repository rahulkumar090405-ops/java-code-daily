package com.daily.interview;

public class FindDuplicateNo {
	
	public static void main(String[] a)
	{
		int[] arr = {1, 2, 3, 2, 4, 5, 1};
		
		// pick no at a time
		for(int i = 0;i <arr.length;i++)
		{
			// 
			for(int j = i+1;j <arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]);
					
					// stop no checking
					break;
				}
			}
		}
	}
}
