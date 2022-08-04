package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REUserInput {
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your email id: ");
      String email = sc.next();
      String lastNameRE = "[a-zA-z]*";
      String emailRE = "[a-zA-z0-9][a-zA-Z0-9+_.]*@[a-zA-Z0-9]+([.][a-zA-z]+)+";

      Pattern pattern = Pattern.compile(emailRE);
    
      Matcher matcher = pattern.matcher(email);
     
      if(matcher.matches()) {
         System.out.println("Given email id is valid");
      } else {
         System.out.println("Given email id is not valid");
      }
   }
}