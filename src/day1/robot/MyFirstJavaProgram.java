package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		
		
		Robot R2D2 = new Robot ();
		
		R2D2.setSpeed(100);
		R2D2.setPenColor(255,0,0);
		R2D2.penDown();
		R2D2.sparkle();
		int degree = 60;
		for (int i = 0; i <6; i++) {
			R2D2.move(100);
		    R2D2.turn(degree);	
		
		
		} 
		
		
		for (int i = 0; i <6; i++) {
		R2D2.move(50);
	    R2D2.turn(degree);
	   
		}
	}
}
