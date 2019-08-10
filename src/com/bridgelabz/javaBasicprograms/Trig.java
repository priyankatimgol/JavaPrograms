/******************************************************************************
 
 *  Purpose:  Performs various trigonometric calculations.
 *
 *  @author    PriyankaTimgol
 *  @version   1.0
 *  @since     10-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.javaBasicprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Trig {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter angel in degree:");
		double angle=Math.toRadians(scanner.nextDouble());
		System.out.println("angle in radian:"+angle);
		Utility.trig(angle);
		scanner.close();
	}

}
