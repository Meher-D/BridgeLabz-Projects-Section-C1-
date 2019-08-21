package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		 int arr[]= {6,23,1,10,17,22};
		 utility.sort(arr);
		 System.out.print("Sorted Array:- ");
		 utility.printArray1(arr);
          
	}

}
