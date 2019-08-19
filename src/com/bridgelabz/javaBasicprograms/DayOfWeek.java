/******************************************************************************
 
 *  Purpose: perform Gregorian calendar
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int month,day,year;
		 day=Integer.parseInt(args[0]); 
		 month=Integer.parseInt(args[1]);
		 year=Integer.parseInt(args[2]);
		System.out.println("day: "+day+"\nmonth: "+month+"\nyear: "+year);
		String Answer=Utility.dayofweek(day,month,year);
		System.out.println(Answer);
		
		scanner.close();
	}

}
