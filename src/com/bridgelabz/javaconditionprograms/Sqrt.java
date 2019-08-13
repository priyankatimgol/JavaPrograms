/******************************************************************************
 
 *  Purpose: determine square root of non-negative number.
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number:");
		double number=scanner.nextInt();
		double Answer=Utility.sqrt(number);
		System.out.println("square root of nonnegative number: "+Answer);
		scanner.close();
	}

}
