/******************************************************************************
 
 *  Purpose: calculate the prime numbers between range.
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lower limit:");
		int lower =scanner.nextInt();
		System.out.println("Enter the upper limit:");
		int upper =scanner.nextInt();
		System.out.println("prime number between range:");
		Utility.primenumber(lower,upper);
		scanner.close();
	}

}
