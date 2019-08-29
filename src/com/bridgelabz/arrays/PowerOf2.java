package com.bridgelabz.arrays;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the Number:-");
     int n= scanner.nextInt();
     int  power=(int) Math.pow(2,n);
     System.out.println("2^"+n+"="+power);
     int unit=power;
     int tens=power;
     int hundreads=power;
     int mat[][]=new int[2][2];
     while(10<unit)
     {
    	 unit=unit/10;
     }
     while(100<tens)
     {
    	 tens=tens/10;
     }
     while(1000<hundreads)
     {
    	 hundreads =hundreads/10;
     }
     System.out.println("Unit of power:-"+unit);
     System.out.println("Tens of power:-"+tens);
     System.out.println("Hundreads of power:-"+hundreads);
	}

}
