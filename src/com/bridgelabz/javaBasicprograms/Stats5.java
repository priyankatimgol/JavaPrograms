package com.bridgelabz.javaBasicprograms;

import java.util.Random;
import java.util.Scanner;

public class Stats5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		int[] digit = new int[5];
	
		for(int i=1;i<=5;i++) {
		digit[i]=(int)random.nextInt(1);
		System.out.println(""+digit[i]);
		}
		
		
	}

}
