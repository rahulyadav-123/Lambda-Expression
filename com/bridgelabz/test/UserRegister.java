package com.bridgelabz.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
	public String firstName(String firstName) {	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName);
		if(match.find() && match.group().equals(firstName)) {
			System.out.println("valid FirstName");	
			}
		else {
			System.out.println("invalid FirstName");
			}
		return firstName;
        }
		
	
	public String lastName(String lastName) {	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(lastName);
		if(match.find() && match.group().equals(lastName)) {
			System.out.println("valid LastName");	
			}
		else {
			System.out.println("invalid lastName");
			}
		return lastName;
        }
	public String emailId(String emailId) {	
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
		Matcher match = pattern.matcher(emailId);
		if(match.find() && match.group().equals(emailId)) {
			System.out.println("valid Email");	
			}
		else {
			System.out.println("invalid Email");
			}
		return emailId;
        }
}


