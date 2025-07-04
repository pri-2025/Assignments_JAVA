package A2;

public class Statement {
	int i = 0;
	int charac = 0;
	int words = 1;
	int digits = 0;
	int vow = 0;
	int conso = 0;
	int sent = 0;

	// to calculate number of letters in the string
	public void calc_charac(String str) {
		for (i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				charac += 1;
			}
		}
		System.out.println("Number of letters in the string are: " + charac);
		System.out.println();
	}

	// to calculate number of words in the string
	public void calc_words(String str) {
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= ' ') {
				words += 1;
			}
		}
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digits += 1;
			}
		}
		words = words - digits;
		System.out.println("Number of words in the string are: " + (words));
		System.out.println();
	}

	// to calculate number of digits in the string
	public void calc_digit(String str) {
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digits += 1;
			}
		}
		System.out.println("Number of digits in the string are: " + digits);
		System.out.println();
	}

	// to calculate number of vowels in the string
	public void calc_vow(String str) {
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vow += 1;
			}
		}
		System.out.println("Number of vowels in the string are: " + vow);
		System.out.println();
	}

	// to calculate number of consonants in the string
	public void calc_conso(String str) {
		for (i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				vow += 1;
				conso = charac - vow;
			}
		}

		System.out.println("Number of consonants in the string are: " + conso);
		System.out.println();
	}

	// to calculate number of consonants in the string
	public void calc_sent(String str) {
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				sent += 1;
			}
		}
		System.out.println("Number of sentences in the string are: " + sent);
		System.out.println();
	}
}
