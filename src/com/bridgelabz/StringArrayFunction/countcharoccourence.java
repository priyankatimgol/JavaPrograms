package com.bridgelabz.StringArrayFunction;

public class countcharoccourence {

	public static void main(String[] args) {
		String[] string= {"to","be","or","not","to","be"};
		int length=string.length;
		int j;
		int count=1;
		for(int i=0;i<length;i++) {
			for( j=i+1;j<length;j++) {
				if(string[i]==string[j]) 
				count++;
			}
			for( j=0;j<i;j++) {
					if(string[i]==string[j]) 
					break;
			}
			if(i==j)
				System.out.println(count);
			count=1;
			}
		
		}
	

}
