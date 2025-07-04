package A10;

import java.util.*;

//Interface to define a method for calculating area
public interface Shape {
//Abstract method to be implemented by all shapes
	public void get_area();

//Shared scanner object for taking input
	Scanner sc = new Scanner(System.in);
}
