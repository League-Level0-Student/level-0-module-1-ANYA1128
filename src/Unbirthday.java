import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "When is your birthday? (mm/dd)");
	if(answer.equals("04/06")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "A Very Merry UNBirthday to you!");
		
	}
	
}
}
