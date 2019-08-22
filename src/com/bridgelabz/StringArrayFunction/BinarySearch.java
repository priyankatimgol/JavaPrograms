package com.bridgelabz.StringArrayFunction;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class BinarySearch {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		try {
			
			BufferedReader bufferreader=new BufferedReader(new FileReader("/home/admin1/ABC.txt"));
			StringBuilder sb=new StringBuilder();
			String line=bufferreader.readLine();
			while(line!=null) {
				sb.append(line);
				line=bufferreader.readLine();
			}
			
			System.out.println(sb.toString());
			System.out.println("Enter a string you want to search in string: ");
			String search =scanner.nextLine();
			String string=sb.toString();
			String[] stringarray=string.split(",");
			Arrays.sort(stringarray);
			int result=Utility.binarysearchstring(stringarray,search);
			
			if(result==-1) {
				System.out.println("String not found");
			}
			else {
				System.out.println("String found at "+(result+1+"position"));
			}
			bufferreader.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		scanner.close();
	}

}
