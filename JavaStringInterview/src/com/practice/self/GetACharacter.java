package com.practice.self;

import java.util.Scanner;

public class GetACharacter {
		public static void main(String[] args) {
			System.out.println("Enter the sentence : ");
			System.out.println("Enter the index : ");
			System.out.println("Enter the character : ");
			Scanner sc = new Scanner(System.in);
			
			String str = sc.nextLine();
			
			
			int index = sc.nextInt();
			
			char ch = sc.next().charAt(0);
			StringBuilder strn = new StringBuilder(str);
			strn.setCharAt(index, ch);
			System.out.println(strn);
			
		}
	}



	
