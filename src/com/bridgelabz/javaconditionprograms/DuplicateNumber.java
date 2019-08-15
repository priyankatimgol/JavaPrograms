/******************************************************************************
 
 *  Purpose: Calculate duplicate number.
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   13-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.conditionalprograms;

import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int[] array=new int[100];
		Random random=new Random();
		for(int i=0;i<array.length;i++) {
			array[i]=(int)random.nextInt(100)+1;
			System.out.print(" "+array[i]);
		}
		Utility utility=new Utility();
		System.out.println("\nduplicate number:  ");
		utility.duplicateNumber(array);
		scanner.close();

	}

	}


