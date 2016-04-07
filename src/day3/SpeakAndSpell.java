package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
              speak("spell pneumonoultramicroscopicsilicovolcanoconiosis");
		
String answer = JOptionPane.showInputDialog("spell this word");
		
         if (answer.equals("pneumonoultramicroscopicsilicovolcanoconiosis")) {
        	 speak("Correct");
		}
		
         else {
		// 5. repeat the process for other words
		speak("You are wrong");
	}
	
	 speak("spell doldrums");
		
	 String ans = JOptionPane.showInputDialog("spell this word");
	 		
	          if (ans.equals("doldrums")) {
	         	 speak("Correct");
	 		}
	 		
	          else {
	 		// 5. repeat the process for other words
	 		speak("You are wrong");
	 	}


	     	 speak("spell disestablishmentarieanism");
	     		
	     	 String an = JOptionPane.showInputDialog("spell this word");
	     	 		
	     	          if (an.equals("disestablishmentarieanism")) {
	     	         	 speak("Correct");
	     	 		}
	     	 		
	     	          else {
	     	 		// 5. repeat the process for other words
	     	 		speak("You are wrong");
	     	 	}
	}
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


