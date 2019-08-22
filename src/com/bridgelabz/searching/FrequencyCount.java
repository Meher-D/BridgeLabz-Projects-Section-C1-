package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class FrequencyCount {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String[] arr = {"To","Be","Or","Not","To","Be"};
		 int count=0;
		 String sortedArray[]=Utility.sort(arr,arr.length);
		for(int i=0;i<sortedArray.length;i++) 
		{
			System.out.println(sortedArray[i]);
		}
	 
      String word="Be";
      System.out.println(utility.frequencyCount(sortedArray,word));
	}

}
