package A8;

public class Main {
	public static void main(String[] args) {
//Creating objects of type "Sports" with instantiates of different classes

		Sports s1 = new Sports(); // object for "Sports" class
		Sports s2 = new Cricket(); // object for "Cricket" class
		Sports s3 = new Basketball(); // object for "Basketball" class
		Sports s4 = new Football(); // object for "Football" class
//invoking the "play" for all the objects
		s1.play(); // invoking the "play" method for "Sports" class
		s2.play(); // invoking the "play" method for "Cricket" class
		s3.play(); // invoking the "play" method for "Basketball" class
		s4.play(); // invoking the "play" method for "Football" class
	}
}
