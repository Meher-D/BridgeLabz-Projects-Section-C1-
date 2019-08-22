package com.bridgelabz.searching;

import com.bridgelabz.utility.Utility;

public class FrequencyCount {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		String[] arr= {"To", "Be", "Not", "To", "Be"};
        String test="Be Be Or Not To To";
        Utility.sort(arr);
		System.out.println("Sorted Array : ");
		for(String string : arr)
		{
			System.out.print(" "+string);
		}
		System.out.println();
   
	String[] keys =test.split(" ");
    String[] uniqueKeys;
    int count = 0;
    
    uniqueKeys = getUniqueKeys(keys);

    for(String key: uniqueKeys)
    {
        if(null == key)
        {
            break;
        }           
        for(String s : keys)
        {
            if(key.equals(s))
            {
                count++;
            }               
        }
        System.out.println("Count of ["+key+"] is : "+count);
        count=0;
    	}
    }
	private static String[] getUniqueKeys(String[] keys)
	{
		String[] uniqueKeys = new String[keys.length];

		uniqueKeys[0] = keys[0];
		int uniqueKeyIndex = 1;
		boolean keyAlreadyExists = false;

		for(int i=1; i<keys.length ; i++)
		{
			for(int j=0; j<=uniqueKeyIndex; j++)
			{
				if(keys[i].equals(uniqueKeys[j]))
				{
					keyAlreadyExists = true;
				}
			}           
			if(!keyAlreadyExists)
			{
            uniqueKeys[uniqueKeyIndex] = keys[i];
            uniqueKeyIndex++;               
			}
			keyAlreadyExists = false;
		}       
		return uniqueKeys;
	}
}