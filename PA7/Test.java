public class Test{
  public static void main(String[] args){
		Deck d = new Deck();

		// This should print all 52 cards, and then shuffle the deck, and then draw a new random card.
		// The discard pile should slowly be filling up
		Card c;
		for (int i = 0; i<=51; i++){
			c = d.drawNextCard();
			System.out.println(c); // should work if you wrote Card.toString()
			d.discard(c);
		}
		// Testing for cards out of the deck
		for (int i = 0; i<=51; i++){
			c = d.drawNextCard();
			System.out.println(c); // should work if you wrote Card.toString()
			d.discard(c);
		}
	}
}
