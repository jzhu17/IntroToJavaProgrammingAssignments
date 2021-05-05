/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 24 November 2016
 * PA 7- This program produces a Deck class that's used for the casino game
 * Bugs: none
 */

import java.util.*;

public class Deck {
  private Card[] deck;
  private Card[] discardPile;

  public Deck(){ //initializes a full deck of cards and a deck of empty cards
    deck= new Card[52];
    Card c;
    for (int i=0; i<13; i++) {
      c= new Card(i+1, "Hearts");
      deck[i]=c;
    }
    for (int i=13; i<26; i++) {
      c= new Card(i-12, "Diamonds");
      deck[i]=c;
    }
    for (int i=26; i<39; i++) {
      c= new Card(i-25, "Clubs");
      deck[i]=c;
    }
    for (int i=39; i<52; i++) {
      c= new Card(i-38, "Spades");
      deck[i]=c;
    }
    discardPile=new Card[52];
  }

  public void shuffle(){ //shuffles the cards in a deck
    Random rand=new Random();
    for (int i=51; i>0; i--) {
      if (deck[i] != null) {
        Card temp=deck[i];
        int j=rand.nextInt(i);
        deck[i]=deck[j];
        deck[j]=temp;
      }
    }
  }

  public Card drawNextCard(){ //draws cards from a deck
    for (int i=1; i<=51; i++) {
      if (deck[i] !=null) {
        Card nextCard=deck[i];
        deck[i]=null;
        return nextCard;
      }
    }
    deck=discardPile.clone();
    discardPile=new Card[52];
    shuffle();
    return deck[0];
  }

  public void discard(Card c) { //discards a card into the discarded pile 
    for (int i=0; i<=51; i++) {
      if (discardPile[i]==null) {
        discardPile[i]=c;
        return;
      }
    }
  }

}
