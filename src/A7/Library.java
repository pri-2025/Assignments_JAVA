package A7;

import java.util.*;

public class Library {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> book_name = new ArrayList<>();
	ArrayList<Integer> book_ID = new ArrayList<>();
	ArrayList<String> book_author_name = new ArrayList<>();
	ArrayList<Boolean> book_issued = new ArrayList<>();

	public void add_book() {
		System.out.print("Enter the number of books you want to add: ");
		int n = sc.nextInt();
		sc.nextLine(); // Consume the newline character left by nextInt()
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name of the book " + (i + 1) + " : ");
			book_name.add(sc.nextLine());
			System.out.print("Enter book ID of the book " + (i + 1) + " : ");
			book_ID.add(sc.nextInt());
			sc.nextLine(); // Consume the newline character
			System.out.print("Enter name of the author of book " + (i + 1) + " : ");
			book_author_name.add(sc.nextLine());
			book_issued.add(false); // Initially, books are not issued

			System.out.println();
		}
	}

	public void display_books() {
		if (book_name.isEmpty()) {
			System.out.println("No books available in the library.");
			return;
		}
		for (int i = 0; i < book_name.size(); i++) {
			System.out.println("Book " + (i + 1) + ":");
			System.out.println("Name: " + book_name.get(i));
			System.out.println("ID: " + book_ID.get(i));
			System.out.println("Author: " + book_author_name.get(i));
			System.out.println("Issued: " + (book_issued.get(i) ? "Yes" : "No"));
			System.out.println();
		}
	}

	public void remove_book() {
		System.out.print("Enter the name of the book to be removed: ");
		String b_name = sc.nextLine();
		boolean found = false;
		for (int i = 0; i < book_name.size(); i++) {
			if (book_name.get(i).equals(b_name)) {
				found = true;
// Remove the book from all lists
				book_name.remove(i);
				book_ID.remove(i);
				book_author_name.remove(i);
				book_issued.remove(i);
				System.out.println("Book '" + b_name + "' has been removed.");
				break;

			}
		}
		if (!found) {
			System.out.println("Book not found!");
		} else {
			display_books();
		}
	}

	public void issue_book() {
		display_books();
		System.out.print("Enter the name of the book to be issued: ");
		String b_name = sc.nextLine();
		boolean found = false;
		for (int i = 0; i < book_name.size(); i++) {
			if (book_name.get(i).equals(b_name)) {
				found = true;
				if (book_issued.get(i)) {
					System.out.println("Book '" + b_name + "' is already issued.");
				} else {
					book_issued.set(i, true); // Mark the book as issued
					System.out.println("Book '" + b_name + "' has been issued.");
				}
				break;
			}
		}
		if (!found) {
			System.out.println("Book not found!");
		}
	}
}