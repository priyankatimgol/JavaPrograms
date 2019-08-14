package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Binary {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number in decimal:");
		int number=scanner.nextInt();
		
		String result=Utility.decimaltobinary(number);
		Utility.binary(result);
		scanner.close();


	}

}
