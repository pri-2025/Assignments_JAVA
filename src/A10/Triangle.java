package A10;

//Class to calculate area of a triangle, implements Shape interface
class Triangle implements Shape {

	double h, b_l, area;

	public void get_area() {
		System.out.print("Enter height of triangle: ");
		h = sc.nextDouble(); // Read height
		System.out.print("Enter base length of triangle: ");
		b_l = sc.nextDouble(); // Read base
		area = 0.5 * h * b_l; // Formula: 1⁄2 × base × height
//Validate inputs
		if (h >= 0) {
			if (b_l >= 0) {
				System.out.println("Area of triangle with height " + h + " and base length " + b_l + " is " + area);
				System.out.println();
			} else {
				System.out.println("Invalid base length!");
				System.out.println();
			}
		} else {
			System.out.println("Invalid height!");
			System.out.println();
		}
	}
}