package com.bridgelabz.lib;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;
import com.bridgelabz.javaconditionprograms.Sqrt;

public class Mathfunction {

	public static void main(String[] args) {
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("1:Harmonic series \n2:Sin of angle \n3:Cos of angle \n4:Binary of a number: \n5:square root of nonnegative number "
						+ "\n6:Prime number \n7:factoraial number \n8:Future value \n9:Present value \n10 check three points are colinear using slope formula "
						+ "\n11 check three points are colinear using Triangle formula \n12:square root using overload method");
				System.out.println("Enter your choice:");
				int choice =scanner.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("******************Harmonic series *********************");
					System.out.println("Enter number:");
					int number=scanner.nextInt();
					double result=Utility.harmonicseries(number);
					System.out.println("Sum of harmonic series: "+result);
					break;
					
				case 2:
					System.out.println("******************Sin angle *********************");
					System.out.println("Enter the angle: ");
					double angle=scanner.nextDouble();
					double sinangle=Utility.sin(angle);
					 System.out.println("Sin angle:"+sinangle);
					 break;
				case 3:
					System.out.println("******************Cos angle *********************");
					System.out.println("Enter the angle: ");
					double cos_angle=scanner.nextDouble();
					double cosangle=Utility.cos(cos_angle );
					 System.out.println("cos angle:"+cosangle);
					 break;
					 
				case 4:
					System.out.println("******************Decimal to binary *********************");
					System.out.println("Enter the number in decimal: ");
					int decimal=scanner.nextInt();
					String result1=Utility.decimaltobinary(decimal);
					System.out.println("Decimal to binary conversion:"+result1);
					 break;
					 
				case 5:
					System.out.println("******************Square root of non negative number *********************");
					System.out.println("Enter the number:");
					double number1=scanner.nextDouble();
					double Answer=Utility.sqrt(number1);
					System.out.println("square root of nonnegative number: "+Answer);
					break;
				case 6:
					System.out.println("******************Prime number *********************");
					System.out.println("Enter the number:");
					int integernumber=scanner.nextInt();
					boolean answer=Utility.primenumber(integernumber);
					System.out.println(answer);
					 break;
				case 7:
					System.out.println("******************Factorial of given number *********************");
					System.out.println("Enter the number:");
					long factnumber=scanner.nextInt();
					long factnumber1=Utility.factorial(factnumber);
					System.out.println("factorial of given number:"+factnumber1);
					break;
				case 8:
					System.out.println("******************Future value *********************");
					System.out.println("Enter Present Value:");
					double presentvalue=scanner.nextDouble();
					System.out.println("Enter annual interest rate:");
					double annualinterestrate=scanner.nextDouble();
					System.out.println("Enter  number of periods:");
					double numberofperiods=scanner.nextDouble();
					double futurevalue=Utility.future(presentvalue,annualinterestrate,numberofperiods);
					System.out.println("Future value:"+futurevalue);
					break;
				case 9:
					System.out.println("******************Present value *********************");
					System.out.println("Enter future Value:");
					double fv=scanner.nextDouble();
					System.out.println("Enter annual interest rate:");
					double r=scanner.nextDouble();
					System.out.println("Enter  number of periods:");
					double n=scanner.nextDouble();
					double value=Utility.present(fv,r,n);
					System.out.println("Present value:"+value);
					break;
				
				case 10:	
					System.out.println("******************check three points are colinear using slope formula *********************");
					System.out.println("Enter the x1 value");
					int x1=scanner.nextInt();
					System.out.println("Enter the x2 value");
					int x2=scanner.nextInt();
					System.out.println("Enter the x3 value");
					int x3=scanner.nextInt();
					System.out.println("Enter the y1 value");
					int y1=scanner.nextInt();
					System.out.println("Enter the y2 value");
					int y2=scanner.nextInt();
					System.out.println("Enter the y3 value");
					int y3=scanner.nextInt();
					boolean slopvalue=Utility.slope(x1,x2,x3,y1,y2,y3);
					System.out.println(slopvalue);
					break;
				case 11:	
					System.out.println("******************check three points are colinear using Triangle formula *********************");
					System.out.println("Enter the x4 value");
					float x4=scanner.nextInt();
					System.out.println("Enter the x5 value");
					float x5=scanner.nextInt();
					System.out.println("Enter the x6 value");
					float x6=scanner.nextInt();
					System.out.println("Enter the y4 value");
					float y4=scanner.nextInt();
					System.out.println("Enter the y5 value");
					float y5=scanner.nextInt();
					System.out.println("Enter the y6 value");
					float y6=scanner.nextInt();
					boolean trianglevalue=Utility.triangle(x4,x5,x6,y4,y5,y6);
					System.out.println(trianglevalue);
					break;
				case 12:
					 System.out.println("Enter the number:");
			    	  int Integernumber=scanner.nextInt();
			    	  Sqrt.squareroot(Integernumber);
			    	  double epsilon = 1e-15;
			    	  Sqrt.squareroot(Integernumber,epsilon);
					 break;
					
				default:
					System.out.println("Please enter correct choice");
				
				}
				
				scanner.close();

			}


	}


