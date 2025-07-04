package A4;

public class TrafficSignal {
	String color;

	TrafficSignal() {

	}

	public void colorChange(String color) {
		for (int i = 0; i < color.length(); i++) {
			if (color.charAt(i) == 'r' && color.charAt(i + 1) == 'e' && color.charAt(i + 2) == 'd') {
				System.out.println("Stop your vehicle!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Yellow");
				System.out.println("Be ready!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Green");
				System.out.println("Go!!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Red");
				System.out.println("Stop!");
			} else if (color.charAt(i) == 'y' && color.charAt(i + 1) == 'e' && color.charAt(i + 2) == 'l'
					&& color.charAt(i + 3) == 'l' && color.charAt(i + 4) == 'o' && color.charAt(i + 5) == 'w') {
				System.out.println("Be Ready");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Green");
				System.out.println("Go!!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Green");
				System.out.println("Go!!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Red");
				System.out.println("Stop!");
			} else if (color.charAt(i) == 'g' && color.charAt(i + 1) == 'r' && color.charAt(i + 2) == 'e'
					&& color.charAt(i + 3) == 'e' && color.charAt(i + 4) == 'n') {
				System.out.println("GO!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}
				System.out.println("Red");
				System.out.println("Stop!");
				for (int j = 5; j > 0; j--) {
					System.out.println(j);
				}

			}
		}
	}
}
