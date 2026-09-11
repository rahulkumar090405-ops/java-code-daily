package com.daily.dsa;

import java.util.Scanner;

public class PyramidPrinting {
	
	public static void main(String[] args)
	{
		   Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        
	        for(int row = 1;row<=n;row++)
	        {
	        	// print spaces
	        	
	        	for(int space = 1;space<n-row;space++)
	        	{
	        		System.out.print(" ");
	        	}
	        	
	        	// print *
	        	
	        	for(int starts = 1;starts< 2* row - 1;starts++)
	        	{
	        		System.out.print("*");
	        	}
	        	
	        	System.out.println();
	        	
	        }
	        
	        
	}

	
}
