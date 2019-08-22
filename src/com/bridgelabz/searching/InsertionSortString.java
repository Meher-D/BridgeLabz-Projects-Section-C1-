package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class InsertionSortString {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		
		String[] arr ={"New York","Dallas","Omaha","San Francisco"};
			int count = 0;
			String sortedArray[] =utility. sort_sub(arr, arr.length); 
			for(int i=0;i<sortedArray.length;i++){
			System.out.println(sortedArray[i]);
			}
			}
	}


