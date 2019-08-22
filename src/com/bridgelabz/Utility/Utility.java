
package com.bridgelabz.Utility;
import java.util.Arrays;
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
			public static String dayofweek(int day,int month,int year) {
				
				int year1=year-(14-month)/12;
				int year2= year1 + year1/4 - year1/100 + year1/400;
				int month1 = month + 12 *((14 - month ) / 12)- 2;
				int day1= (day + year2 + 31 *month1/12)% 7;
				
				String[] array= {"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Null"};
				if(day1==1) 
					return array[1];
				else if(day1==2) {
					return array[2];
				}
				else if(day1==3) {
					return array[3];
					}
				else if(day1==4) {
					return array[4];
				}
				else if(day1==5) {
					return array[5];
				}
				else if(day1==6) {
					return array[6];
				}
				else if(day1==0) {
					return array[7];
				}
				else {
					return array[8];
				}
				
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
				 * Purpose:Perform harmonic series.
				 * @param number  number to be added
				 */
				public static double harmonicseries(int number) {
					String string="1/1";
					double sum=1;
					for(int i=2;i<=number;i++) {
						string=string+"+"+"1/"+i;
						sum =sum+ 1.0 / i;
		
					}
					System.out.println("Harmonic Number: "+string);
					return sum;

				}


				/**
				 * purpose: Find the square root of nonnegative number
				 * @param number added number
				 * @return square root
				 */
				public static double sqrt(double number1) {
	
					double temp=number1;
					double epsilon = 1e-15;
					while(Math.abs(temp-number1/temp) > epsilon*temp)
					{
						temp =(number1/temp+temp)/2.0;
					}
					return temp;
	
	
				}


				/**
				 * purpose:number is prime or not
				 * @param integernumber added
				 * @return true or false
				 */
				public static boolean primenumber(int integernumber) {
	
					int count=0;
					for(int i=2;i<integernumber;i++) {
	 
						if(integernumber%i==0) {
							count=count+1;
							break;
						}
			
					}
					if(count==0)
					{
						return true;
					}
					else 
						return false;
		
	}



				/**
				 * purpose:decimal to binary conversion.
				 * 
				 * @param number  added decimal number
				 */
				public static String decimaltobinary(int decimal)
				{ String string="";
				int binary[]=new int[8];
				int i=0;
				while(decimal>0)
				{
					binary[i]=decimal%2;
					decimal=decimal/2;
					i++;
				}
				for(int j=i-1;j>=0;j--) {
					string=string+binary[j];
				}
				int stringtointeger=Integer.parseInt(string);
				String result=String.format("%08d",stringtointeger);
				System.out.println("1 Byte string: "+result);
				return result;
	
				}
	


				/**
				 * purpose:calculate sin angle.
				 * 
				 * @param angle enter the angle
				 */
				public static double sin(double angle) {
					
				double term = 1.0;    
			    double sum  = 0.0;    
			    angle =  (angle % (2 * Math.PI));
			    System.out.println(angle);
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
			    return sum;
				
				}

				/**
				 * purpose:Find the factorial of given number.
				 * 
				 * @param factnumber number to be added
				 * @return factorial value
				 */
				public static long factorial(long factnumber) {
					long fact=1;
					for(int i=1;i<=factnumber;i++)
					{
						fact=fact*i;
					}
					return fact;
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

				

					public static void primefactor(int number) {
						System.out.println("Prime factor of given number: ");
						for(int i=2;i*i<=number;i++) {
							
							while(number%i==0) {
								
								System.out.println(i+" ");
								number=number/i;
							}
							
						}
					}
					
					public static boolean isAnagram(String string1,String string2) {
						
						string1=string1.replaceAll("\\s", "");
						string2=string2.replaceAll("\\s", "");
						boolean anagram=true;
						if(string1.length()!=string2.length()) {
							anagram=false;
						}
						else {
							
							char[] stringarray1=string1.toLowerCase().toCharArray();
							char[] stringarray2=string2.toLowerCase().toCharArray();
							Arrays.sort(stringarray1);
							Arrays.sort(stringarray2);
							boolean anagram1=Arrays.equals(stringarray1, stringarray2);
						}
						if(anagram) {
							return true;
						}
						else 
							
						return false;
						}


						

						/**
						 * @param string Enter string
						 * @return true or false
						 */
						public static boolean palindrome(String string) {
							String reverse="";
							int length=string.length();
							for(int i=length-1;i>=0;i--) {
									reverse=reverse+string.charAt(i); }
							if(string.equals(reverse))
								return true;
							else 
								return false;
							
						}

					
					
					/**
					 * purpose: Permutation of string using recursive method.
					 * 
					 * @param charatacter
					 * @param currentindex
					 */
					public static void permutaion(char[] charatacter,int currentindex) {
						//System.out.println(charatacter);
						if(currentindex==charatacter.length) {
							System.out.println(String.valueOf(charatacter));
						}
						for(int i=currentindex;i<charatacter.length;i++) {
							swap(charatacter,currentindex,i);
							permutaion(charatacter,currentindex+1);
							swap(charatacter,currentindex,i);
						}
						
						
					}
					
					/**
					 * @param charatacter
					 * @param i
					 * @param j
					 */
					public static void swap(char[] charatacter,int i,int j) {
						char temp=charatacter[i];
						charatacter[i]=charatacter[j];
						charatacter[j]=temp;
					}
					public static void recursion(String string , String answer)
					{
						if(string.length()==0)
						{
							System.out.println(" ");
						}
						for(int i=1;i<string.length();i++) {
							char ch=string.charAt(i);
							String string1=string.substring(0,i)+(i+1);
							recursion(string1,answer+ch);
							
							
						}
					}
					

					/**
					 * @param 	angle	Cos angle to be add.
					 * @return	sum		Return sum of taylor series. 
					 */
					public static double cos(double angle) {
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
					/**
					 * purpose:calculate future value.
					 * 
					 * @param presentvalue added presentvalue
					 * @param annualinterestrate added annualinterestrate
					 * @param numberofperiods  added numberofperiods
					 * @return Future value
					 */
					public static double future(double presentvalue,double annualinterestrate,double numberofperiods) {
						
						double Future=presentvalue*Math.pow(1+annualinterestrate,numberofperiods);
						return Future;
					}

					/**
					 * purpose:calculate present value.
					 * 
					 * @param fv future value to be added
					 * @param r  annual interest rate to be added
					 * @param n  number of periods to be added
					 * @return  present value
					 */
					public static double present(double fv,double r,double n) {
	
						double Present=fv/Math.pow(1+r,n);
						return Present;
					}
					


					/**
					 * Purpose: check three points are colinear using slope formula. 
					 * @param x1
					 * @param y1
					 * @param x2
					 * @param y2
					 * @param x3
					 * @param y3
					 * @return
					 */
					public static boolean slope(float x1, float y1, float x2, float y2,float x3, float y3){
         
						{ 
							float slopeAB=(y2 - y1) / (x2 - x1); 
							float slopeBC=(y3-y2)/(x3-x2);
							float slopeAC=(y1-y3)/(x1-x3);
							if(slopeAB==slopeBC && slopeBC==slopeAC) {
								return true;
							}
							else
								return false;
						} 

					} 
					/**
					 * purpose:check three points are colinear using Triangle formula
					 * @param x4
					 * @param y4
					 * @param x5
					 * @param y5
					 * @param x6
					 * @param y6
					 * @return
					 */
					public static boolean triangle(float x4, float y4, float x5, float y5,float x6, float y6){

						double determinant= 0.5*(((x4-x5)*(y5-y6))-((x5-x6)*(y4-y5)));
						if(determinant==0)
						{

							return true;

						} 
						else {

							return false;
						}
						}
					
					  public static int Maximum(int[] array){ 
						    int maxValue = array[0]; 
						    for(int i=1;i < array.length;i++){ 
						      if(array[i] > maxValue){ 
						         maxValue = array[i]; 
						      } 
						    } 
						    return maxValue; 
						  }
						 
						
						  public static int Minimum(int[] array){ 
						    int minValue = array[0]; 
						    for(int i=1;i<array.length;i++){ 
						      if(array[i] < minValue){ 
						        minValue = array[i]; 
						      } 
						    } 
						    return minValue; 
						  } 
				
						  
			/***************String And Arrays *****************/
						  
		/**
		 * Purpose:Print the sorted array using bubble sort.
		 * 
		 * @param array array elements to be added.
		 * @param length  length of the array .
		 */
		public static void  bubblesort(int []array,int length) {
			
			int temp=0;
			for(int i=0;i<length-1;i++)
			{
				for(int j=0;j<length-i-1;j++) {
					
					if(array[j]>array[j+1])
					{
						temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
						}
				}
			}
			System.out.println("Sorted array: ");
			for(int i=0;i<length;i++) {
				System.out.print(" "+array[i]);
			}
		}
		
		public static int binarysearchstring(String[] string,String search) {
			for(int i=0;i<string.length;i++) {
				System.out.println(string[i]);
			}
			int firstindex=0;
			int lastindex=string.length-1;
			while(firstindex<=lastindex)
			{
				int mid=firstindex+(lastindex-firstindex)/2;
				int result=search.compareTo(string[mid]);
				if(result==0)
					return mid;
				if(result>0)
					firstindex=mid+1;
				else
					lastindex=mid-1;
				
			}
			return -1;		
		}
		public static void InsertionSort(int[] array, int length) {
		int temp,i,j;
			for( i=1;i<length;i++) {
				temp=array[i];
				 j=i-1;
				while(j>=0 &&array[j]>temp) {
				array[j+1]=array[j];
				j=j-1;
				}
				array[j+1]=temp;
				
			}
			for(i=0;i<length;i++) {
				System.out.println(array[i]);
			}
		}
				
		
		
}		

			
			
			
	

			

