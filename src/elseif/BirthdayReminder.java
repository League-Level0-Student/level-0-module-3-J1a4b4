
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "May 14th";
		String dadsBirthday = "November 27th";
		String myBirthday = "August 11th";
		for (int i = 0; i < 4; i++) {
			// 2. Find out which birthday the user wants and and store their response in a
			// variable
			String userResponse = JOptionPane.showInputDialog(null, "Which person's birthday do you want?");
			// 3. Print out what the user typed
			if (userResponse.equals("mom")) {
				JOptionPane.showMessageDialog(null, "Mom's birthday is " + momsBirthday + ".");
			} else if (userResponse.equals("dad")) {
				JOptionPane.showMessageDialog(null, "Dad's birthday is " + dadsBirthday + ".");
			} else if (userResponse.equals("me")) {
				JOptionPane.showMessageDialog(null,
						"Your birthday is " + myBirthday + ".  You should remember your own birthday!");
			} else {
				JOptionPane.showMessageDialog(null, "The answer is 42.");
			}
			// 4. if user asked for "mom"
			// print mom's birthday
			// 5. if user asked for "dad"
			// print dad's birthday
			// 6. if user asked for your name
			// print myBirthday
			// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		}
	}
}
