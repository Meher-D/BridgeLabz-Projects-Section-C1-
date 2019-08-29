package com.bridgelabz.arrays;

import com.bridgelabz.utility.Utility;

public class RepeatedNumberTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
     int[] arr=new int[100];
     int repeatedNumber;
     for(int i=0;i<99;i++)
     {
    	 arr[i]=i+1;
     }
     arr[99]=(int) (Math.random() *99+1);
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	repeatedNumber = utility.findRepeateNoArray(arr);
	int[][] rep = new int[1][1];
	rep[0][0] = repeatedNumber;
	System.out.println("Repeated Number is : " + rep[0][0]);
}
}
