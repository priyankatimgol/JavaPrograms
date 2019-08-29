/******************************************************************************
 
 *  Purpose: Write a Program to Register a User and applies regular expression to ensure valid input is done.
 *  @author  PriyankaTimgol
 *  @version 1.0
 *  @since   28-08-2017
 *
 ******************************************************************************/


package com.bridgelabz.stringandregularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	static Scanner scanner=new Scanner(System.in); 
	public static String firstName( String firstName ) {
		if(firstName.matches( "[A-Z][a-z]*" ))
	   		return firstName;
	   	else {
	        System.out.println("Invalid Name  ");
	        System.out.println("Please Re-enter name:  ");
	        firstName=scanner.nextLine();
	        return firstName(firstName);
	   	}
	      
	}
	
	public static String lastName( String lastName ) {
		if(lastName.matches( "([a-zA-Z]+)*" ))
			return lastName;
	   	else {
	        System.out.println("Invalid last Name  ");
	        System.out.println("Please Re-enter last name:  ");
	        lastName=scanner.nextLine();
	        return lastName(lastName);
	   	}
	}
	
	public static String isvalidUserId(String userId) {  
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$"); 
		Matcher m = p.matcher(userId);
		if((m.find() && m.group().equals(userId)))
			return userId;
		else {
			System.out.println("Invalid User id");
			System.out.println("Please Re-enter User id:  ");
			userId=scanner.nextLine();
			return isvalidUserId(userId);
		} 
	}
	
	public static String isvalidpassword(String password) {  
		Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})"); 
		Matcher m = p.matcher(password); 
		if((m.find() && m.group().equals(password)))
			return password;
		else {
			System.out.println("Invalid password  ");
			System.out.println("Please Re-enter password:  ");
			password=scanner.nextLine();
			return isvalidpassword(password);
		} 
	} 
	
	public static String isValidContact(String contactNumber) {  
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");     
		Matcher m = p.matcher(contactNumber); 
		if((m.find() && m.group().equals(contactNumber)))
			return contactNumber;
		else {
			System.out.println("Invalid contact Number ");
			System.out.println("Please Re-enter contact Number :  ");
			contactNumber=scanner.nextLine();
			return isValidContact(contactNumber);
		}
	} 
	public static String emailvalid(String email) {
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
               "[a-zA-Z0-9_+&*-]+)*@" + 
               "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
               "A-Z]{2,7}$";        
		 Pattern pat = Pattern.compile(emailRegex); 
		 if(pat.matcher(email).matches())
			 return email;
		 else {
			 System.out.println("Invalid email id  ");
			 System.out.println("Please Re-enter email id:  ");
			 email=scanner.nextLine();
			 return emailvalid(email);
		}
	}

	public static void main(String[] args) {
   	 	System.out.println("Enter First_name: ");
   	 	String firstname=scanner.nextLine();
   	 	firstname=firstName(firstname);
   	 	
   	 	System.out.println("Enter Last_name: ");
   	 	String lastname=scanner.nextLine();
   	 	lastname=lastName(lastname);
   	 
   	 	System.out.println("Enter your Email-ID: ");
   	 	String email=scanner.nextLine();
   	 	email=emailvalid(email);
   	
   	 	System.out.println("Enter Contact Number: ");
   	 	String contactnumber=scanner.nextLine();
   	 	contactnumber=isValidContact(contactnumber);
   	 	
   		System.out.println("Enter User-ID: ");
   		String userId=scanner.nextLine();
   		userId=isvalidUserId(userId);
   
   		System.out.println("Enter password: ");
   		String password=scanner.nextLine();
   		password=isvalidpassword(password);
   	
   	
   		System.out.println("*******User Details******");
   		System.out.println("Enter First_name: "+firstname);
   		System.out.println("Enter Last_name: "+lastname);
   		System.out.println("Enter your Email-ID: "+email);
   		System.out.println("Enter Contact Number: "+contactnumber);
   		System.out.println("Enter User-ID: "+userId);
   		System.out.println("Enter password: "+password);
   		scanner.close();

	}
	} 


