/******************************************************************************
 *  Purpose: utility is logic of all programs
 *
 *  @author  priyankatimgol
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.utility;
public class Utility {
	/**
	 * @param day Enter day
	 * @param month enter month
	 * @return true if month is between 3 and 6 ,20<=day<=31
	 */
	public static boolean season(int day, int month)
	{
		if(month>=3&&month<=6&&day>=20&&day<=31)
		{
      			if(month==3)
			{
        			if(day>=20)
          				return true;
        			else
          				return false;
      			}
      			else if(month==6)
			{
        			if(day<=20)
          				return true;
        			else
          				return false; 
			}
			else
				return true;
  		}
		else
			return false;
	}
	
	/**
	 * @param firstnumber first number entered
	 * @param secondnumber second number entered
	 * @param thirdnumber third number entered
	 */
	public static void quadNumber(double firstnumber,double secondnumber,double thirdnumber)
	{
		double delta,Root1,Root2;
		delta=secondnumber*secondnumber-4*firstnumber*thirdnumber;
	if(delta>=0)
		{
			Root1 = (-secondnumber + Math.sqrt(delta))/(2*firstnumber);
			Root2 =(-secondnumber - Math.sqrt(delta))/(2*firstnumber);
			System.out.println(" "+Root1+" "+Root2);

		}
	else if(delta == 0)
		{
			Root1 = Root2 = -secondnumber / (2 * firstnumber);
			System.out.format("root1 = root2 = "+ Root1);
		}
    
    else 
    	{
    		 Root1 = -secondnumber / (2 *firstnumber);
    		 Root2 = (Math.sqrt(-delta) / (2 * firstnumber));
    		System.out.format("root1 = "+Root1+ "and"+ "root2 ="+Root2);
    	}
    
	}
    
}
