import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String mood=JOptionPane.showInputDialog("Are you happy?");
		if(mood.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing");
		}
		else if(mood.equalsIgnoreCase("No")) {
			String want=JOptionPane.showInputDialog("Do you want to be happy?");
			if(want.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			else if(want.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");
			}
			
		}
		
	}

}
