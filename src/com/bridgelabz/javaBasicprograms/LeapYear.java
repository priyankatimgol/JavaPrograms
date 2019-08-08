/******************************************************************************
 
 *  Purpose: Year is a Leap Year or not Leap Year.  .
 *
 *  @author    PriyankaTimgol
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

public class LeapYear {

	boolean leap;
	public static void main(String[] args) {
		int year;
		do
		{
		System.out.println("Enter year:");
		
		year=Utility.getInt();
		}while(year<1582);
		if(Utility.isLeap(year))
		{
			System.out.println("year is leap");
		}
		else
		{
			System.out.println("year is not leap year");
		}

	}

	}


