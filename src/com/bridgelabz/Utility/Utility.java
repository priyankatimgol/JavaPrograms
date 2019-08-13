package com.bridgelabz.Utility;
import java.util.Random;
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
			
			/*************** Condition, Loops and Logical Programs *****************/
			
			/**
			 * @param number  added number of flip coin.
			 */
			public static void flipcoin(int number) {
				
				int head=0,tail=0;
				Random random=new Random();
				
;				for(int i=1;i<=number;i++)
				{
					int coin=(int)random.nextInt(1+1)+0;
					if(coin==1) {
						
						System.out.println("head");
						head++;
					}
					else 
					{
						System.out.println("tail");
						tail++;
					}
				
				}
				System.out.println("Head: "+head+"\tTail: "+tail+"\nPercentage of head vs tail:"+(head/tail*100));	
			}

				/**
				 * @param number added number is power of 2
				 */
				public static void powerof2(int number) {
					
					int i;
					for(i=1;i<=number;i++)
					{
					System.out.println("power of 2: "+((int)Math.pow(2,i)));
					}
				}
				/**
				 * @param number added number
				 */
				public static void harmonicnumber(int number) {
					
					double sum=0;
					for(int i=1;i<=number;i++)
					{
						sum=sum+1.0/i;
					}
					System.out.println(sum);
				}
				
				/**
				 * @param number added number
				 * @return square root
				 */
				public static double sqrt(double number) {
					
					double temp=number;
					double epsilon = 1e-15;
					while(Math.abs(temp-number/temp) > epsilon*temp)
					{
						 temp =(number/temp+temp)/2.0;
					}
					return temp;
					
					
				}
				/**
				 * @param lower added lower value
				 * @param upper added upper value
				 */
				public static void primenumber(int lower, int upper) {
					
					int flag=1;
					for(int i=lower;i<=upper;i++) {
						for(int j=2;j<i;j++) {
							if(i%j==0) {
								flag=0;
							    break;
							}
							else
							{
								flag=1;
							}
						}
						if(flag==1)
						{
							System.out.println(i);
						}
					}
					}
				/**
				 * @param number  added decimal number
				 */
				public static void decimaltobinary(int number)
				{
					int binary[]=new int[32];
					int i=0;
					while(number>0)
					{
						 binary[i]=number%2;
						number=number/2;
						 i++;
					}
					for(int j=i-1;j>=0;j--)
						System.out.print(binary[j]);
				}
				
				/**
				 * @param angle enter the angle
				 */
				public static void sin(double angle) {
					
				double term = 1.0;    
			    double sum  = 0.0;    
			    angle =  (angle % (2 * Math.PI));

		        for (int i = 1; term != 0.0; i++) {
		            term=term*(angle / i);
		            if (i % 4 == 1)
		            {
		            	sum=sum+term;
		            }
		            if (i % 4 == 3) 
		            {
		            	sum=sum-term;
		            }
		        }
		        System.out.println(sum);
				}
				
}
			
			
			
	
			
			

