package com.bridgelabz.javaconditionprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Repetednumber {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		Random random=new Random();
		int[] array=new int[n];
		int length=array.length;
		for(int i=0;i<length;i++) {
			array[i]=random.nextInt(100)+1;
			System.out.println(array[i]);
		}
		//int[] array= {4,2,2,5,1,3};
		
		Utility.repetednumber(array,length);
		

	}

}
