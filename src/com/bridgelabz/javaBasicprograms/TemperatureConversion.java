package com.bridgelabz.javaBasicprograms;

import com.bridgelabz.Utility.Utility;

import java.util.Scanner;



public class TemperatureConversion 
{

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("1:Celsius To Fahrenheit");
		System.out.println("\n2:Fahrenheit To Celsius");
		System.out.println("Enter your choice:");
		int choice= scanner.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the temperature in celsius :");
			double celsius= scanner.nextInt();
			double result1=Utility.temperatureConversion(celsius,choice);
			System.out.println("Temperature conversion is celsius to fahrenheit:"+result1);
			break;
		case 2:
			System.out.println("Enter the temperature fahrenheit To Celsius:");
			double fahrenheit= scanner.nextInt(); 
			double result2=Utility.temperatureConversion(fahrenheit, choice);
			System.out.println("Temperature conversion is celsius to fahrenheit:"+result2);
			break;
 
		default:
			System.out.println(".............Please Enter your correct choice..........");
	     }
		
		
		scanner.close();
       
}
}
