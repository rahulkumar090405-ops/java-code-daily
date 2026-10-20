package com.daily.interview;

public class ReverseString {
	
	public static void main(String[] a)
	{
		String str = "Java";
		String rev = "";
		
		for(int i = str.length() - 1; i >= 0 ;i --)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		// done by String Builder 
		
		reverseStringByBuilder("Rahul");
	}

	private static void reverseStringByBuilder(String string) {

		StringBuilder builder =  new StringBuilder();
		
		for(int i = string.length() - 1;i >= 0;i-- )
		{
			builder.append(string.charAt(i));
		}
		
		System.out.println(builder);
	}
}
