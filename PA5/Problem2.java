/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 31 October 2016
 * PA 5 - This program allows the user to play a simple guessing game in which the user thinks up
 an integer and the computer guesses the integer until it gets it right.
 * Bugs: none
 */


import java.util.*;

public class Problem2 {
  public static final int MAX=100; //creates a class constant representing the MAXimum of the guesses
  public static void main (String[] args) {
    System.out.println("This program allows you to play a guessing game.");
    System.out.println("Think of a number between 1 and "+MAX);
    System.out.println("and I will guess until I get it.");
    System.out.println("For each guess, tell me if the");
    System.out.println("right answer is higher or lower than your guess, or if it is correct.");
    Scanner console=new Scanner(System.in);
    guess(console);
  }

  public static void guess(Scanner console) {
    int game=0; //sets the number of games the user has played to be 0
    int guesses=0; //sets the number of total guesses to be 0
    int MAXGuess=0; //sets the number of the MAXimum guesses in a single game to be 0
    String again="yes"; //sets the base value of the string to be yes so the user always plays the first round
    while (again.startsWith("y")||again.startsWith("Y")) { //executes the loop if the user chooses to continue playing
      int number=MAX/2; //sets the first guess to be half of the MAXimum value
      int sum=0; //sets the number of guesses in a single game to be 0
      int big=MAX+1; //sets the cap the guesses to be 1+the MAXimum value
      int small=0; //sets the smallest value of the guesses to be 0
      String guess="higher";
      System.out.println();
      System.out.println("Think of a number...");
      while (!guess.equals("correct")){ //the condition that the number is not the user's number
        System.out.println("My guess: "+number);
        guess=console.next();
        if (guess.equals("higher")) { //the condition that the guess is lower than the user's number
          small=number; //sets the smallest value to be the number
          number+=(big-small)/2; //updates the value of the number based on the range
        } else { //the condition that the guess is higher than the user's number
          big=number; //sets the biggest value to be the number
          number-=(big-small)/2; //updates the value of the number based on the range
        }
        sum++; //calculates the number of guesses in a single game
      }
      System.out.println("I got it right in "+ sum +" guesses");
      System.out.println();
      System.out.print("Do you want to play again? ");
      again=console.next(); //updates the string to determine whether to play again
      guesses+=sum; //calculates the sum of all the gusses from every game
      game++; //calculates the number of games played
      if (MAXGuess<sum){ //condition that the MAXimum guesses is smaller than the guesses in a simgle game
        MAXGuess=sum; //updates the MAXimum guesses to be the guesses in that single game
      }
    }
    System.out.println();
    System.out.println("Overall results: ");
    System.out.println("    total games   = "+game);
    System.out.println("    total guesses = "+guesses);
    System.out.println("    guesses/game  = "+(guesses/(double)game));
    //prints the gusses per game by dividing total games by total guesses
    System.out.println("    MAX guesses   = "+MAXGuess);
  }
}
