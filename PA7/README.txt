/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 24 November 2016
 * PA 7- This is a file that describes the card class, the deck class and the casino client code
 * Bugs: none
 */

    In the Card class, I created five methods, which include a Card method, getValue method, getColor method, getSuit method and toString method.
Card method sets the value and suit of a card; getValue returns the value of a card, getColor returns the color of a card and getSuit returns
the suit of a card. The toString method converts the card to a string.
    In the Deck class, I created four methods, which include a Deck method, shuffle method, drawNextCard method and discard method. Deck method
creates a full deck of card and an empty deck of cards; shuffle method shuffles the cards in a deck; drawNextCard returns a card from a deck
and discard method adds a card into the empty deck.
    In the client code "Casino.java", I gave the users an initial points of 50 points and the user can choose how much to bet on each round. Then the
user and the computer both draw from the deck. If the user wins, the amount that the user betted on will be added to the total points and vice versa.
If the user chooses to quit or if the total point is less than 0, the game will be terminated.
