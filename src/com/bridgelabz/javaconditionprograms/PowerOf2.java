/******************************************************************************
 
 *  Purpose: take a command­line argument number and calculate table of the powers of 2 
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import com.bridgelabz.Utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		System.out.println("Enter the number:  "+number);
		Utility.powerof2(number);
		

	}

}
