package A11;

import java.util.*;

//Main class where the program execution starts
public class Odd_Even {
//Method to check whether a given number is even or odd
//It takes a 'double' as input, which can handle decimal numbers
	public static void check(double n) throws OddEvenException {
//Check if the number is odd (i.e., not divisible by 2)
		if (n % 2 != 0) {

//If the number is odd, throw a custom exception with an appropriate message
			throw new OddEvenException("Number must be even!");
		} else {
//If the number is even, print the number
			System.out.print("Entered number is: " + n);
		}
	}

	public static void main(String[] args) {
		try {
//Create a scanner object to take input from the user
			Scanner sc = new Scanner(System.in);
//Prompt the user to enter a number
			System.out.print("Enter a number: ");
//Read the number as a double (can be a whole number or decimal)
			double n = sc.nextDouble();
//Call the 'check' method to check if the number is even or odd
			check(n);
		}
//Catch the custom exception if the number is odd
		catch (OddEvenException e) {
//Print the error message associated with the exception
			System.out.println("Error: " + e.getMessage());
		}
	}
}