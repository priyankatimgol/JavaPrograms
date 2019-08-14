/******************************************************************************
 
 *  Purpose: Determine quadratic equation and find out roots 
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

import java.util.Scanner;

public class Quadratic
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number");
		double firstnumber=scanner.nextDouble();
		System.out.println("Enter the second number");
		double secondnumber=scanner.nextDouble();
		System.out.println("Enter the third number");
		double thirdnumber=scanner.nextDouble();
		Utility.quadNumber(firstnumber,secondnumber,thirdnumber);
		scanner.close();
	}
	

	
	
}
