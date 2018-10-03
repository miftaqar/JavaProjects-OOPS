package com.primetgi.emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String companySuffix = "abCompany.com";

	// Constructor to receive the firstName and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("Email Created: " + this.firstName + " "
		// + this.lastName);

		// Call for method that returns the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// Call for method to Generate Random Password
		this.password = generateRandomPassword(defaultPasswordLength);
		//System.out.println("Your Password: " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
				+ department.toLowerCase() + "." + companySuffix;
		//System.out.println("Your email is: " + email);
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
		// return String.valueOf(password);
	}

	// set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email address
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public String getAlteranateEmail() {
		return alternateEmail;
	}

	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}

	public String getChangedPassword() {
		return password;
	}

	public String showInfo() {
		return "Full Name: " + firstName + " " + lastName
				+ "\n Company Email: " + email + "\nPassword: " + password
				+ "\n Mailbox Capacity: " + mailboxCapacity + "mb";

	}
}
