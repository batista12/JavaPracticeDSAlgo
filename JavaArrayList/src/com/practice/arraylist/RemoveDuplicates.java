package com.practice.arraylist;

import java.util.ArrayList;
import java.util.HashSet;


//using .contains
//
//public class RemoveDuplicates {
//	public static void main(String[] args)
//	{
//			ArrayList<Integer> arr = new ArrayList<>();
//			
//			arr.add(35);
//			arr.add(58);
//			arr.add(35);
//			
//			arr.add(48);
//			arr.add(58);
//			
//			ArrayList<Integer> arrnew = new ArrayList<Integer>();
//			
//			for(int i: arr)
//			{
//				if(!arrnew.contains(i))
//				{
//					arrnew.add(i);
//				}
//			}
//			System.out.println(arrnew);
//	}
//}

//using hashset

public class RemoveDuplicates {
	public static void main(String[] args)
	{
			ArrayList<Integer> arr = new ArrayList<>();
			
			arr.add(35);
			arr.add(58);
			arr.add(35);
			
			arr.add(48);
			arr.add(58);
			
			HashSet<Integer> set = new HashSet<Integer>();
			
			set.addAll(arr);
			ArrayList<Integer> arrnew = new ArrayList<>();
			
			arrnew.addAll(set);
			System.out.println(arrnew);
	}
}
