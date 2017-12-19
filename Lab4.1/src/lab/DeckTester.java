package lab;
import lab.Deck;
public class DeckTester {
	public static void main (String[] args)
	{
		String[] ranks = {"Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","Kind","Ace","Two"};
		String[] suit = {"Diamonds","Clovers","Heats","Spades"};
		int[] pointvalue= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck Deck1 = new Deck(ranks,suit,pointvalue);
		Deck1.shuffle();
		System.out.println(Deck1);
	}
}