package A5;

import java.util.Scanner;

public class Complex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		System.out.println("Enter first complex number:");
		c1.input();
		System.out.println("Enter second complex number:");
		c2.input();
		System.out.println("First Complex Number:");
		c1.display();
		System.out.println("Second Complex Number:");
		c2.display();
		int choice;
		do {
			System.out.println("\nChoose an operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Result of Addition: ");
				c1.add(c1, c2);
				break;
			case 2:
				System.out.println("Result of Subtraction: ");

				c1.subtract(c1, c2);
				break;
			case 3:
				System.out.println("Result of Multiplication: ");
				c1.multiply(c1, c2);
				break;
			case 4:
				System.out.println("Result of Division: ");
				c1.divide(c1, c2);
				break;
			case 5:
				System.out.println("You have decided to exit:(");
				break;
			default:
				System.out.println("Invalid choice!Choose a number from 1 to 5 please:)");
			}
		} while (choice != 5);
	}
}