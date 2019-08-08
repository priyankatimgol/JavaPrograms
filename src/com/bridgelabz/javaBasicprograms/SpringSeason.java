/******************************************************************************
 
 *  Purpose: Determine if day d of month m is between March 20  and June 20  ,false otherwise 
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/
package com.bridgelabz;

import com.bridgelabz.utility.Utility;

public class SpringSeason {
	public static void main(String[] args) {
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		boolean result=Utility.season(day,month);
		System.out.println(result);
	
	}
}
