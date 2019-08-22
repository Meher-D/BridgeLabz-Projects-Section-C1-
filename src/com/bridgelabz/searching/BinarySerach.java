package com.bridgelabz.searching;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BinarySerach {
	public static void main(String[] args) {

	int x,y,q ;
	Utility utility=new Utility();
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter a number");
    q = scanner.nextInt();
    y= (int) Math.pow(2, q);
    int arr[]=new int[y];
    int n = arr.length; 
    
    for(int i=0;i<y;i++)
    {
    	arr[i]=i;
    }
    
    System.out.println("Enter a number between 0 & " +(y-1));
    x=scanner.nextInt();
	
	int result = Utility.binarySearch(arr, 0, n - 1, x); 
    if (result == -1) 
        System.out.println("Element not present"); 
    else
        System.out.println("Element found at index " + result); 
    scanner.close();
	

}

}

	
	


