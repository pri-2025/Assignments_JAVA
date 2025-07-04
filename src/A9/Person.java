package A9;

import java.util.*;

//Person class represents a person with a name and address
public class Person {
//Instance variables
	String name;
	String address;
	Scanner sc = new Scanner(System.in);

//Constructor to initialize name and address
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

//Default constructor
	Person() {
	}

//Method to build a full address for a person
	void address_full() {
//Temporary variables to hold address components
		String block_num;
		int flat_num;
		String apartment_name;
		String area;
		String city;
		double pincode;
//Input details for the address
		System.out.print("Enter apartment name: ");
		apartment_name = sc.nextLine();

		sc.nextLine();
		System.out.print("Enter block no.: ");
		block_num = sc.nextLine();
		System.out.print("Enter flat no.: ");
		flat_num = sc.nextInt();
		System.out.print("Enter area: ");
		area = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter city: ");
		city = sc.nextLine();
		System.out.print("Enter pin-code: ");
		pincode = sc.nextDouble();
		sc.nextLine(); // To consume any leftover newline character
//Construct the full address string
		address = block_num + "-" + flat_num + " " + apartment_name + ", " + area + "," + "," + city + ", " + pincode;
	}

//Method to accept person's details (name and address)
	void accept() {
//Accept name input
		System.out.print("Enter name of the person: ");
		name = sc.nextLine();
	}

//Method to display person's details (name and address)
	void display() {
//Display the name and address of the person
		System.out.println("Name of the person: " + name);
		System.out.println("Address of the person: " + address);
	}
}

//Employee class extends the Person class to include employee-specific details
class Employee extends Person {
//Instance variables specific to an employee
	double Emp_Id;
	int grade;
	String designation;
	double sal_basic;
	double hra;

	double da;
	double sal_gross;
	double income_tax;
	double sal_take_home;

//Constructor to initialize employee details along with salary calculations
	public Employee(double Emp_Id, int grade, double sal_basic, String designation) {
		this.Emp_Id = Emp_Id;
		this.grade = grade;
		this.sal_basic = sal_basic;
		this.designation = designation;
//Calculate salary components
		sal_gross();
		sal_take_home();
	}

//Default constructor
	Employee() {
	}

//Method to calculate gross salary (basic + HRA + DA)
	void sal_gross() {
//HRA and DA are calculated as a percentage of the basic salary
		hra = 0.2 * sal_basic;
		da = 0.45 * sal_basic;
//Total gross salary
		sal_gross = sal_basic + hra + da;
	}

//Method to calculate take-home salary after income tax deduction
	void sal_take_home() {
//First, calculate the gross salary
		sal_gross();
//Display gross salary
		System.out.println("Gross salary for the person: " + sal_gross);
//Income tax is 7% of the basic salary
		income_tax = 0.07 * sal_basic;
//Calculate take-home salary after deducting income tax
		sal_take_home = sal_gross - income_tax;
//Display take-home salary
		System.out.println("Take home salary for the person: " + sal_take_home);

	}

//Method to accept employee details (calls accept() from Person class as well)
	void accept() {
//Accept personal details (name and address) from the Person class
		super.accept();
//Accept employee-specific details
		System.out.print("Enter Employee ID of the person: ");
		Emp_Id = sc.nextDouble();
		System.out.print("Enter Grade of the person: ");
		grade = sc.nextInt();
		System.out.print("Enter designation of the person: ");
		designation = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Basic salary of the person: ");
		sal_basic = sc.nextDouble();
//Call address_full() method to get address details
		address_full();
	}

//Method to display employee details (calls display() from Person class as well)
	void display() {
//Display personal details from the Person class
		super.display();
//Display employee-specific details
		System.out.println("Employee ID of the person: " + Emp_Id);
		System.out.println("Grade of the person: " + grade);
		System.out.println("Designation of the person: " + designation);
//Display salary details
		sal_gross();
		sal_take_home();
	}
}