/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 24 November 2016
 * PA 7- This program lets users play a casino game called War
 * Bugs: none
 */

import java.util.*;

public class Casino{
  public static void main(String[] args) {
    System.out.println("Welcome to the Simple War card game!");
    System.out.println("The rules of this game are simple. If you have the higher card, you win.");
    System.out.println("If the computer has the higher card, you lose. If it's a tie, neither win");
    Scanner console=new Scanner(System.in);
    Random rand=new Random();
    war(console, rand);
  }

  public static void war(Scanner console, Random rand) {
    System.out.println("You have 50 points in total.");
    int total=50; //sets the base value of total points as 50
    int end=0;
    while (total>0 && end==0){ //the condition that the player decides to continue and there's remaining points
      Deck d=new Deck();
      d.shuffle();
      System.out.println("How much would you like to bet on the round? ");
      int bet=console.nextInt();
      Card user=d.drawNextCard(); //user draws a card
      Card computer=d.drawNextCard(); //computer draws a card
      d.discard(user);
      d.discard(computer);
      System.out.println("You picked "+user+" and the computer picked "+computer);
      if (user.getValue()>computer.getValue()) {
        total+=bet; //the user won the bet points
        System.out.println("You won the round! Your total point(s) is "+total);
      } else if (user.getValue()<computer.getValue()){
        total-=bet; //the user lost the bet points
        System.out.println("You lost the round. Your total point(s) is "+total);
      } else {
          System.out.println("It's a tie. Your total point(s) is "+total);
      }
      if (total>0){
        System.out.println("Would you like to continue? (Enter 0 to continue, or enter 1 to quit.)");
        end=console.nextInt();
      }
    }
    if (total<=0) {
      System.out.println("You lost the game!");
    }
    System.out.println("Thanks for playing!");
  }
}
