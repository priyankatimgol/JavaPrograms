/******************************************************************************
 *  Purpose: utility is logic of all programs
 *
 *  @author  priyankatimgol
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility {
	
			
			/**
			 * @param firstnumber first number added
			 * @param secondnumber second number added
			 * @param thirdnumber third number added
			 */
			public static void InputOutputOperator(int firstnumber,int secondnumber,int thirdnumber)
			{
				
				int result,result1,result2,result3;
				
				result=firstnumber+secondnumber*thirdnumber;
				System.out.println("Answer is:"+result);
				result1=firstnumber*secondnumber+thirdnumber;
				System.out.println("Answer is:"+result1);
				result2=thirdnumber+firstnumber/secondnumber;
				System.out.println("Answer is:"+result2);
				result3=firstnumber%secondnumber+thirdnumber;
				System.out.println("Answer is:"+result3);
				
			}
			/**
			 * @param firstnumber  first number added
			 * @param secondnumber second number added
			 * @param thirdnumber third number added
			 */
			public static void DoubleOpt(double firstnumber,double secondnumber,double thirdnumber)
			{
				double result,result1,result2,result3;
				
				result=firstnumber+secondnumber*thirdnumber;
				System.out.println("Answer is:"+result);
				result1=firstnumber*secondnumber+thirdnumber;
				System.out.println("Answer is:"+result1);
				result2=thirdnumber+firstnumber/secondnumber;
				System.out.println("Answer is:"+result2);
				result3=firstnumber%secondnumber+thirdnumber;
				System.out.println("Answer is:"+result3);
				
			}
			
			
			private static Scanner scanner=new Scanner(System.in);
			
			public static int getInt()
			{
				int number=scanner.nextInt();
				return number;
			}
			
			
			
			/**
			 * @param year	get year 
			 * @return result  whether the year is leap or not a leap year
			 */
			public static boolean isLeap(int year)
			{   boolean leap=false;
				
			     if((year%4==0 && year%100!=0) || year%400==0 )
			     {
			    	 leap=true;
			     }
			return leap;
			}	
			
			
			/**
			 * @param input_x input_x number added
			 * @param input_y input_y  number added
			 * @return
			 */
			public static double Euclidean_dist(double input_x,double input_y) {
				double power=(Math.pow(input_x,2))+(Math.pow(input_y,2));
				double distance= Math.sqrt(power);
				return distance;
				}
			
			/**
			 * @param firstnumber random first number added
			 * @param secondnumber random second number added
			 * @return  sum of two random integers
			 */
			public static int sumoftwointeger(int firstnumber,int secondnumber) {
				int sum=firstnumber+secondnumber;
				return sum;
				}
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
		/**
		 * @param firstnumber first number added
	 	* @param secondnumber second number added
		 * @param thirdnumber third number added
	 	* @param fourthnumber fourth number added
		 * @param fivenumber five number added
		 */
		public static void stats5(double firstnumber,double secondnumber,double thirdnumber,double fourthnumber,double fivenumber) {
		double average=(firstnumber+secondnumber+thirdnumber+fourthnumber+fivenumber)/5;
		double maximum=Math.max(firstnumber,Math.max(secondnumber, Math.max(thirdnumber, Math.max(fourthnumber, fivenumber))));
		double minimum=Math.min(firstnumber,Math.min(secondnumber, Math.min(thirdnumber, Math.min(fourthnumber, fivenumber))));
		System.out.format("Average of given 5 number: %.2f",average);
		System.out.println("\nMaximum value in given 5 number: "+maximum);
		System.out.println("Minimum value in given 5 number: "+minimum);
	 	}
	
			/**
			 * @param temperature Enter temperature is larger than 50 
			 * @param speed Enter speed  is larger than 120 or less than 3
			 * @return wind value
			 */
			public static double windchill(double temperature,double speed) {
				
				double wind=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(0,16);
				return wind;
			} 
			
			/**
			 * @param day day added
			 * @param month month added
			 * @param year year added
			 * @return day
			 * 
			 */
			public static int dayofweek(int day,int month,int year) {
				
				int year1=year-(14-month)/12;
				int year2= year1 + year1/4 - year1/100 + year1/400;
				int month1 = month + 12 *((14 - month ) / 12)- 2;
				int day1= (day + year2 + 31 *month1/12)% 7;
				return day1;
				
			}
			/**
			 * @param principle principle added
			 * @param year year added
			 * @param Rate Rate added
			 * @return monthly compound interest
			 */
			public static double  carloan(double principle,double year,double Rate) {
				
				double number=12*year;
				double rate=Rate/(12*100);
			    double payment=(principle*rate)/(1-(Math.pow((1+rate),-number)));
				return payment;
				
			}
			
	
			/**
			 * @param angle Entered angle in radians
			 */
			public static void trig(double angle) {
				
				double sin=Math.sin(angle);
				System.out.println("angle in sin: "+sin);
				double cos=Math.cos(angle);
				System.out.println("angle in cos: "+cos);
				double tan=Math.tan(angle);
				System.out.println("angle in tan: "+tan);
				double cot=1/tan;
				System.out.println("angle in cot: "+cot);
				double cosec=1/sin;
				System.out.println("angle in cosec: "+cosec);
				double sec=1/cos;
				System.out.println("angle in sec: "+sec);
				}
			
    

    
}

			
			
			

