package com.primetgi.emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 10;

	// Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created: " + this.firstName + " "
				+ this.lastName);

		// Call for method that returns the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		this.password = generateRandomPassword(defaultPasswordLength);
		System.out.println("Your Password: " + this.password);
	}

	// Ask for Department
	private String setDepartment() {
		System.out
				.println("Department Codes: \n1 For Sales \n2 For Developemnt \n3 For Accounting \n0 For None \n Enter Department Code");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) {
			return "Sales";
		} else if (departmentChoice == 2) {
			return "Development";
		} else if (departmentChoice == 3) {
			return "Accounts";
		} else {
			return "";
		}

	}

	// Generate Random Password
	private String generateRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int randomNum = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomNum);
		}
		return new String(password);
		//return String.valueOf(password);
	}

	// set the mailbox capacity

	// set the alternate email address

	// change the password

}
