/******************************************************************************
 
 *  Purpose: Determine nth harmonic number.
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import com.bridgelabz.Utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		System.out.println("number is: "+number);
		double result=Utility.harmonicseries(number);
		System.out.println("Sum of harmonic series:"+result);
	}

}
