package Fuctionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Palindome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string=scanner.nextLine();
		
		boolean result=Utility.palindrome(string);
		
		System.out.println(result);
		scanner.close();

	}

}
