package com.bridgelabz.StringArrayFunction;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int elements=scanner.nextInt();
		int []array=new int[elements];
		int length=array.length;
		System.out.println("Enter the elements: ");
		for(int i=0;i<elements;i++)
		{
			array[i]=scanner.nextInt();
		}
		Utility.InsertionSort(array, length);
		scanner.close();
	}

}
