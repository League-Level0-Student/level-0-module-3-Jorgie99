
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(20);
		rob.setPenWidth(20);
		int x = 0;
		while(x == 0) {
			String color = JOptionPane.showInputDialog("What color pen would you like?");
			if(color.contentEquals("orange")) {
				rob.setPenColor(240, 163, 7);
			} else if(color.contentEquals("pink")){
				rob.setPenColor(252,157,219);
			} else {
				rob.setRandomPenColor();
			}
			for(int i = 0; i < 4; i++) {
				rob.move(100);
				rob.turn(90);
			}
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
