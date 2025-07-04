package A2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Statement st = new Statement();
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter a statement: ");
		String str = sc.nextLine();

		int op;
		do {
			System.out.println();
			System.out.println("Choose among the following: ");
			System.out.println("1. To calculate number of letters in the string");
			System.out.println("2. To calculate number of words in the string");
			System.out.println("3. To calculate number of digits in the string");
			System.out.println("4. To calculate number of vowels in the string");
			System.out.println("5. To calculate number of consonants in the string");
			System.out.println("6. To calculate number of sentences in the string");
			System.out.println("7. Exit");

			op = sc.nextInt();
			sc.nextLine(); // Consume the newline character left after nextInt()

			switch (op) {
			case 1:
				st.calc_charac(str);
				break;
			case 2:
				st.calc_words(str);
				break;
			case 3:
				st.calc_digit(str);
				break;
			case 4:
				st.calc_vow(str);
				break;
			case 5:
				st.calc_conso(str);
				break;
			case 6:
				st.calc_sent(str);
				break;
			case 7:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option! Please choose between 1 to 7");
				System.out.println();
			}
		} while (op != 7);
	}
}
