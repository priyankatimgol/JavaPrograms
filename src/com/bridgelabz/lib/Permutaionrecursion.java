package com.bridgelabz.lib;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Permutaionrecursion {

	public static void main(String[] args) {
		 	Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your string:");
			String string=scanner.nextLine();
			
				Utility.permutaion(string.toCharArray() ,0);
				//Utility.recursion(string," ");
				scanner.close();
			
	}

}
