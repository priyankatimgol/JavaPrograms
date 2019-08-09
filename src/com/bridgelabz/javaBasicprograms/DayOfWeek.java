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
		int Answer=Utility.dayofweek(day,month,year);
		if(Answer==1) {
			System.out.println("Monday");
		}
		else if(Answer==2) {
			System.out.println("Tuesday");
		}
		else if(Answer==3) {
			System.out.println("Wednesday");
		}
		else if(Answer==4) {
			System.out.println("Thursday");
		}
		else if(Answer==5) {
			System.out.println("Friday");
		}
		else if(Answer==6) {
			System.out.println("Saturday");
		}
		else if(Answer==0) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("please enter correct date");
		}
		scanner.close();
	}

}
