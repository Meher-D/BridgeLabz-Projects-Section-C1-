package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		
	   int arr[] = {24,11,43,12,10,9}; 
	        utility.bubbleSort( arr); 
	        System.out.println("Sorted array"); 
	        utility.printArray(arr); 

	}

}
