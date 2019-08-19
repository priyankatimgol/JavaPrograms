package com.bridgelabz.javaconditionprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Largestsmallest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int elements=scanner.nextInt();
		Random random=new Random();
		int[] arr=new int[elements];
		int length=arr.length;
		for(int i=0;i<length;i++) {
			arr[i]=random.nextInt(100)+1;
			System.out.println(arr[i]);
		}
		
		
		Utility.largestsmallest(arr,length);
		

	}

}
