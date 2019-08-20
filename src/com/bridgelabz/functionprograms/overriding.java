package com.bridgelabz.functionprograms;
import java.util.Arrays;
public class overriding {
	  
	  
		public static void main (String args[]){
		   int numbers[]= {1,5,-9,12,-3,89, 18,23,4,-6};
		   //Find minimum (lowest) value in array using loop
		   System.out.println("Minimum Value = " + getMinValue(numbers));
		   //Find maximum (largest) value in array using loop
		   System.out.println("Maximum Value = " + getMaxValue(numbers));
		    //Find minimum (lowest) value in array by sorting array
		   System.out.println("Minimum Value = " + minValue(numbers));
		   //Find maximum (largest) value in array by sorting array
		   System.out.println("Maximum Value = " + maxValue(numbers));
		 
		}
		//Find maximum (largest) value in array using loop
		public static int getMaxValue(int[] numbers){
			int maxValue = numbers[0];
			for(int i=1;i<numbers.length;i++){
				if(numbers[i] > maxValue){
					maxValue = numbers[i];
				}
			}
			return maxValue;
		}
		//Find minimum (lowest) value in array using loop
		public static int getMinValue(int[] numbers){
			int minValue = numbers[0];
			for(int i=1;i<numbers.length;i++){
				if(numbers[i] < minValue){
					minValue = numbers[i];
				}
			}
			return minValue;
		}
		//Find minimum (lowest) value in array using array sort
		public static int minValue(int[] numbers){
		  Arrays.sort(numbers);
		  return numbers[0];
		}
		//Find maximum (largest) value in array using array sort
		public static int maxValue(int[] numbers){
		  Arrays.sort(numbers);
		  return numbers[numbers.length-1];
		}
		
	}



