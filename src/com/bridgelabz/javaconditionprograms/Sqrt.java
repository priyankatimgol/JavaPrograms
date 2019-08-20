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
		
		
		
		public static void squareroot(double number) {
			
			double temp=number;
			double epsilon = 1e-15;
			while(Math.abs(temp-number/temp) > epsilon*temp)
			{
				temp =(number/temp+temp)/2.0;
			}
				System.out.println("1st method: "+temp);
				
		}
		
				public static void squareroot(double number,double epsilon) {
					
					double temp=number;
					
					while(Math.abs(temp-number/temp) > epsilon*temp)
					{
						temp =(number/temp+temp)/2.0;
					}
						System.out.println("2nd method: "+temp);

		}
     

      
		
		
	}


