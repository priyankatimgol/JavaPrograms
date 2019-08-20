package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Sin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sin angle: ");
		double angle=scanner.nextDouble();
		double result=Utility.sin(angle);
		System.out.println("sin angle:"+result);
		   scanner.close();     
	    }

	}


