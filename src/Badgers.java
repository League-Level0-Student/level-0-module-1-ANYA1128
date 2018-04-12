import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			for (int i1 = 0; i1 < 10; i1++) {
				JOptionPane.showMessageDialog(null, "BADGER");

			}
			if (i < 3) {
				for (int i1 = 0; i1 < 2; i1++) {
					JOptionPane.showMessageDialog(null, "MUSHROOM");

				}
			}

			
		}
		for (int i1 = 0; i1 < 2; i1++) {
			JOptionPane.showMessageDialog(null, "SNAKE");

		}
	
	}
}
