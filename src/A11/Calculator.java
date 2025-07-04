package A11;

import java.util.*;

//Calculator class to perform basic arithmetic operations
public class Calculator {
	double a, b; // Instance variables to store input numbers
	Scanner sc = new Scanner(System.in); // Scanner to read user input
//Method to perform addition

	public void add() {
		System.out.print("Enter first no.: ");
		a = sc.nextDouble();
		System.out.print("Enter second no.: ");
		b = sc.nextDouble();
		double sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		System.out.println();
	}

//Method to perform subtraction
	public void sub() {
		System.out.print("Enter first no.: ");
		a = sc.nextDouble();
		System.out.print("Enter second no.: ");
		b = sc.nextDouble();
		double diff = a - b;
		System.out.println("Difference of " + a + " and " + b + " is " + diff);
		System.out.println();
	}

//Method to perform multiplication
	public void mul() {
		System.out.print("Enter first no.: ");
		a = sc.nextDouble();
		System.out.print("Enter second no.: ");
		b = sc.nextDouble();
		double prod = a * b;
		System.out.println("Product of " + a + " and " + b + " is " + prod);
		System.out.println();
	}

//Method to perform division with exception handling
	public void div() {
		System.out.print("Enter first no.: ");
		a = sc.nextDouble();
		System.out.print("Enter second no.: ");
		b = sc.nextDouble();
		try {
			if (b == 0) {
				throw new ArithmeticException("Cannot divide by zero!");
			}
			double quotient = a / b;
			System.out.println("Quotient of " + a + " and " + b + " is " + quotient);
			System.out.println();
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println();
		}
	}
}