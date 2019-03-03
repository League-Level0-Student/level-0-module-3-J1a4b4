package elseif;

import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
	int age = 0;
	int year = 2006;
		for (int i = 0; i < 14; i++) {
		JOptionPane.showMessageDialog(null, "In " + year + ", I was " + age + ".");
	year = year + 1;
	age = age + 1;
		}

	}

}
