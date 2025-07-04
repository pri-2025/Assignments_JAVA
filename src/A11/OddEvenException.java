package A11;

//Custom exception class that extends the built-in Exception class
public class OddEvenException extends Exception {
//Constructor for the custom exception, which accepts a message as an argument
	OddEvenException(String s) {
		super(s); // Pass the message to the parent class (Exception) constructor
	}
}