package A4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TrafficSignal T1 = new TrafficSignal();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter traffic light colour: ");
		String color = sc.nextLine();

		T1.colorChange(color);
	}

}
