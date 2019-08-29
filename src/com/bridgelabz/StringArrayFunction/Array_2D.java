/******************************************************************************
 
 *  Purpose: 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/




package com.bridgelabz.StringArrayFunction;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.lib.BLStdOut;

public class Array_2D {

	public static void main(String[] args) {
		int [][] b = Utility.readInt2D();
		Utility.print(b);
        BLStdOut.println();
        
        double[][] doublenumber = Utility.readDouble2D();
		Utility.print(doublenumber);
        BLStdOut.println();
        
        boolean[][] number = Utility.readboolean2D();
		Utility.print(number);
        BLStdOut.println();
	}

}
