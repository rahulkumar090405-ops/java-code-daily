package com.daily.dsa;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class DuplicatePattern {


	public static void main(String[] args)
	{
		int[] arr = {1,2,3,3,4,4,5,5,2};

//		RemoveDuplicate1(arr);
		RemoveDuplicate2(arr);
		//RemoveDuplicate3(arr);
		//FindDuplicates(arr);
	}

	// Remove duplicates from a sorted arrayNo Set, in-place

	static void RemoveDuplicate1(int arr[])
	{
		// we solve by 2 pointer array
		int j = 0;	

		for(int i =1;i<arr.length;i++)
		{
			if(arr[i] != arr[j])
			{
				j++;
				arr[j] = arr[i];
			}
		}
		System.out.print("Result 1 : {");
		for(int i = 0;i<=j;i++)
		{
			System.out.print(arr[i]);

			if (i < j) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

	// Remove duplicates from a unsorted arrayNo Set, in-place
	static void RemoveDuplicate2(int[] arr)
	{
		// we solve by nested loop

		for(int i = 0;i<arr.length;i++)
		{
			boolean duplicate = false;
			
			for(int j = 0;j<i;j++)
			{
				if(arr[i] == arr[j])
				{
					duplicate = true;
					break;
				}
			}
			
			if(!duplicate)
			{
				System.out.print(arr[i]);
			}
		}
	}


	// Remove duplicate characters from a String --> Set / loop
	
	static void RemoveDuplicate3(int[] arr)
	{
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int n:arr)
		{
			set.add(n);
		}
		System.out.println(set);
	}
	
	// Find Duplicates
	static void FindDuplicates(int[] arr)
	{
		Set<Integer> seen = new HashSet<Integer>();
		
		for(int n:arr)
		{
			if(!seen.add(n))
			{
				System.out.println("Duplicates: "+n);
			}
		}
	}
	
	// Find Not Repeating Number
	static void nonRepeatingNo(int[] arr)
	{
		Set<Integer> unique = new LinkedHashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		// find duplicates first
		for(int n:arr)
		{
			if(!unique.add(n))
			{
				duplicates.add(n);
			}
		}
		
		// now set not repeting no
	}

}
