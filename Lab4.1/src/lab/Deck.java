package lab;

import java.util.ArrayList;

public class Deck {
	// an arrayList of all the cards in the deck
	private ArrayList<Card> Undealt;
	//an arrayList we will use to hold cards we have already seen, so we can shuffle them back in.
	private ArrayList<Card> Dealt;
	//Creates New Cards and adds it to Undealt
	public Deck(String[] rank, String[] suit, int[] pointValue) {
		ArrayList<Card> cards = new ArrayList<>();
		Dealt = new ArrayList<>();
		for (int i = 0 ; i < rank.length;i++)
		{
			for (int j = 0; j < suit.length;j++)
			{
				cards.add(new Card(rank[i], suit[j], pointValue[i])) ;
			}
		}
		this.Undealt = cards;
	}
	//returns true if the size of the undealt pile is 0
	public boolean isEmpty()
	{
		return Undealt.size() == 0;
	} 
	//return the size of the undealt pile
	public int size ()
	{
		return Undealt.size();
	}
	//Deals the cards by removing the top card from the undealt and adding it to the dealt
	public Card deal()
	{
		Card i = this.Undealt.remove(this.size()-1);
		Dealt.add(i);
		return i;
	}
	//Switches index card at index of i with card at index of j
	private void swap(int i, int j) {
		Card x = Undealt.get(i);
		Undealt.set(i, Undealt.get(j));
		Undealt.set(j, x);
	}
	public void shuffle()
	{
		for (int k = 51; k > 0; k--) {
			swap(k, (int) (Math.random() * (k+1)));
		}
	}
}

