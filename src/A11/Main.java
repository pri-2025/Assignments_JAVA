package A11;

import java.util.*;

//Main class with the main() method to run the calculator
public class Main {
	public static void main(String[] args) {
		Calculator C1 = new Calculator(); // Create calculator object
		Scanner sc = new Scanner(System.in);
		int op; // Variable to store user choice
		do {
//Display menu
			System.out.println("Choose operation :-");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println();
			System.out.print("Enter your choice: ");
			op = sc.nextInt();
			System.out.println();
//Use switch to call corresponding method
			switch (op) {
			case 1:
				C1.add();
				break;
			case 2:
				C1.sub();
				break;
			case 3:
				C1.mul();
				break;
			case 4:
				C1.div();
				break;

			case 5:
				System.out.println("Exiting..");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (op != 5); // Keep running until user enters 5 (exit condition)
	}
}