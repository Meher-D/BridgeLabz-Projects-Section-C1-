package com.bridgelabz.searching;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RegisterUser {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the First Name of the User:- ");
	    String s=scanner.next();
	    if (utility.mobileNumber(s))  
            System.out.println("Valid Name");         
        else 
            System.out.println("Invalid Name"); 
      System.out.println("Enter the LastName of the user:-");
	    String s1=scanner.next();
	    utility.lastName(s1);
	    System.out.println("Enter the Email Address of the user:-");
	   String email=scanner.next();
	   Utility.isValid(email);
	    System.out.println("Enter the Phone Number:-");
	    String s2=scanner.next();
	    if (utility.mobileNumber(s2))  
            System.out.println("Valid Number");         
        else 
            System.out.println("Invalid Number");  
	    System.out.println("Enter Company Name:-");
	    String comp=scanner.next();
	    
	    System.out.println("Enter User Id:-");
	    String uid=scanner.next();
	    System.out.println("Enter Password:-");
	    String Psw=scanner.next();
	    
    } 
	
	    
	}


