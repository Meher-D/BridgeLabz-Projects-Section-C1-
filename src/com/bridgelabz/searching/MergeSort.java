package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		int arr[] = {12,29,3,45,10,1,45,3}; 
		  
        System.out.println("Given Array"); 
        utility.printGivenArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        utility.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        utility.printArray(arr); 
    } 
	}


