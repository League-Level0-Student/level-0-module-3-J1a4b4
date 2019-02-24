//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		int newAngle = 90;
		int distance = 0;
		Robot oliver = new Robot();
		oliver.penDown();
		// 3. Ask the user what color they would like the robot to draw
		oliver.miniaturize();
		for (int j = 0; j < 50; j++) {
		String penColor = JOptionPane.showInputDialog(null, "What is your favorite color?");
		// 5. Use an if/else statement to set the pen color that the user requested
if (penColor.equals("red")) {
	oliver.setPenColor(Color.red);
}else if (penColor.equals("green")) {
	oliver.setPenColor(Color.green);
}else if (penColor.equals("blue")) {
	oliver.setPenColor(Color.blue);
}else if (penColor.equals("yellow")) {
	oliver.setPenColor(Color.yellow);
}else if (penColor.equals("black")) {
	oliver.setPenColor(Color.black);
}else if (penColor.equals("orange")) {
	oliver.setPenColor(Color.orange);
}else if (penColor.equals("white")) {
	oliver.setPenColor(Color.white);
}else if (penColor.equals("pink")) {
	oliver.setPenColor(Color.pink);
}else{
	oliver.setRandomPenColor();
}// 6. If the user doesn’t enter anything, choose a random color

		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them

		// 4. Set the pen width to 10
oliver.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
oliver.move(10 + distance);
distance = distance + 10;
oliver.setAngle(newAngle);
newAngle = newAngle + 90;
		}
		}
}
