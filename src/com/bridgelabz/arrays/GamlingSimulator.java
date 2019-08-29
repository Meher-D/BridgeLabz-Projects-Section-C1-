package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulator {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the stake Number if you want:-");
int s=scanner.nextInt();
System.out.println("Enter the goal:-");
int g=scanner.nextInt();
System.out.println("Enter the trails:-");
int t=scanner.nextInt();
utility.Gamming( s, g,t);
		scanner.close();
	}

}
