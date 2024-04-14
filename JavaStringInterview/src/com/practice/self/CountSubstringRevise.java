package com.practice.self;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringRevise {
	public static void main(String[] args) {
		System.out.println("Enter the string : ");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("Enter the substring : ");
		
		String substr = sc.nextLine();int count =0;
		
		Pattern c = Pattern.compile(substr);
		 
        Matcher m = c.matcher(str);
		
		while(m.find())
			count++;
		
		System.out.println(count);
		
		
		
		
	}
}



