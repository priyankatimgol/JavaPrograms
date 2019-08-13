/******************************************************************************
 
 *  Purpose: convert the number into Decimal to binary.
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number in decimal:");
		int number=scanner.nextInt();
		
		Utility.decimaltobinary(number);
		scanner.close();

}
}
