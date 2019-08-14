package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number =scanner.nextInt();
		Utility.primefactor(number);
	}

}
