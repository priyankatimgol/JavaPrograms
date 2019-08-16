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
		int[] array=new int[n];
		int length=array.length;
		for(int i=0;i<length;i++) {
			array[i]=random.nextInt(6)+1;
			System.out.println(array[i]);
		}
		
		
		Utility.rolldie(array);
	}

}
