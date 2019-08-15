/******************************************************************************
 
 *  Purpose: Rolling dies N times and calculate maximum number of times between 1 and 6.
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.conditionalprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RollDie {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of times:");
		int number=scanner.nextInt();
		Random random=new Random();
		int i;
		int[] array=new int[number];
		System.out.println("Random numbers are: ");
		for( i=0;i<number;i++) {
			array[i]= random.nextInt(6)+1;
			System.out.println(array[i]);
		}
		
		Utility.rolldie(array);
}
}
