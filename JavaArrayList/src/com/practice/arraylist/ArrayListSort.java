package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args)
	{
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(31);
		arr.add(45);
		arr.add(93);
		arr.add(-23);
		
		//sorting the arraylist
		
		Collections.sort(arr, Collections.reverseOrder());
		
		System.out.println(arr);
		
	}
}
