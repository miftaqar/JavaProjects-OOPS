package com.primetgi.studentdatabaseapp;

import java.util.Scanner;

public class StudentDbApp {

	public static void main(String[] args) {

		// Asks how many new students want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create n number of Students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuitionFee();
			// System.out.println(students[i].showInfo());
			// System.out.println("----------------------");
		}

		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].showInfo());
			System.out.println("----------------------");
		}
	}

}
