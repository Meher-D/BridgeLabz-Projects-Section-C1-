package com.bridgelabz.arrays;

import java.util.Scanner;

public class CalenderTwoDArray 
{
static int[][] calender = new int[5][7];
static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

public static void initCals()
{
	
for(int i=0;i<calender.length;i++)
{
	for(int j=0;j<calender[i].length;j++)
	{
		calender[i][j]=-10;
	}
	}
}
static void display(int m)
{

	
		System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) 
			{
				if (calender[i][j] < 0 || calender[i][j] > month[m - 1])
				{
					System.out.print("\t ");
				} 
				else if (calender[i][j] > 0) 
				{
					System.out.print("\t" + calender[i][j] + " ");
				}
			}
			System.out.println("\t");
		}
	}


static void putCalender(int d)
{
	int d1=1;
	for(int i=d;i<calender[0].length;i++)
	{
		calender[0][i]=d1++;
	}
	for(int i=1;i<calender.length;i++)
	{
		for(int j=0;j<calender[i].length;j++)
		{
		calender[i][j]=d1++;	
		}
	}
}


static void dispsCalender(int m,int y)
{
int d=dayofWeek(m,y);
initCals();
putCalender(d);
display(m);
}
static int dayofWeek(int m,int y)
{
	int d = 1;
	int y0 = y - (14 - m) / 12;
	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
	int m0 = m + 12 * ((14 - m) / 12) - 2;
	int d0 = (d + x + (31 * m0) / 12) % 7;
	return d0;
	}
public static void main(String[] args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the Month=");
	int m=scanner.nextInt();
	System.out.println("Enter the year=");
	int y=scanner.nextInt();
	dispsCalender(m,y);
	scanner.close();
	
}
}
