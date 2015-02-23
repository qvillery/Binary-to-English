import javax.swing.*;
public class BinaryToEnglish {

	public static void main(String[] args) {
		String binary = JOptionPane.showInputDialog("Please enter your binary phrase");
		
		StringBuilder english = new StringBuilder();
		
		for(int i = 0; i < binary.length(); i+= 8) {
			String letter = (binary.substring(i, i+8));
			english.append((char)Integer.parseInt(letter, 2));
		}
		String translated = english.toString();
		JOptionPane.showMessageDialog( null, "The translation is: " + translated, "The Translation", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
