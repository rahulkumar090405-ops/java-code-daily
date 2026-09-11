package com.daily.dsa;

import java.util.Stack;

public class ValidParenthesis {
	
	public static void main(String [] args)
	{
			String str = "(){[]}";
			
			boolean result = true;
			
			// create empty stack first
			Stack<Character> stack = new Stack<>();
			
			for(char ch:str.toCharArray())
			{
				if(ch == '(' || ch == '{' || ch == '[')
				{
					stack.push(ch);
				}
				else
				{
						if(stack.size() == 0)
							result = false;
						
						if( ch == ')' && stack.pop() != '(')
						{
							result = false;
						}
						
						if( ch == '}' && stack.pop() != '{')
						{
							result = false;
						}
						
						if( ch == ']' && stack.pop() != '[')
						{
							result = false;
						}
				}
			}
			
			  if (!stack.isEmpty()) {
				  result = false;
		        }
			
			System.out.println("Result: "+result);
			
			
			
	}
}
