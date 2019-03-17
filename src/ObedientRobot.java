import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	public static void main(String[] args) {
	String shape = JOptionPane.showInputDialog(null, "What shape would you like?");
	if (shape.equals("square")) {
	String color = JOptionPane.showInputDialog(null, "Would you like red, yellow, or blue?");
	if (color.equals("red")) {
	drawRedSquare();
	}else if(color.equals("blue")){
	drawBlueSquare();
	}else if(color.equals("yellow")) {
	drawYellowSquare();
	}else {
	JOptionPane.showMessageDialog(null, "Sorry, we can't do that.");
	}
	}else if (shape.equals("triangle")) {
	String color = JOptionPane.showInputDialog(null, "Would you like red, yellow, or blue?");
	if (color.equals("red")) {
	drawRedTriangle();
	}else if(color.equals("blue")){
	drawBlueTriangle();
	}else if(color.equals("yellow")) {
	drawYellowTriangle();
	}else {
	JOptionPane.showMessageDialog(null, "Sorry, we can't do that.");
	}
	}else if (shape.equals("circle")) {
	String color = JOptionPane.showInputDialog(null, "Would you like red, yellow, or blue?");
	if (color.equals("red")) {
	drawRedCircle();
	}else if(color.equals("blue")){
	drawBlueCircle();
	}else if(color.equals("yellow")) {
	drawYellowCircle();
	}else {
	JOptionPane.showMessageDialog(null, "Sorry, we can't do that.");
	}
	}else {
	JOptionPane.showMessageDialog(null, "Sorry, we can't do that.");
	}
	}
static void drawRedSquare(){
Robot bob = new Robot();
bob.setSpeed(100);
bob.miniaturize();
bob.penDown();
bob.setPenColor(Color.red);
for (int i = 0; i < 4; i++) {
bob.move(100);
bob.turn(90);
}
bob.sparkle();
}
static void drawBlueSquare(){
Robot bob = new Robot();
bob.setSpeed(100);
bob.miniaturize();
bob.penDown();
bob.setPenColor(Color.blue);
for (int i = 0; i < 4; i++) {
bob.move(100);
bob.turn(90);
}
bob.sparkle();
}
static void drawYellowSquare(){
	Robot bob = new Robot();
	bob.setSpeed(100);
	bob.miniaturize();
	bob.penDown();
	bob.setPenColor(Color.yellow);
	for (int i = 0; i < 4; i++) {
	bob.move(100);
	bob.turn(90);
	}
	bob.sparkle();
	}
static void drawRedTriangle() {
Robot tim = new Robot();
tim.setSpeed(100);
tim.miniaturize();
tim.penDown();
tim.setPenColor(Color.red);
for (int i = 0; i < 3; i++) {
tim.move(100);
tim.turn(120);
}
tim.sparkle();
}
static void drawBlueTriangle() {
Robot tim = new Robot();
tim.setSpeed(100);
tim.miniaturize();
tim.penDown();
tim.setPenColor(Color.blue);
for (int i = 0; i < 3; i++) {
tim.move(100);
tim.turn(120);
}
tim.sparkle();
}
static void drawYellowTriangle() {
Robot tim = new Robot();
tim.setSpeed(100);
tim.miniaturize();
tim.penDown();
tim.setPenColor(Color.yellow);
for (int i = 0; i < 3; i++) {
tim.move(100);
tim.turn(120);
}
tim.sparkle();
}
static void drawRedCircle() {
Robot sam = new Robot();
sam.setSpeed(100);
sam.miniaturize();
sam.penDown();
sam.setPenColor(Color.red);
for (int i = 0; i < 360; i++) {
sam.move(1);
sam.turn(1);
}
sam.sparkle();
}
static void drawBlueCircle() {
Robot sam = new Robot();
sam.setSpeed(100);
sam.miniaturize();
sam.penDown();
sam.setPenColor(Color.blue);
for (int i = 0; i < 360; i++) {
sam.move(1);
sam.turn(1);
}
sam.sparkle();
}
static void drawYellowCircle() {
Robot sam = new Robot();
sam.setSpeed(100);
sam.miniaturize();
sam.penDown();
sam.setPenColor(Color.yellow);
for (int i = 0; i < 360; i++) {
sam.move(1);
sam.turn(1);
}
sam.sparkle();
}
}
