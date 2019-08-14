/******************************************************************************
 
 *  Purpose: perform to prints five uniform random values between 0 and 1,
their average value, and their minimum and maximum value. 
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

import java.util.Random;
import java.util.Scanner;

public class Stats5 {

	public static void main(String[] args) {
		Random random=new Random();
		double firstnumber=Math.random()*1;
		double secondnumber=Math.random()*1;
		double thirdnumber=Math.random()*1;
		double fourthnumber=Math.random()*1;
		double fivenumber=Math.random()*1;
		System.out.println(""+firstnumber+" "+secondnumber+" "+thirdnumber+" "+fourthnumber+" "+fivenumber);
		Utility.stats5(firstnumber, secondnumber, thirdnumber, fourthnumber, fivenumber);

	}

}
