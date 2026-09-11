package com.daily.dsa;

import java.util.Scanner;

public class PyramidPrinting2 {
	
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        String[] ans = pyramidPrinting(n);

	        for (int i = 0; i < ans.length; i++) {
	            System.out.println(ans[i]);
	        }
	    }
	 
	 public static String[] pyramidPrinting(int n) {
		 
		 String[] ans = new String[n];
		 
		 for(int row =1;row<=ans.length;row++)
		 {
			 String str = "";
			 
			 for(int star = 1; star<row;star++)
			 {
				 str = str+"*";
			 }
			 
			 ans[row-1] = str;
		 }
		 
		 return ans;
	 }
}
