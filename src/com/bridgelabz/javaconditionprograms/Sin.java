package com.bridgelabz.javaconditionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Sin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the angle: ");
		double angle=scanner.nextInt();
		Utility.sin(angle);
		   scanner.close();     
	    }

	}


