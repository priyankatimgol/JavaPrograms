
/******************************************************************************
 
 *  Purpose: perform compounded interest  
 *  monthly
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   09-08-2017
 *
 ******************************************************************************/package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

public class CarLoan {

	public static void main(String[] args) 
	{
		double principle=Integer.parseInt(args[0]);  
		double year=Integer.parseInt(args[1]);
		double Rate=Integer.parseInt(args[2]);
		System.out.println("principle: "+principle+"\nyear: "+year+"\nrate: "+Rate);
		double result=Utility.carloan(principle,year,Rate);
		
		System.out.println("Monthly compound interest: "+result);
	}

}
