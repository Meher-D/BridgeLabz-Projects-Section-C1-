package com.bridgelabz.utility;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

	Scanner scanner =new Scanner(System.in);
	public static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
  
   public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

   
   /*Insertion sort*/
   
   public static void sort(int arr[]) 
   { 
       int n = arr.length; 
       for (int i = 1; i < n; ++i) { 
           int key = arr[i]; 
           int j = i - 1; 
 
           /* Move elements of arr[0..i-1], that are 
              greater than key, to one position ahead 
              of their current position */
           while (j >= 0 && arr[j] > key) { 
               arr[j + 1] = arr[j]; 
               j = j - 1; 
           } 
           arr[j + 1] = key; 
       } 
   } 
 
   /* A utility function to print array of size n*/
public  static void printArray1(int arr[]) 
   { 
       int n = arr.length; 
       for (int i = 0; i < n; ++i) 
           System.out.print(arr[i] + " "); 
 
       System.out.println(); 
   } 
 

/*Merge sort given array*/

public static void merge(int arr[], int l, int m, int r) 
{ 
    // Find sizes of two subarrays to be merged 
    int n1 = m - l + 1; 
    int n2 = r - m; 

    /* Create temp arrays */
    int L[] = new int [n1]; 
    int R[] = new int [n2]; 

    /*Copy data to temp arrays*/
    for (int i=0; i<n1; ++i) 
        L[i] = arr[l + i]; 
    for (int j=0; j<n2; ++j) 
        R[j] = arr[m + 1+ j]; 


    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays 
    int i = 0, j = 0; 

    // Initial index of merged subarry array 
    int k = l; 
    while (i < n1 && j < n2) 
    { 
        if (L[i] <= R[j]) 
        { 
            arr[k] = L[i]; 
            i++; 
        } 
        else
        { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

    /* Copy remaining elements of L[] if any */
    while (i < n1) 
    { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

    /* Copy remaining elements of R[] if any */
    while (j < n2) 
    { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    }
}
public static void printGivenArray(int arr[])
{
	 int n = arr.length; 
     for (int i=0; i<n; ++i) 
         System.out.print(arr[i] + " "); 
   
	}


public static void sort(int arr[], int l, int r) 
{ 
    if (l < r) 
    { 
        // Find the middle point 
        int m = (l+r)/2; 

        // Sort first and second halves 
        sort(arr, l, m); 
        sort(arr , m+1, r); 

        // Merge the sorted halves 
        merge(arr, l, m, r); 
    } 
} 
/*Binary search*/

public static int binarySearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 

        // If the element is present at the 
        // middle itself 
        if (arr[mid] == x) 
            return mid; 

        // If element is smaller than mid, then 
        // it can only be present in left subarray 
        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 

        // Else the element can only be present 
        // in right subarray 
        return binarySearch(arr, mid + 1, r, x); 
    } 

    // We reach here when element is not present 
    // in array 
    return -1; 
} 

public static String[] sort_sub(String array[], int f){
String temp="";
for(int i=0;i<f;i++){
for(int j=i+1;j<f;j++){
if(array[i].compareToIgnoreCase(array[j])>0){
temp = array[i];
array[i]=array[j];
array[j]=temp;
}
}
}
return array;
}

/*Frequency Count*/
public static void sort(String[] arr)
{
	String temp;
	for( int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].compareToIgnoreCase(arr[j])>0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

	
}



/*User Registration*/
public static boolean isValid(String phNumber) 
{ 
 
    Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}"); 
    Matcher m = p.matcher(phNumber); 
    return (m.find() && m.group().equals(phNumber)); 
} 

/*2D array integer,double,booleans*/

public int inputInteger() {
	return scanner.nextInt();
}

public double inputDouble() {
	// TODO Auto-generated method stub
	return scanner.nextDouble();
}

public String inputString() {
	// TODO Auto-generated method stub
	return scanner.nextLine();
}

public static void primeAnagrams()
{
	ArrayList<Integer> ar = new ArrayList<Integer>();
	System.out.println();
	boolean b;
	for (int j = 2; j <= 1000; j++) 
	{
		b = true;
		for (int i = 2; i < j / 2; i++) 
		{
			if (j % i == 0) 
			{
				b = false;
				break;
			}
		}
		if (b)
			ar.add(j);
	}
	for (int i = 0; i < ar.size(); i++) 
	{
		for (int j = i + 1; j < ar.size(); j++)
		{
			if (anagram(ar.get(i), ar.get(j))) 
			{
				System.out.println(ar.get(i) + "  " + ar.get(j));
			}
		}
	}
}


public static boolean anagram(int n1, int n2) 
{
	int[] n1count = count(n1);
	int[] n2count = count(n2);
	for (int i = 0; i < n2count.length; i++) 
	{
		if (n1count[i] != n2count[i]) 
		{
			return false;
		}
	}
	return true;
}
public static int[] count(int n) 
{
	int[] count = new int[10];
	int temp = n;
	while (temp != 0)
	{
		int r = temp % 10;
		count[r]++;
		temp = temp / 10;
	}
	return count;
}

public static void primePallindrome() 
{
	System.out.println();
	boolean b;

	for (int j = 2; j <= 1000; j++) 
	{
		b = true;
		for (int i = 2; i < j / 2; i++) 
		{
			if (j % i == 0) 
			{
				b = false;
				break;
			}
		}
		if (b && isPallindrome(j))
			
			System.out.print(j + " ");
	}
}
public static boolean isPallindrome(int n) 
{
	int temp = n;  
	int sum=0;
	  while(n>0)
	  {    
	 int r=n%10;  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    
	   return true; 
	  else    
	   return false;

	
}

public static int findRepeateNoArray(int[] arr) 
{
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = i + 1; j < arr.length; j++) 
		{
			if (arr[i] == arr[j]) 
			{
				return arr[i];
			}
		}
	}
	return 0;
}
public void  Gamming(int s,int g,int day)
{
	int tempstake = s;
	int win = 0;
	int loss = 0;
	for(int i=0;i<day;i++)
	{
	while(tempstake>0 && tempstake<g)
	{
		if (Math.random()<0.5)
		{
			tempstake++;
			win++;
		}
		else
		{
			if(tempstake==g)
			{
				win ++;
			}
		}
	}
	int arr[][] = new int[2][1];
	arr[0][0] = win;
	arr[1][0] = loss;

	System.out.println("the number of times the game won is " + arr[0][0]);
	System.out.println("The number of times the game loss is " + arr[1][0]);

	}
	}
}