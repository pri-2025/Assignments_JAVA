package A3;

import java.util.*; //importing necessary package

public class Circles { // defining the class
	Circles() { // creating the contructor
//Taking input for radii of two circle
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius(in cm) of first circle - ");
		float r1 = sc.nextFloat();
		System.out.print("Enter radius(in cm) of second circle - ");
		float r2 = sc.nextFloat();
//calculating area and perimeter for first circle
		double a1 = 3.145 * r1 * r1;
		double p1 = 2 * 3.145 * r1;
		System.out.println("Area and perimeter of first circle is " + a1 + "square cm and " + p1 + "cm respectively");
//calculating area and perimeter for second circle
		double a2 = 3.145 * r2 * r2;
		double p2 = 2 * 3.145 * r2;
		System.out.println("Area and perimeter of second circle is " + a2 + "square cm and " + p2 + "cm respectively");
//comparing circles
		if (r1 > r2) {
			System.out.println("First circle is larger than second one");
		} else if (r2 > r1) {
			System.out.println("Second circle is larger than first one");
		} else {
			System.out.println("Circles are equal");
		}
	}
}