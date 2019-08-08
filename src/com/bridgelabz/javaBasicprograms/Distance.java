/******************************************************************************
 
 *  Purpose: calculate Euclidean Distance of from point(x,y) to (0,0)
 *
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.javaBasicprograms;
import com.bridgelabz.Utility.Utility;
public class Distance {

	public static void main(String[] args) {
		double input_x,input_y;
		input_x=Integer.parseInt(args[0]);
		input_y=Integer.parseInt(args[1]);
		double result=Utility.Euclidean_dist(input_x,input_y);
		System.out.println("Euclidean Distance of from point(x,y) to (0,0):"+result);

	}

}
