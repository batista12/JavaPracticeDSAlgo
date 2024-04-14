package com.practice.self;

import java.util.Scanner;

public class CharCountofWordsRevise {
	public static void main(String[] args)
	{
			System.out.println("Enter the sentence : ");
			
			Scanner sc = new Scanner(System.in);
	
			String res = sc.nextLine();
			
			char[] ch = res.toCharArray();
			
			for(int i=0; i<ch.length; ++i)
			{
				String str = "";
				
				while(i<ch.length && ch[i]!=' ')
				{
					str += ch[i];
					i++;
				}
				
				if(str.length()>0)
					System.out.println(str + "->" + str.length());
			}
			
			
	}
}
