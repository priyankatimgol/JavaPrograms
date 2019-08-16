package Fuctionprograms;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Stringfunction {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string:  ");
		String string1=scanner.nextLine();
		System.out.println("Enter second string:  ");
		String string2=scanner.nextLine();
		boolean result=Utility.isAnagram(string1,string2);
		System.out.println(result);
		scanner.close();
	}

}
