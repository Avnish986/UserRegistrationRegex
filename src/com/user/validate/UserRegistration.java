package com.user.validate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to User registration");
		System.out.println("Enter First Name");
		Scanner s=new Scanner(System.in);
		String fname=s.nextLine();
		Pattern pattern=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher=pattern.matcher(fname);

		boolean matchFound=matcher.find();
		if(matchFound)
		System.out.println("Valid First Name");
		else
		System.out.println("Invalid First Name");
		
		System.out.println("Enter Last Name");
		String lname=s.nextLine();
		Pattern pattern1=Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher1=pattern1.matcher(lname);

		boolean matchFound1=matcher1.find();
		if(matchFound1)
		System.out.println("Valid last Name");

		else 
		System.out.println("Invalid last Name");
		
		System.out.println("Enter email");
		String email = s.nextLine();
		Pattern pattern2 = Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\.[a-z]{2,}){1,2}$");
		Matcher matcher2 = pattern2.matcher(email);
		boolean matchFound2 = matcher2.find();
		if(matchFound2)
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
		System.out.println("Enter ph no.");
		String phNo = s.nextLine();
		Pattern pattern3 = Pattern.compile("^[0-9]{2}[ ]{1}[0-9]{10}$");
		Matcher matcher3 = pattern3.matcher(phNo);
		boolean matchFound3 = matcher3.find();
		if(matchFound3)
			System.out.println("Valid Ph no");
		else
			System.out.println("Invalid Ph no");
		
		System.out.println("Enter password");
		String pass = s.nextLine();
		Pattern pattern4 = Pattern.compile("^(?=.{8,})([a-z]*)(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).*$");
		Matcher matcher4 = pattern4.matcher(pass);
		boolean matchFound4 = matcher4.find();
		if(matchFound4)
			System.out.println("Valid passowrd");
		else
			System.out.println("Invalid password");
		
	}
}


