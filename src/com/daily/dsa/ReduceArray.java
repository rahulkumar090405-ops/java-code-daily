package com.daily.dsa;

import java.util.Collections;
import java.util.PriorityQueue;

public class ReduceArray {
	
	public static void main(String[] args)
	{
		int[] arr = {2,1,11,11,7};
		
		int result = reduceArray(arr.length,arr);
		System.out.println("Result: "+result);
	}
	// USE DS Heap Or Priority Queue
	public static int reduceArray(int n, int arr[])
	{
		// create empty PR 
		PriorityQueue<Integer> queue =  new PriorityQueue<Integer>(Collections.reverseOrder());
		
		// run loop at the all array value
		for(int val:arr)
		{
			queue.add(val);
		}
		
		while(queue.size()>1)
		{
			// pop max value from pq
			int max = queue.remove();
			
			int secondmax = queue.remove();
			
			queue.add(max-secondmax);
		}
		
		if(queue.size() == 1)
		{
			return queue.peek();
		}
		else
		{
			return 0;
		}
	}
}
