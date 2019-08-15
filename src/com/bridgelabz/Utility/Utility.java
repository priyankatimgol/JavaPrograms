
package com.bridgelabz.Utility;
import java.util.Random;

/******************************************************************************
 *  Purpose: utility is logic of all programs
 *
 *  @author  priyankatimgol
 *  @version 1.0
 *  @since   07-08-2017
 *
 ******************************************************************************/




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
			
    
			/**
	 * @param tempreture added temperature.
	 * @param choice enter your choice 1 or 2
	 * @return if you enter 1 then then print result in fahrenhieit or 2 then celsius
	 */
	public static double temperatureConversion(double tempreture,int choice)
	{ 
		if(choice==1) {
			double resultfahrenhieit = (tempreture*9/5)+32;
			return resultfahrenhieit;
		}
		else {
			double resultcelsius = (tempreture-32)*5/9;
			return resultcelsius;
		}

	}
	
	
	
		
/**
 * @param number Entered number in decimal
 */
public static void binary(int number) {
	
	int arr[]=new int[32];
	String string="";
	int i=0;
	while(number>0)
	 {
		arr[i]=number % 2;
		number=number/2;
		i++;	
	}
	for(int j=i-1;j>=0;j--) {
		string=string+""+arr[j];
	}
	System.out.println(string);
	int Stringtointeger=Integer.parseInt(string);
	String string1=String.format("%08d",Stringtointeger);
	System.out.println(string1);
	String[] split=new String[2];
	int length=string1.length();
	split[0]=string1.substring(0, length/2);
	split[1]=string1.substring(length/2, length);
	System.out.println(split[0]);
	System.out.println(split[1]);
	
	String temp=split[0];
	split[0]=split[1];
	split[1]=temp;
	
	String newstring=split[0].concat(split[1]);
	int decimal=Integer.parseInt(newstring);
	System.out.println("binary number:"+decimal);
	
	
	int rem=0,sum=0,count=0;
	while(decimal>0)
	{
		rem=decimal%10;
		decimal=decimal/10;
		sum=sum+(rem*(int)Math.pow(2,count));
		count++;
		
	}
	System.out.println("\nBinary To Decimal:"+sum);

}
    


			
//
//			/**
//			 * @param temperature Enter temperature is larger than 50 
//			 * @param speed Enter speed  is larger than 120 or less than 3
//			 * @return wind value
//			 */
//			public static double windchill(double temperature,double speed) {
//				
//				double wind=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(0,16);
//				return wind;
//			} 
//			
//			/**
//			 * @param day day added
//			 * @param month month added
//			 * @param year year added
//			 * @return day
//			 * 
//			 */
//			public static int dayofweek(int day,int month,int year) {
//				
//				int year1=year-(14-month)/12;
//				int year2= year1 + year1/4 - year1/100 + year1/400;
//				int month1 = month + 12 *((14 - month ) / 12)- 2;
//				int day1= (day + year2 + 31 *month1/12)% 7;
//				return day1;
//				
//			}
//			/**
//			 * @param principle principle added
//			 * @param year year added
//			 * @param Rate Rate added
//			 * @return monthly compound interest
//			 */
//			public static double  carloan(double principle,double year,double Rate) {
//				
//				double number=12*year;
//				double rate=Rate/(12*100);
//			    double payment=(principle*rate)/(1-(Math.pow((1+rate),-number)));
//				return payment;
//				
//			}
//			/**
//			 * @param angle Entered angle in radians
//			 */
//			public static void trig(double angle) {
//				
//				double sin=Math.sin(angle);
//				System.out.println("angle in sin: "+sin);
//				double cos=Math.cos(angle);
//				System.out.println("angle in cos: "+cos);
//				double tan=Math.tan(angle);
//				System.out.println("angle in tan: "+tan);
//				double cot=1/tan;
//				System.out.println("angle in cot: "+cot);
//				double cosec=1/sin;
//				System.out.println("angle in cosec: "+cosec);
//				double sec=1/cos;
//				System.out.println("angle in sec: "+sec);
//				}
//			
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
				System.out.println("Head: "+head+"\tTail: "+tail+"\nPercentage of head :"+((head*100)/number));	
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
				public static String decimaltobinary(int number)
				{ String string="";
					int binary[]=new int[8];
					int i=0;
					while(number>0)
					{
						 binary[i]=number%2;
						number=number/2;
						 i++;
					}
					for(int j=i-1;j>=0;j--) {
						string=string+binary[j];
					}
					System.out.println("Decimal To Binary:"+string);
						int stringtointeger=Integer.parseInt(string);
						String result=String.format("%08d",stringtointeger);
						System.out.println("4 Byte string: "+result);
						return result;
					
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
				
				public static void binary(String result) {
					
					    
					String[]split=new String[2];
					int length=result.length();
					split[0]=result.substring(0,length/2);
					split[1]=result.substring(length/2,length);
					System.out.println(split[0]);
					System.out.println(split[1]);
					String temp=split[0];
					split[0]=split[1];
					split[1]=temp;
					String newstring=split[0].concat(split[1]);
					int number=Integer.parseInt(newstring);
					
					System.out.format("%08d",number);
					int rem=0,sum=0,count=0;
					while(number>0) {
					
						rem=number%10;

						number=number/10;
						sum=sum+(rem*(int)Math.pow(2,count));
						count++;
 
				}
					System.out.println("\n"+sum);
				}
				
				/**
				 *  Purpose: calculate most frequent number.
				 * @param 	arrays	random number store in array.
				 */

				public static void rolldie(int[] array) {
	
					Arrays.sort(array);
					int maxcount=1,currentcount=1,result=array[0];
					int n=array.length;
					int i;
					for( i=1;i<n;i++)
					{
						if(array[i]==array[i-1])
							currentcount++;
						else{
							if(currentcount>maxcount) {
							maxcount=currentcount;
							result=array[i-1];
							}
						currentcount=1;
						}
					}
				if(currentcount>maxcount) {
					maxcount=currentcount;
					result=array[n-1];
				}
			System.out.println("Repeterd number"+result);
		}


				
				public static void largestsmallest(int arr[],int length) {
					int small=arr[0];
					int largest=arr[0];
					
					for(int i=0;i<length;i++)
					{
						  if(arr[i]<small) {
							  small=arr[i];
						  }
						  if(largest<arr[i]) {
							  largest=arr[i];
						  }
					}
					
					int secondsmallest=arr[0];
					int secondlargest=arr[0];
					for(int i=0;i<length;i++) {
						if(arr[i]<secondsmallest&&arr[i]!=small)
						{
							secondsmallest=arr[i];
						}
						if(secondlargest<arr[i]&&arr[i]!=largest)
						{
							secondlargest=arr[i];
						}
					}
					System.out.println("Second Smallest number: "+secondsmallest);
					System.out.println("Second largest number: "+secondlargest);
				}
				
				public static void repetednumber(int[] array,int length) {
					for(int i=0;i<length;i++) {
						for(int j=i+1;j<length;j++) {
							
							if(array[i]==array[j])
								System.out.println("duplicate number:"+array[i]);
							
						}
					}
				}

					
/**
 *  Purpose: Calculate prime factor of given number.
 * @param 	number	number to be add.
 */
public void primeFactor(int number) {
	
	for(int i = 2; i*i<=number; i++) {
         while(number%i == 0) {
            System.out.println(i+" ");
            number = number/i;
         }
      }
}


/**
 * @param angle	Cos angle to be add.
 * @return sum	Return sum of taylor series. 
 */
public double cos(double angle) {
	angle = angle % (2 * Math.PI);
	System.out.println("Angle in radian: "+angle);
    double term = angle;      // ith term = x^i / i!
    double sum  = 1.0;      // sum of first i terms in taylor series

    for (int i = 2; term != 0.0; i++) {
    	
    	term *= (angle / i);
        if (i % 4 == 2) sum -= term;
        if (i % 4 == 0 ) sum += term;
	}
	return sum;
}


}
				
				

			
			
			
	

			

