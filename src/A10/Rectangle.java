package A10;

class Rectangle implements Shape {
	double len, wid, area;

	public void get_area() {
		System.out.print("Enter length of rectangle: ");
		len = sc.nextDouble(); // Read length
		System.out.print("Enter width of rectangle: ");
		wid = sc.nextDouble(); // Read width
		area = len * wid; // Formula: length × width
// Validate inputs
		if (len >= 0) {
			if (wid >= 0) {
				System.out.println("Area of rectangle with length " + len + " and width " + wid + " is " + area);
				System.out.println();
			} else {
				System.out.println("Invalid width!");
				System.out.println();
			}
		} else {
			System.out.println("Invalid length!");
			System.out.println();
		}
	}
}