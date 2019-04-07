package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog("Are you happy?");
		if(answer.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever you're doing.");
		}
		else if(answer.equals("no")) {
			String secondAnswer=JOptionPane.showInputDialog("Do you want to be happy");
			
			if(secondAnswer.equals("yes")) {
				JOptionPane.showMessageDialog(null,"Change something");
			}
			else if(secondAnswer.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing ");
			}
		}
	}
		
	
}
