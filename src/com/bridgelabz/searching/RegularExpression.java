package com.bridgelabz.searching;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {

	
		Scanner s = new Scanner(System.in);
		String st = new String("Hello <<UserName>>, How are you?");
		System.out.println("Enter username");
		String name = s.nextLine();
		st = st.replaceAll("<<UserName>>", name);
		System.out.println(st);
		
		
		String st1=new String("Hello <<fullName>>");
		System.out.println("Enter full name: ");
		String s1=s.nextLine();
		st1=st1.replaceAll("<<fullName>>",s1);
		System.out.println(st1);   
		
	
		System.out.println("Enter mobile number: ");
		String sPhoneNumber=s.nextLine();
		Pattern pattern = Pattern.compile("\\d{2}-\\d{10}");
		Matcher matcher = pattern.matcher(sPhoneNumber);
		String st2=new String("Your <<mobileNumber>>");
		if (matcher.matches()) 
		{
			
			st2=st2.replaceAll("<<mobileNumber>>",sPhoneNumber);
		    	  System.out.println(st2);
		      }
		      else
		      {
		    	  System.out.println("Phone Number must be in the form XX-XXXXXXXXXX");
		      }
		
		
	
		String st3=new String("Date is:");
		System.out.println("Enter : ");
		String s3=s.nextLine();
		st3=st3.replaceAll("<<yourDate>>",s3);
		System.out.println(st3);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
		String date = sdf.format(new Date(0));
		System.out.println(date); 
		System.out.println("\n\nSuccessfully Modified");
		s.close();
	}
	}


