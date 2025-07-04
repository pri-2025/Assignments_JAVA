package A1;

import java.util.*; //importing theb package

public class MyDate { // defining the MyDate class
	public static void main(String[] args) { // defining the main class
//Creating 5 new objects
		MyDate d1 = new MyDate();
		MyDate d2 = new MyDate();
		MyDate d3 = new MyDate();
		MyDate d4 = new MyDate();
		MyDate d5 = new MyDate();
//Calling those 5 objects
		d1.accept_date();
		d2.accept_date();
		d3.accept_date();
		d4.accept_date();
		d5.accept_date();
	}

//creating the method for accepting date from user
	void accept_date() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day - "); // accepting the day
		int day = sc.nextInt();
		System.out.print("Enter month - ");// accepting the month
		int month = sc.nextInt();
		System.out.print("Enter year - ");// accepting the year
		int year = sc.nextInt();
//applying the limiattions
		if ((day > 0 && day < 32) && (month > 0 && month < 13) && (year > 999 && year < 10000)) {
			System.out.println("Date - " + day + "/" + month + "/" + year);// displaying the date.
		}
	}
}