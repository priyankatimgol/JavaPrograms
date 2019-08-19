package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

class MinimumMaximum {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements");

		int elements=scanner.nextInt();
		int []array=new int[elements];
	    for(int i=0;i<elements;i++) 
		{
			array[i]=scanner.nextInt();
		}
	  
	    int max = Utility.Maximum(array);
	    System.out.println("Maximum Value is: "+max);
	 
	    
	    int min =Utility.Minimum(array);
	    System.out.println("Minimum Value is: "+min);
		scanner.close();
  
	}
	 
		
	}

