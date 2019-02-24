//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(99) + 1;
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guessValue = JOptionPane.showInputDialog(null, "Guess a number.");
			// 4. Convert the users’ answer to an integer (Integer.parseInt(string))
	int guess = Integer.parseInt(guessValue);
	if (guess == random) {
		JOptionPane.showMessageDialog(null, "Congratulations! You win High or Low!  Send your name, age, address, phone number, Social Security number, email address, and mother's maiden name to HighLowGame@email.com to recieve your prize!");
	JOptionPane.showMessageDialog(null, "... and it only took you " + (i + 1) + " guesses!");
		System.exit(0);
	}else if (guess > random) {
	JOptionPane.showMessageDialog(null, "Your guess is too high.");
	}else if (guess < random) {
	JOptionPane.showMessageDialog(null, "Your guess is too low.");
	}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "Unfortunately, your guesses were all wrong.  Better luck next time, contestant.");
	}

}


