package com.daily.dsa;

public class SearchTarget {
	
	public static void main(String[] args)
	{
		int[] arr = {1,3,5,7,13};
		
		int target = searchTarget(arr.length,arr,7);
		
		System.out.println("Target Index: "+target);
	}
	
	static int searchTarget(int n, int[] arr, int target)
	{
		int left = 0,right=n-1;
		
		// run loop to the arr lenth n 
		while(left <= right)
		{
			int mid = (left+right)/2;
			
			if(arr[mid] == target  )
			{
				return mid;
			}
			else if(arr[mid] <target)
			{
				left =mid+1;
			}
			else
			{
				right = mid-1;
			}
			
		}
		
		return target;
	}
	
}
