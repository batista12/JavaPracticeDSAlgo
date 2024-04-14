package com.practice.self;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringStack {
	public static void main(String[] args)
	{
		Stack<Character> st = new Stack<Character>();
		
		System.out.println("Enter the string : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();String answer = "";
		
		
		for(char c: ch)
			st.add(c);
		
		while(!st.empty())
		{
			answer+=st.pop();
		}
		
		System.out.println(answer);
		
	}
}
