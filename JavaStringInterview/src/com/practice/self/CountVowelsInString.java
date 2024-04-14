package com.practice.self;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
	
	System.out.println("Enter the desired string: ");
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	char[] CharArray = str.toCharArray();
	int count =0;
	
	for(char c: CharArray) {
		if(c == 'a' || c == 'e' || c== 'i' || c== 'o' || c=='u')
			count++;
		
	}
	System.out.println(count);
	}
}
