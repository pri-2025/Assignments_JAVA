package A6;

import java.util.*;

public class Main {
	public static void main(String args[]) {
// List to store students
		List<Student> students = new ArrayList<>();
// Create 10 students and accept data
		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			s.accept_details();
			s.accept_marks();
			s.calc_grade();
			students.add(s);
		}
// Display top band students
		System.out.println("\nTop Band Students:");
		for (Student student : students) {
			student.display_top_band_students();
		}
	}
}