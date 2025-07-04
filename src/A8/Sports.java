package A8;

import java.util.*;

//creating the base class "Sports"
public class Sports {
//creating the "play" method
	public void play() {
		System.out.println("One team, one sport, one victory!");
	}
}

//extending "Cricket" class from "Sports" class
class Cricket extends Sports {
//Overriding "play" method for "Cricket" class
	public void play() {
		System.out.println("We're not just cricketers, we're cricket legends in the making!");
	}
}

//extending "Cricket" class from "Sports" class
class Basketball extends Sports {
//Overriding "play" method for "Cricket" class
	public void play() {
		System.out.println("Basketball doesn't build character, it reveals one.");
	}
}

//extending "Cricket" class from "Sports" class
class Football extends Sports {
//Overriding "play" method for "Cricket" class
	public void play() {
		System.out.println("Football: Where passion meets the pitch!");
	}
}
