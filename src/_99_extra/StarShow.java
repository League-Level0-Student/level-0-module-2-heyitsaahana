
package _99_extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
 * 1. ask students to find and explain the method in this recipe. 
 * 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {

	Robot robot = new Robot("batman");

	void makeStars() {

	
		// 13. Set the speed to 8
		robot.setSpeed(100);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int x=10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
		int y=600;
		// 8. Make a variable to hold the star size and set it to 25
		int starsize=25;
		// 12. Repeat the steps #19 to #18, 30 times
		for(int r=0;r<30;r++) {
			// 19. Set the pen width to i 
			robot.setPenWidth(r);
			// 10. Set the X position of the robot to your X variable
			robot.setX(x);
			// 11. Set the Y position of the robot to your Y variable
			robot.setY(y);
			// 9. Call the drawStar() method with your star size variable
			drawStar(starsize);
			// 14. Increase the X position by star size. See Figure 2.
			x+=starsize;
			// 15. decrease the Y position by star size. See Figure 3.
			y-=starsize;
			// 16. Increase the star size by 20
			starsize+=20;
			// 17. Turn the robot 12 degrees
			robot.setAngle(12);
			// 18. Make each star a different random color like in Figure 4. 
			robot.setRandomPenColor();
		}
	}
	private void drawStar(int starSize)  {
		// 2. Put the robot's pen down
		robot.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for( int z=0;z<5;z++) {
			// 1. Move the robot the distance of the starSize variable
			robot.move(starSize);
			// 3. Turn the robot 144 degrees
			robot.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





