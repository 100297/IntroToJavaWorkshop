package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
		JOptionPane.showInputDialog("You throw a rock like a (Enter Adjective)...");
		// Get the user to enter a type of liquid
		JOptionPane.showInputDialog("You walk across the (enter LIQUID)...");
		// Get the user to enter a body part
		JOptionPane.showInputDialog("Pirahnas crawl on your (enter body part)");
		// Get the user to enter a verb
		JOptionPane.showInputDialog("You try and (enter verb)");
		// Get the user to enter a place
		JOptionPane.showInputDialog("You wake up and find yourself in (enter place)");
		// Fit the user's words into this sentence, and save it in a String:
		String ok= JOptionPane.showInputDialog("You throw a rock like a (Enter Adjective) on the boat.You walk across the (enter LIQUID) but then you fall.Pirahnas crawl on your (enter body part).You try and (enter verb) but fail again).You wake up and find yourself in (enter place)"); 
		// Piranhas are more [adjective] during the day, so cross the river at
		
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		
		// likely take a bite out of your [body part] if you [verb]. Whatever
		
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

