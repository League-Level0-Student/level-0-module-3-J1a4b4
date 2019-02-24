package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
String answeri = JOptionPane.showInputDialog(null, "Are you happy?");
if (answeri.equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep on doing what you're doing.");
}else {
String answerii = JOptionPane.showInputDialog(null, "Do you want to be happy?");
if (answerii.equals("No")) {
	JOptionPane.showMessageDialog(null, "Keep on doing what you're doing.");
}else {
	JOptionPane.showMessageDialog(null, "You should probably change something.  Do what you like.  Like what you do.");
}
}
	}

}
