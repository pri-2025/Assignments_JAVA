package A7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		Library L1 = new Library();
		do {
			System.out.println("Choose the action - ");
			System.out.println("1.) Add book ");
			System.out.println("2.) Display books");
			System.out.println("3.) Remove book");
			System.out.println("4.) Issue book");
			System.out.println("5.) Exit");
			op = sc.nextInt();
			sc.nextLine(); // Consume the newline character
			switch (op) {
			case 1:
				L1.add_book();
				break;
			case 2:
				L1.display_books();
				break;
			case 3:
				L1.remove_book();
				break;
			case 4:
				L1.issue_book();

				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option, try again!");
			}
		} while (op != 5);
	}
}