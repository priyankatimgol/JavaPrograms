/******************************************************************************
 
 *  Purpose: calculate cos value of given angle using taylor series expansion..
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.conditionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Cos {

	public static void main(String[] args) {
		
				System.out.println("Enter the cos angle:");
				Scanner scanner=new Scanner(System.in);
				double angle=scanner.nextDouble();
				Utility utility=new Utility();
				double result=utility.cos(angle);
				System.out.println("cos("+angle+") : "+result);
				scanner.close();
			}

		
	}

