package com.bridgelabz.StringArrayFunction;

import com.bridgelabz.Utility.Utility;

public class InsertionSort {
	public static void main(String[] args)
    {
         String[] stringArray = {"beta", "gamma", "alpha", "epsilon", "delta"};
        System.out.println("Unsorted array:");
        for(int i=0;i<stringArray.length;i++) {
        	System.out.print(stringArray[i]);
        }

         Utility.insertionSort(stringArray);

        
    }

	
		
	

   

}
