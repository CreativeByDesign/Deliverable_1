import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eventType;
		int partySize;
		String result = "Since your event is";
		String msg = null;
		String msgOne = null;
		Scanner readme = new Scanner(System.in);
		var dineOne = "you should make sandwiches";
		var dineTwo = "you should make Fried Chicken";
		var dineThree = "you should make Chicken Parmesan";
		
		

		System.out.println("Please chose an event type. casual, semi-formal, or formal");
		eventType = readme.nextLine();

		
		if (eventType.equals("casual")) {
		    msgOne = dineOne;
			
		} 
		else if (eventType.equals("semi-formal")) {
			msgOne =  dineTwo;
		} 
		else if (eventType.equals("formal")) {
			msgOne = dineThree;
			
		} 
		else {
			System.out.println("The event you have selected is not an option.");
		}
		System.out.println("How many people will attending?");
		partySize = readme.nextInt();
		
		System.out.println(result + " " + eventType + " with the party size of "+ partySize);
	

		if (partySize == 1) {
			msg = ", and I give you permission to throw that food in the microwave. ";
		}
		else if (partySize <= 12) {
			msg = " in your kitchen.";
		}

		else {
			msg = ", but let a caterer take care of that for you.";
		}
	
		System.out.println(" " + msgOne + msg);	
	}
}