package day5;

import java.util.Random;

import javax.swing.JOptionPane;

public class tin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
 	String number = JOptionPane.showInputDialog("What is " + r .nextInt(70) + "+ 0");
   String answer =  JOptionPane.showInputDialog("What is " + number + " times 5");
  if (Integer.parseInt(number) * 5 == Integer.parseInt(answer)) {
	JOptionPane.showMessageDialog(null,"YOU got it right");
}
		
  else {
	JOptionPane.showMessageDialog(null, "The answer you got was wrong");
  }
	
	
	}

}
