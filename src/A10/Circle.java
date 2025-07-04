package A10;

class Circle implements Shape {
	double r, area;

	public void get_area() {
		System.out.print("Enter radius of the circle: ");
		r = sc.nextDouble(); // Read radius input from user
		area = 3.142 * r * r; // Formula for area of circle: πr2
// Validate radius input
		if (r >= 0) {
			System.out.println("Area of circle with radius " + r + " is " + area);
			System.out.println();
		} else {
			System.out.println("Invalid radius!");

			System.out.println();
		}
	}
}