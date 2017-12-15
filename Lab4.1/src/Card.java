
public class Card {
	public String rank;
	public String suit;
	public int pointValue;
	
	public Card(String rank, String suit, int pointValue) {
	 this.rank = rank;
	 this.suit = suit;
	 this.pointValue = pointValue;
	}
	public String getRank()
	{
		return this.rank;
	}
	public String getSuit()
	{
		return this.suit;
	}
	public int getPointValue()
	{
		return this.pointValue;
	}
	public boolean equals(Card otherCard)
	{
		if(this.rank == otherCard.getRank() && this.suit == otherCard.getSuit() && this.pointValue == otherCard.getPointValue())
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		return this.rank+ this.suit+ this.pointValue;
	}
}
