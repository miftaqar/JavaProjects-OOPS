package com.primetgi.studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1001;

	// Constructor : prompt new user and grade year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Student FirstName");
		this.firstName = in.nextLine();

		System.out.println("Enter Student LastName");
		this.lastName = in.nextLine();

		System.out
				.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter School Level");
		this.gradeYear = in.nextInt();

		setStudentId();

	}

	// Generate an ID
	public void setStudentId() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q or q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equalsIgnoreCase("q")) {
				courses = courses + "\n " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your Tuition Balance is: $" + tuitionBalance);
	}

	// Pay Tuition
	public void payTuitionFee() {
		viewBalance();
		System.out.println("Enter the amount you want to pay: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment: $" + payment);
	}

	// Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + "\nGrade Level: "
				+ gradeYear + "\nStudentId: " + studentID
				+ "\nCourses Enrolled in: " + courses + "\nBalance: "
				+ tuitionBalance;
	}

}
