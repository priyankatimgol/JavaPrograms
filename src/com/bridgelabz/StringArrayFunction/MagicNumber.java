/******************************************************************************
 
 *  Purpose: Binary Search of Integers and then Question to find your number Print the intermediary number and the final answer.
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   16-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.StringArrayFunction;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class MagicNumber {

	public static void main(String[] args) {
		
		int number=Integer.parseInt(args[0]);
		Scanner scanner=new Scanner(System.in);
		int value=1;
		for(int i=1;i<=number;i++) {
			value=value*2;
		}
		System.out.println(value);
		System.out.println("enter the number you wants to search between 0 to "+(value-1));
		int key=scanner.nextInt();
		Utility.magicNumber(key,0,value-1,number);
		scanner.close();
	}

}
