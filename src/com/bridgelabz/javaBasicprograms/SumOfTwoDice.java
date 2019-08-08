/******************************************************************************
 
 *  Purpose: Determine sum of two random integers between 1 and 6
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class SumOfTwoDice {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int firstnumber=random.nextInt(6)+1;
		int secondnumber=random.nextInt(6)+1;
		System.out.println("first random number: "+firstnumber+"\n"+"second random number "+secondnumber);
		int result=Utility.sumoftwointeger(firstnumber,secondnumber);
		System.out.println("sum of random numbers between 1 and 6:"+result);
		scanner.close();
		}

}
