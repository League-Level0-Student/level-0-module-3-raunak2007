package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String starSign=JOptionPane.showInputDialog("What is your horoscope?");
		if(starSign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Aries is full of life and possesses high energy, which makes this sign always looking for a challenge.");
			
		}
		else if(starSign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in their dimension ");
		}
		else if(starSign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Gemini are never happier than when they are sharing ideas and concepts with someone else.");
		}
		else if(starSign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "The typical cancer person is all about home and family and is very dedicated and loyal to friends and family");
		}
		else if(starSign.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Leo people know they are in charge, even when it may seem outwardly that they are not.");
		}
		else if(starSign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Virgo people are mild mannered on the surface, but underneath there is a flurry of activity");
		}
		
	}

}
