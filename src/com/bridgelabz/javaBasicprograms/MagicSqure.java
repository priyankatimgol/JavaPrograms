package com.bridgelabz.javaBasicprograms;

public class MagicSqure {

	public static void main(String[] args) {
		int sum1,sum2,sum3,sum4,sum5,sum6;
		int[][] arr = new int[2][2];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum1=arr[0][1]+arr[0][2];
				sum2=arr[1][1]+arr[1][2];
				sum3=arr[0][1]+arr[1][2];
				sum4=arr[0][2]+arr[1][1];
				sum5=arr[0][1]+arr[1][1];
				sum6=arr[0][2]+arr[1][2];
				
				System.out.print("sum1: "+sum1+"sum2: "+sum2+"sum3: "+sum3+"sum4: "+sum4+"sum5: "+sum5+"sum6: "+sum6);
			}
			System.out.println("");
		}
	}

}
