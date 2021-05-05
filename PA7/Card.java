/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 24 November 2016
 * PA 7- This program produces a Card class that's used for the casino game
 * Bugs: none
 */

public class Card {
  private int number;
  private String suit;

  public Card (int value, String suit){ //sets the number and suit of a card
    this.number=value;
    this.suit=suit;
  }

  public int getValue() { //returns the value of the card
    return number;
  }

  public String getColor() { //returns the color of the card
    if (suit.equals("Hearts")|| suit.equals("Diamonds")){
      return "red";
    }else {
      return "black";
    }
  }

  public String getSuit() { //returns the suit of the card
    return suit;
  }

  public String toString() { //converts the card to a string
    if (number<=10) {
      return number +" of "+ suit;
    } else if (number==1) {
      return "Ace of "+suit;
    } else if (number==11) {
      return "Jack of "+suit;
    } else if (number==12) {
      return "Queen of "+suit;
    } else {
      return "King of "+suit;
    }
  }
}
