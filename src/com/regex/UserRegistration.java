package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static String firstNameRE = "[a-zA-z]*";
	static String lastNameRE = "[a-zA-z]*";
	static String emailRE = "[a-zA-z0-9][a-zA-Z0-9+_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";
//	static String emailRE ="^[a-zA-Z0-9.*]+@[a-zA-Z]+.[a-zA-Z]{2,4}\\.[a-z]{2,}$";
//	static String emailRE = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
//	static String passwordRE = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
	static String passwordRE = "^(?=.*[0-9])+(?=.*[a-z])+(?=.*[A-Z])+(?=.*[@#$%^&-+=()])+(?=\\S+$).{8}$";
	
	
	public static boolean firstName(String firstName) {
		Pattern p = Pattern.compile(firstNameRE);
		Matcher m = p.matcher(firstName);
		return m.matches();
		
		}
	public static boolean lastName(String lastName) {
		Pattern p = Pattern.compile(lastNameRE);
		Matcher m = p.matcher(lastName);
		return m.matches();
		}
	public static boolean email(String email) {
//		Pattern p = Pattern.compile(emailRE);
//		Matcher m = p.matcher(email);
//		return m.matches();
		
      return email.matches(emailRE);
		}
	
	public static boolean password(String password) {
		
		return password.matches(passwordRE);
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your first name: ");
	    String first = sc.next();
	    System.out.println("Enter your last name: ");
	    String last = sc.next();	    
	    System.out.println("Enter your email id: ");
	    String email = sc.next();
	    System.out.println("Enter your password: ");
	    String password = sc.next();
	    UserRegistration obj = new UserRegistration();
	    System.out.println(obj.firstName(first));
	    System.out.println(obj.lastName(last));
	    System.out.println(obj.email(email));
	    System.out.println(obj.password(password));
	   
//		System.out.println("First name: " +firstName("Lisa"));
//		System.out.println("Last name: " +lastName("Das"));
//		System.out.println("email: " +email("lisa.das@gmail.co.in"));

	}
}
