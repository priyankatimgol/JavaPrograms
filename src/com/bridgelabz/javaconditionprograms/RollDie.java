package com.bridgelabz.javaconditionprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of times:");
		int n=scanner.nextInt();
		Random random=new Random();
		int[] arr=new int[n];
		int length=arr.length;
		for(int i=0;i<length;i++) {
			arr[i]=random.nextInt(6)+1;
			System.out.println(arr[i]);
		}
		
		
		//Utility.rolldie(arr,length);
	}

}
