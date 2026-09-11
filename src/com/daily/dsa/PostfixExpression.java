package com.daily.dsa;

import java.util.Stack;

public class PostfixExpression {

	public static void main(String [] args)
	{
			String exp = "2 3 1 * + 9 -";
			
			// for the solve post prefix make stack
			Stack<Integer> stack = new Stack<>();
			
			String[] arr = exp.split(" ");
			
			// then run a for loop 
			for(String str:arr)
			{
				if(str.equals("+") || str.equals("-") || str.equals("*"))
				{
					int a = stack.pop();
					int b = stack.pop();
					
					if(str.equals("+"))
					{
						stack.push(a+b);
					}
					else if(str.equals("-"))
					{
						stack.push(b-a);
					}
					else
					{
						stack.push(a*b);
					}
				}
				else
				{
					stack.push(Integer.parseInt(str));
				}
			}
			
			System.out.println("Result :"+stack.pop());
	}
}
