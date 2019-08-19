/******************************************************************************
 
 *  Purpose: To check given strings is palindrome or not .
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   15-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=scanner.nextLine();
		
		boolean result=Utility.palindrome(string);
		
		System.out.println(result);
		scanner.close();

	
	}

}
