package com.bridgelabz.arrays;

import java.util.Random;
import java.util.Scanner;

public class RollDieTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the how many times you want to roll:-");
		int rolls=scanner.nextInt();
		int[] counts=new int[rolls];
		for(int i=0;i<counts.length;i++)
		{
			counts[i]=diceRoll();
	
		}
		 int[] results = counters(counts); 
		 System.out.println("Roll\t Dice Repeated Number"); 
		   for(int i = 0; i < results.length; i++)
		   {
			   System.out.println((i+1)+"\t\t" + (results[i])); 
		   } 
		   scanner.close();
		}
	public static int diceRoll()
	{
	Random random=new Random();
	int dice1=random.nextInt();
	int roll=dice1;
	return roll;
	}
	public static int[] counters(int[] arr)
	{
		int c1=0;
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				c1++;
			else if(arr[i]==2)
				c2++;
			else if(arr[i]==3)
				c3++;
			else if(arr[i]==4)
			c4++;
			else if(arr[i]==5)
				c5++;
			else if(arr[i]==6)
				c6++;
		}
		  int[] rollCounts = new int[] {c1,c2, c3, c4, c5, c6};   
		     return rollCounts;
	}
}
	



