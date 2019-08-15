/******************************************************************************
 
 *  Purpose: To check given strings are anagram or not .
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   15-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.functionprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Stringfunction {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string:  ");
		String string1=scanner.nextLine();
		System.out.println("Enter second string:  ");
		String string2=scanner.nextLine();
		boolean result=Utility.isAnagram(string1,string2);
		System.out.println(result);
		scanner.close();
		
	}

}
