import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		int score = 0;
		String answer = JOptionPane.showInputDialog(null, "You can drop me from the tallest building"
				+ " and I'll be fine, but if you drop me in water I die. What am I?");
		if (answer.equalsIgnoreCase("paper")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong!: The correct answer is paper.");
		}

		String answer1 = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly?");
		if (answer1.equalsIgnoreCase("incorrectly")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score++;
		}

		else {
			JOptionPane.showMessageDialog(null, "Wrong!: The correct answer is incorrectly.");
		}

		JOptionPane.showMessageDialog(null, "Score: " + score);
	}
}
