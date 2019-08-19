
package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;


/******************************************************************************
 
 *  Purpose: Compute prime factor of N numbers using prime factorization method.
 *  
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   14-08-2017
 *
 ******************************************************************************/



import java.util.Scanner;


public class PrimeFactor {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int number=scanner.nextInt();
		Utility utility=new Utility();
		utility.primefactor(number);
		scanner.close();
	}

		

	}


