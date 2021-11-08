package com.labz.test;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.test.InvalidException;

public class UserRegister {
	
	@Test
	public void givenFirstName_isProper() throws InvalidException {
		UserRegister register = new UserRegister();
		String actual = register.firstName("Rahul");
		Assert.assertEquals("Rahul", actual);
	}
	
	@Test
	public void givenLastName_isProper() throws InvalidException {
		UserRegister register = new UserRegister();
		String actual = register.lastName("Yadav");
		Assert.assertEquals("Yadav", actual);
	}
	
	@Test
	public void givenEmailId_isProper() throws InvalidException {
		UserRegister register = new UserRegister();
		String actual = register.emailId("ry219613@@gmail.com");
		Assert.assertEquals("ry219613@gmail.com", actual);
	}
	
	@Test
	public void givenPhoneNumber_isProper() throws InvalidException {
		UserRegister register = new UserRegister();
		String actual = register.phoneNumber("7385932865");
		Assert.assertEquals("7385932865", actual);
	}
	
	@Test
	public void givenPassword_isProper() throws InvalidException {
		UserRegister register = new UserRegister();
		String actual = register.password("vAvc3@ttaay");
		Assert.assertEquals("vAvc3@ttaay", actual);
	}

}
