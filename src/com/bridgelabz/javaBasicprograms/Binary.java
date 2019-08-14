package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

import java.util.Scanner;


public class Binary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number into decimal:");
		int number=scanner.nextInt();
		Utility.binary(number);
		scanner.close();

	}

}
