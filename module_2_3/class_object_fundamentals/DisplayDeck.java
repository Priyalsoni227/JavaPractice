package class_object_fundamentals;

//Write a small program to test your deck and card classes.

public class DisplayDeck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Deck deck = new Deck();
        
        for(int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
        	for( int rank = Card.ACE; rank <= Card.KING; rank++) {
        		Card card=deck.getCard(suit, rank);
        		System.out.printf("%s of %s%n", card.rankToString(card.getRank()),
        				card.suitToString(card.getSuit()));
        	}
        }
	}

}
