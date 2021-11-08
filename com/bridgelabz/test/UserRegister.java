package com.bridgelabz.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegister {
	public String firstName(String firstName) throws InvalidException{	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(firstName);
		try {
			if(match.find() && match.group().equals(firstName)) {
				System.out.println("Entered FirstName is valid\n");	
			}
			else {
				throw new InvalidException("Entered FirstName is Invalid\n");
			}
		}
		catch(InvalidException e) {
			System.out.println("Exception occured :" + e);
		}
		return firstName;
	}
		
	
	public String lastName(String lastName) throws InvalidException{	
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher match = pattern.matcher(lastName);
		try {
			if(match.find() && match.group().equals(lastName)) {
				System.out.println("Entered lastName is valid\n");	
			}
			else {
				throw new InvalidException("Entered lastName is Invalid\n");
			}
		}
		catch(InvalidException e) {
			System.out.println("Exception occured :" + e);
		}
		return lastName;
	}
	
	public String emailId(String emailId) throws InvalidException{	
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]*[a-zA-Z0-9]?@[a-zA-Z0-9]+.([.][a-zA-Z]+)+$");
		Matcher match = pattern.matcher(emailId);
		try {
			if(match.find() && match.group().equals(emailId)) {
				System.out.println("Entered Email is valid\n");	
			}
			else {
				throw new InvalidException("Entered Email is Invalid\n");
			}
		}
		catch(InvalidException e) {
			System.out.println("Exception occured :" + e);
		}
		return emailId;
    }
	
	public String phoneNumber(String phonenumber) throws InvalidException{	
		Pattern pattern = Pattern.compile("^(\\d{1,2}?)[- .]?\\d{9,10}$");
		Matcher match = pattern.matcher(phonenumber);
		try {
			if(match.find() && match.group().equals(phonenumber)) {
				System.out.println("Entered phoneNumber is valid\n");	
			}
			else {
				throw new InvalidException("Entered phoneNumber is Invalid\n");
			}
		}
		catch(InvalidException e) {
			System.out.println("Exception occured :" + e);
		}
		return phonenumber;
	}
	
	public String password(String password) throws InvalidException{
		Pattern pattern = Pattern.compile("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[\\w\\d]).{8,}$");
		Matcher match = pattern.matcher(password);
		try {
			if(match.find() && match.group().equals(password)) {
				System.out.println("Entered password is valid\n");	
			}
			else {
				throw new InvalidException("Entered password is Invalid\n");
			}
		}
		catch(InvalidException e) {
			System.out.println("Exception occured :" + e);
		}
		return password;
	}
}


