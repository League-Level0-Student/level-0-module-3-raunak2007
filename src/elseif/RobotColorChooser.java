//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot jazz=new Robot();
		jazz.penDown();
		//3. Ask the user what color they would like the robot to draw
		String drawColor=JOptionPane.showInputDialog("What color do you like?");
		//5. Use an if/else statement to set the pen color that the user requested
        for(int i=0;i<10;i++) {
		if(drawColor.equalsIgnoreCase("blue")) {
        		jazz.setPenColor(Color.BLUE);
        }
        else if(drawColor.equalsIgnoreCase("green")) {
        		jazz.setPenColor(Color.GREEN);
        }
        else if(drawColor.equalsIgnoreCase("red")) {
        		jazz.setPenColor(Color.RED);
        }
        else {
        		jazz.setRandomPenColor();
        }
        }
        jazz.setPenWidth(10);
        for(int j=0;j<4;j++) {
        		jazz.setSpeed(50);
        		jazz.move(200);
        		jazz.turn(90);
        }
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
