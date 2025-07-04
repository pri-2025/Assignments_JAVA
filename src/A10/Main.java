package A10;

import java.util.*;

//Main class to run the program
public class Main {
	public static void main(String[] args) {
//Create objects of all shapes
		Circle S1 = new Circle();
		Rectangle S2 = new Rectangle();
		Triangle S3 = new Triangle();
		Scanner sc = new Scanner(System.in);
		int op; // User option
//Menu loop
		do {
//Display menu options
			System.out.println("1. Calculate area of a circle");
			System.out.println("2. Calculate area of a rectangle");
			System.out.println("3. Calculate area of a triangle");
			System.out.println("4. Exit");
			System.out.print("Choose among the following :- ");
			op = sc.nextInt();
			System.out.println();
//Perform corresponding action
			switch (op) {
			case 1:
				S1.get_area(); // Circle area
				break;
			case 2:
				S2.get_area(); // Rectangle area
				break;
			case 3:
				S3.get_area(); // Triangle area

				break;
			case 4:
				System.out.println("Exiting..."); // Exit message
				break;
			default:
				System.out.println("Invalid option! Please enter again.");
			}
		} while (op != 4); // Exit condition
	}
}