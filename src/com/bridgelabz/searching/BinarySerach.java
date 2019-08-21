package com.bridgelabz.searching;

import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number:-");
	int n=scanner.nextInt();
	int p=2,result=1;
	if(n>=0&&p==0)
	{
	  result=1;
	 }
	else if(n==0&&p>=1)
	{
		result=0;
	}
	 else
     {
         for(int i=1;i<=p;i++)
	 {
            result=result*n;
 	 }	    
     }
    System.out.println(n+"^"+p+"="+result);
	
  }
	}


