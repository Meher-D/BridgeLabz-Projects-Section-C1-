package com.bridgelabz.utility;

public class Utility {

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

	}


