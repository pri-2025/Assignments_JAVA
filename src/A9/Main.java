package A9;

import java.util.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// Create an ArrayList to store Employee objects
		List<Employee> employees = new ArrayList<>();
		double eid; // Variable to store Employee ID for searching or displaying salary
		boolean found; // Flag to check if employee is found during search
		int option; // Variable to store user choice from the menu
		do {
// Display the menu options for the user
			System.out.println("1. Create Employee");
			System.out.println("2. Display Employee details");
			System.out.println("3. Display Employee Gross Salary");
			System.out.println("4. Display Employee Take-home Salary");
			System.out.println("5. Search employee by ID");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Choose among the following: ");
			option = sc.nextInt(); // Get the user's choice
			System.out.println();
			switch (option) {
// Case 1: To create a new employee and add them to the list
			case 1:
				System.out.print("Enter number of employees: ");
				int n = sc.nextInt(); // Get the number of employees to be created
				System.out.println();
// Loop through the number of employees to create each employee
				for (int i = 0; i < n; i++) {
					Employee E1 = new Employee(); // Create a new Employee object for each employee

					E1.accept(); // Accept details for the employee (name, address, salary, etc.)
					employees.add(E1); // Add the newly created employee to the ArrayList

					System.out.println("Employee created successfully!");
					System.out.println();
				}
				break;
// Case 2: Display details of all employees in the list
			case 2:
// Loop through all employees and display their details
				for (Employee e : employees) {
					e.display(); // Call display() method of Employee to show details
					System.out.println();
				}
				System.out.println();
				break;
// Case 3: Display the gross salary of an employee by their ID
			case 3:
				System.out.print("Enter Employee ID to display gross salary: ");
				eid = sc.nextDouble(); // Get the employee ID for searching
				found = false; // Initialize the flag to false (no employee found yet)
// Search through the list of employees to find the matching ID
				for (Employee e : employees) {
					if (eid == e.Emp_Id) // If the employee's ID matches the input ID
					{
						found = true; // Set found flag to true
						System.out.println("Gross Salary for Employee ID " + eid + ": " + e.sal_gross); // Display gross
																										// salary

						break; // Exit the loop as the employee is found
					}
				}
// If no employee with the given ID is found, show a message
				if (!found) {
					System.out.println("Employee with ID " + eid + " not found.");
				}
				System.out.println();
				break;
// Case 4: Display the take-home salary of an employee by their ID
			case 4:
				System.out.print("Enter Employee ID to display take-home salary: ");
				eid = sc.nextDouble(); // Get the employee ID for searching
				found = false; // Initialize the flag to false (no employee found yet)
// Search through the list of employees to find the matching ID

				for (Employee e : employees) {
					if (eid == e.Emp_Id) // If the employee's ID matches the input ID
					{
						found = true; // Set found flag to true
						System.out.println("Take-home Salary for Employee ID " + eid + ": " +

								e.sal_take_home); // Display take-home salary

						break; // Exit the loop as the employee is found
					}
				}
// If no employee with the given ID is found, show a message
				if (!found) {
					System.out.println("Employee with ID " + eid + " not found.");
				}
				System.out.println();
				break;
// Case 5: Search and display an employee's details by their ID
			case 5:
				System.out.print("Enter Employee ID to search: ");
				eid = sc.nextDouble(); // Get the employee ID for searching
				found = false; // Initialize the flag to false (no employee found yet)
// Search through the list of employees to find the matching ID
				for (Employee e : employees) {
					if (eid == e.Emp_Id) // If the employee's ID matches the input ID
					{
						found = true; // Set found flag to true
						e.display(); // Display employee details
						break; // Exit the loop as the employee is found
					}
				}
// If no employee with the given ID is found, show a message
				if (!found) {
					System.out.println("Employee with ID " + eid + " not found.");
				}
				System.out.println();
				break;
// Case 6: Exit the program
			case 6:
				System.out.println("Exiting..."); // Print a message indicating exit
				System.out.println();
				break;

// Default case: If the user enters an invalid option
			default:
				System.out.println("Invalid option. Please try again."); // Print an error message for invalid input
				System.out.println();
			}
		} while (option != 6); // Continue the loop until the user chooses to exit (option 6)
	}
}