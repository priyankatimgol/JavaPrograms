/******************************************************************************
 
 *  Purpose: Calculate mathematics different expressions(numbers in integer format).
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   05-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class InputOutputOperator {

	public static void main(String[] args) {
		int firstnumber,secondnumber,thirdnumber;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first integer");
		firstnumber=scanner.nextInt();
		System.out.println("Enter the second integer");
		secondnumber=scanner.nextInt();
		System.out.println("Enter the third integer");
		thirdnumber=scanner.nextInt();
		Utility.InputOutputOperator(firstnumber, secondnumber, thirdnumber);
		scanner.close();

	}

}
