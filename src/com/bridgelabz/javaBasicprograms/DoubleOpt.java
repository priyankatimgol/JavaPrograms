/******************************************************************************
		 
 *  Purpose: Calculate mathematics different expressions(numbers in double format).
 *
 *  @author    PriyankaTimgol
 *  @version 1.0
 *  @since   05-08-2017
 *
******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class DoubleOpt {

	public static void main(String[] args) {
				double firstnumber,secondnumber,thirdnumber;
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the first number");
				firstnumber=scanner.nextInt();
				System.out.println("Enter the second number");
				secondnumber=scanner.nextInt();
				System.out.println("Enter the third number");
				thirdnumber=scanner.nextInt();
				Utility.DoubleOpt(firstnumber, secondnumber, thirdnumber);
				
				scanner.close();

			}

		


	}


