package com.practice.self;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the sentence : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();String answer = "";
	
		for(int i=ch.length-1; i>=0; i-- )
		{
			answer+= ch[i];
			
		}
		System.out.println(answer);
		
	}
}



