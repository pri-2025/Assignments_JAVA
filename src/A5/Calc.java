package A5;

import java.util.Scanner;

class Calc {
	double real, imag;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.print("Enter real part: ");
		real = sc.nextDouble();
		System.out.print("Enter imaginary part: ");
		imag = sc.nextDouble();
	}

	void display() {
		System.out.println(real + " + i(" + imag + ")");
	}

	void add(Calc c1, Calc c2) {

		System.out.println((c1.real + c2.real) + "+ i(" + (c1.imag + c2.imag) + ")");
	}

	void subtract(Calc c1, Calc c2) {
		System.out.println((c1.real - c2.real) + "+ i(" + (c1.imag - c2.imag) + ")");
	}

	void multiply(Calc c1, Calc c2) {
		System.out.println(((c1.real * c2.real) - (c1.imag * c2.imag)) + "+ i("
				+ ((c1.real * c2.imag) + (c2.real * c1.imag)) + ")");
	}

	void divide(Calc c1, Calc c2) {
		double divreal = ((c1.real * c2.real) + (c1.imag * c2.imag)) / ((c2.real * c2.real) + (c2.imag * c2.imag));
		double divimag = ((c1.imag * c2.real) + (c1.real * c2.imag)) / ((c2.real * c2.real) + (c2.imag * c2.imag));
		System.out.println(divreal + "+ i(" + divimag + ")");
	}
}