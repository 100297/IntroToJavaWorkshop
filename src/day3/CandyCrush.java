package day3;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String ok=JOptionPane.showInputDialog("Who do you want to kill?"); 
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend
		String alright=JOptionPane.showInputDialog("Who is your favorite person?");
		// 4. Tell them their best friend is as sweet as candy
		
	} 
}



