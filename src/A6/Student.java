package A6;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int rollno;
	float[] marks = new float[5];
	int grade;

// Constructor
	public Student() {
	}

// Method to accept student details (name, roll number)
	public void accept_details() {
		System.out.print("Enter name of the student: ");
		this.name = sc.nextLine();
		System.out.print("Enter RollNo. of the student: ");
		this.rollno = sc.nextInt();
		sc.nextLine(); // Consume the newline left by nextInt()
	}

// Method to accept marks for 5 subjects
	public void accept_marks() {
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter marks of subject " + (i + 1) + ": ");
			this.marks[i] = sc.nextFloat();
		}
	}

// Method to calculate grade based on marks
	public void calc_grade() {
		float totalMarks = 0;
		for (float mark : marks) {
			totalMarks += mark;
		}
		float grade = totalMarks / 50; // Average of 5 subjects
	}

// Method to display top band students (grade >= 8)
	public void display_top_band_students() {

		if (grade >= 8) {
			System.out.println("Name: " + name);
			System.out.println("Roll No: " + rollno);
			System.out.println("Grade: " + grade);
			System.out.println();
		}
	}
}