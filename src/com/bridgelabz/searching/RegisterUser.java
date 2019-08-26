package com.bridgelabz.searching;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RegisterUser {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		//FirstName
		System.out.println("Enter the First Name:- ");
		String firstName=scanner.next();
		Pattern pattern = Pattern.compile("[A-Z][a-z]+");
		Matcher matcher = pattern.matcher(firstName);
		String st2=new String("Your First Name is: <<firstName>>");
		if (matcher.matches()) 
		{
			st2=st2.replaceAll("<<firstName>>",firstName);
		    System.out.println(st2);
		}
		else
		{
		    	  System.out.println("Your name Should be only letters");
		}	
		//LastName
		System.out.println("Enter Last name: ");
		String lastName=scanner.next();
		Pattern pattern1 = Pattern.compile("[A-Z][a-z]+");
		Matcher matcher1 = pattern.matcher(lastName);
		String st=new String("Your Last Name is: <<LastName>>");
		if (matcher.matches()) 
		{
			st=st.replaceAll("<<LastName>>",lastName);
			System.out.println(st);
		 
	    }
		
		//Email
		System.out.println("Enter the Email :-");
		String eMail=scanner.next();
		Pattern pattern2 = Pattern.compile("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
		Matcher matcher2 = pattern.matcher(eMail);
		String st1=new String("Your Email Address is: <<Email>>");
		if (matcher.matches()) 
		{
			st1=st1.replaceAll("<<Email>>",eMail);
			System.out.println(st1);
		 
	    }
		else
		{
		    	  System.out.println("Please Enter correct Email Address..");
		}
		
		//PhoneNumber
		System.out.println("Enter Phone Number:- ");
		String phNuumber=scanner.next();
		if (utility.isValid(phNuumber))  
            System.out.println("Valid Number");         
        else 
            System.out.println("Invalid Number");       
		
		//Company Name
		System.out.println("Enter the Company Name:-");
		String company=scanner.next();
		System.out.println("Company Name are :-"+company);
   
	//User

		System.out.println("Enter User Id:- ");
		String uId=scanner.next();
		Pattern pattern4 = Pattern.compile("^[a-z0-9_-]{6,14}$");
		Matcher matcher4 = pattern.matcher(uId);
		String st5=new String("Your User Id is: <<uId>>");
		if (matcher.matches()) 
		{
			st5=st5.replaceAll("<<uId>>",uId);
		    System.out.println(st5);
		}
		else
		{
		    	  System.out.println("Please Ensure you entered user id is correct");
		}	
		
		
		System.out.println("Enter Password:- ");
		String pass=scanner.next();
		Pattern pattern5 = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
		Matcher matcher5 = pattern.matcher(uId);
		String st6=new String("Your password is is: <<pass>>");
		if (matcher.matches()) 
		{
			st6=st6.replaceAll("<<pass>>",pass);
		    System.out.println(st6);
		}
		else
		{
		    	  System.out.println("Enter correct password");
		}	
	
		
		System.out.println("Thank You ..........!");
	}
	}

