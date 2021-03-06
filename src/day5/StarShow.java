package day5;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		drawStar(150);
		// 13. Set the speed to 8
            robot.setSpeed(10);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
         int robotx = robot.getX();
		// 7. Make a variable to hold the Y position of the Robot and set it to 950
         int robotY = robot.getY();
		// 8. Make a variable to hold the star size and set it to 25
int starSize = 25;
		// 12. Repeat the steps #19 to #18, 30 times
                 for (int i = 0; i <30; i++) {
					
				
			// 19. Set the pen width to i 
	
                 }
			// 10. Set the X position of the robot to your X variable
	           robot.setX(robotx);
			// 11. Set the Y position of the robot to your Y variable
	           robot.setY(robotY);
			// 9. Call the drawStar() method with your star size variable
drawStar(starSize);	
			// 14. Increase the X position by star size. See Figure 2.
	         robotx += starSize;
			// 15. decrease the Y position by star size. See Figure 3.
robotY -= starSize;	
			// 16. Increase the star size by 20
starSize += 20;	
			// 17. Turn the robot 12 degrees
robot.turn(12);	


for (int i = 0; i <30; i++) {
		
	
			// 18. Make each star a different random color like in Figure 4. 

	}}

	private void drawStar(int starSize) {
robot.penDown();
for (int i = 0; i <5; i++) {
	

	robot.move(starSize);
			robot.turn(144);
	}
	}	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



