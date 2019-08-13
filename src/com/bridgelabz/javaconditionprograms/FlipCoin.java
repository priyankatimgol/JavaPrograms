/******************************************************************************
 
 *  Purpose: Determine flip coin and print out "Heads" or"Tails" accordingly and print the percentage of Head vs Tail.
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of flip coin:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		Utility.flipcoin(number);
		scanner.close();
	}
}
