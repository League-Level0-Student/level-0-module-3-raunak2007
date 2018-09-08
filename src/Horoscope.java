import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String starSign=JOptionPane.showInputDialog("What is your star sign");
		if(starSign.equalsIgnoreCase("pisces")) {
			JOptionPane.showMessageDialog(null, "Pisces tend to be daydreamers, often dreaming up brilliant ideas and plans which they are unable to facilitate themselves. \n They have a happy and vibrant inner life that few get to share or see.\n They are deeply caring about others and don’t like to see people become unhappy.");
		}
		else if(starSign.equalsIgnoreCase("virgo")) {
			JOptionPane.showMessageDialog(null, "Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. They tend to be extremely detail oriented and particularly like producing something that is not only useful, but beautiful and skillful.");
		}
		else if(starSign.equalsIgnoreCase("scorpio")) {
			JOptionPane.showMessageDialog(null,"The scorpio person is not necessarily aggressive on its own, unless provoked and in general would rather be contemplative. They crave alone time and often become extremely annoyed when they don’t get it. Scorpio people are great secret keepers and feel each emotion more intensely than other signs. Perhaps because of this they are able to be quite discerning when assisting people with their problems. They are able to cut to the bottom line and show others the best and the worst in their lives.");
		}
		else if(starSign.equalsIgnoreCase("aries")) {
			JOptionPane.showMessageDialog(null,"The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice. They often excel at anything where a bit of competition is involved, whether this is of a cognitive nature or physical. The challenge is the thing. If there is a chance to win, to best someone, to show off abilities, Aries is in it to win it. The Aries person feels most alive when they are in control and leading others. They are often impatient and abrupt with those whom they feel are not their equals and are in a leadership position. Most Aries do not like being told what to do if the person in charge is less talented than they.\n" + 
					"\n" + 
					"");
		}
		else if(starSign.equalsIgnoreCase("libra")) {
			JOptionPane.showMessageDialog(null,"Libra people need to keep a balance between work lives and recreational lives and an equal balance in their emotional and spiritual/physical lives. Because of this need Libra signs can sometimes seem wishy-washy when they are asked to make a decision. This is because they must ‘weigh’ all of their options. However, rest assured, that when a Libra makes up their mind the decision is likely to be the best win/win for all involved; benefiting the most people. This sign does not like to see people unhappy.\n" + 
					"\n" + 
					"");
		}
		else {
			JOptionPane.showMessageDialog(null, "that isn't a star sign, you idiot");
		
		
		}
		
	}

}
