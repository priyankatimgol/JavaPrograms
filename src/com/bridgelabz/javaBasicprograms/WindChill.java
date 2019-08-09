/******************************************************************************
 
 *  Purpose:  Determine windchill  if temperature is larger than 50 or v is larger than 120 or less than 3.
 *
 *  @author    PriyankaTimgol
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double temperature=Double.parseDouble(args[0]);  
		double speed=Double.parseDouble(args[1]);  
		System.out.println("temperature: "+temperature+"\nspeed: "+speed);
		if(Math.abs(temperature)>50||speed>120||speed<3){
			System.out.println("Enter temperature larger than 50 or speed is larger than 120  or less than 3");
		}
		else {
		double result=Utility.windchill(temperature,speed);
		System.out.println("wind chill :"+result);
		}
		scanner.close();
		
	}

}
