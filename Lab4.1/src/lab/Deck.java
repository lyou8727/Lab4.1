package lab;

import java.util.ArrayList;

public class Deck {
	// an arrayList of all the cards in the deck
	private ArrayList<Card> Undealt;
	//an arrayList we will use to hold cards we have already seen, so we can shuffle them back in.
	private ArrayList<Card> Dealt;
	public Deck(String[] rank, String[] suit, int[] pointValue) {
		for (int i = 0 ; i < rank.length;i++)
		{
			for (int j = 0; j < suit.length;j++)
			{
				for (int z = 0; z < pointValue.length;z++)
				{
					Card newdeck = new Card(rank[i], suit[j], pointValue[z]);
					Undealt.add(newdeck);
				}
			}
		}
	}
	public boolean isEmpty()
	{
		return Undealt.size() == 0;
	} 
	public int size ()
	{
		return Undealt.size();
	}
	public Card deal()
	{
		Card i = Undealt.get((int)(Math.random() * Undealt.size()));
		Dealt.add(i);
		return i;
	}
	public void shuffle()
	{
		while(Dealt.size() > 0)		
		{
			 Undealt.add(Dealt.get(0));
			 Dealt.remove(0);
		}
		for(int k = 51; k > 0; k++)
		{
			 int i = (int)(Math.random()*k);
			 Card x = Dealt.get(k);
			 Dealt.set(k,Dealt.get(i));
			 Dealt.set(i,x);
		}
	}
}

