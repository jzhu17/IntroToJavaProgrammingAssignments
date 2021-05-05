/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 31 October 2016
 * PA 5 - This program  allows the user to play many rounds of the Rock Paper Scissors game with two strategies。
 * Bugs: none
 */

import java.util.*;

public class Problem1 {
  public static void main (String[] args) {
    System.out.print("Welcome to Julia's Rock-Paper-Scissors Game! ");
    System.out.println("Which strategy would you like to play against? ");
    System.out.println("--->(Enter 1 to select random mode. Computer will ramdonly choose between rock, paper and scissor.)");
    System.out.println("--->(Enter 2 to select pattern mode. Computer will choose between the three items based on a particular pattern.)");
    Scanner console = new Scanner (System.in);
    Random rand = new Random();
    int strategy=console.nextInt();
    if (strategy==1) { //user selects the random mode
      randomMode(rand, console); //calls the random mode method
    } else { //strategy=2, user selects the pattern mode
      patternMode(console); //calls the pattern mode method
    }
  }

  public static void randomMode(Random rand, Scanner console) {
    System.out.println("You selected random mode.");
    int player=0;
    int sum=0; //sets the number of rounds to be 0
    int win=0; //sets the number of winning rounds to be 0
    int lose=0; //sets the number of losing rounds to be 0
    String pick=""; //sets computer's pick to be blank
    while (player !=-1) { //executes the while loop when user chooses to continue playing
      System.out.println("Enter 0 to pick rock, 1 to pick paper or 2 to pick scissors.(Enter -1 to quit the game.)");
      //prompts the user to pick either rock, paper or scissors
      player=console.nextInt();
      int computer=rand.nextInt(3); //produces a radom number between 0, 1 or 2
      if (computer == 0) { //computer's pick would be rock when the random number is 0
        pick="Rock";
      } else if (computer == 1) { //computer's pick would be paper when the random number is 1
        pick="Paper";
      } else {  //computer's pick would be scissors when the random number is 2
        pick="Scissors";
      }
      if (player==computer) { //the condition that both sides pick the same things
        System.out.println("The computer picks "+pick+". It's a tie.");
      } else if (player==0 && computer==2||player==1 && computer==0||player==2 && computer==1) { //the conditions that the user wins
        System.out.println("The computer picks "+pick+". You win!");
        win++; //number of winning rounds increase by 1
      } else if (player==0 && computer==1||player==1 && computer==2||player==2 && computer==0){ //the conditions that the computer wins
        System.out.println("The computer picks "+pick+". You lose.");
        lose++; //number of losing rounds increase by 1
      } else { //the condition that the user enters an value that's not 0, 1 or 2
        System.out.println("Empty round. The number can only be 0, 1 or 2.");
      }
      sum++; //calculates the number of rounds the user has played
    }
  System.out.println("You played "+(sum-1)+" round(s), won "+win+" round(s), lost "+lose+" round(s).Thanks for playing!");
  //produces an overall result of the game when user chooses to quit
  }

  public static void patternMode(Scanner console) { //produces the strategy that the computer would always pick rock, paper and scissors in order
    System.out.println("You selected pattern mode.");
    int player=0;
    int sum=0; //sets the number of rounds to be 0
    int win=0; //sets the number of winning rounds to be 0
    int lose=0; //sets the number of losing rounds to be 0
    String pick=""; //sets computer's pick to be blank
    while (player !=-1) { //executes the loop when the user chooses to continute playing
      System.out.println("Enter 0 to pick rock, 1 to pick paper or 2 to pick scissors.(Enter -1 to quit the game.)");
      //prompts the user to pick either rock, paper or scissors
      player=console.nextInt();
      if (sum%3==0) { //computer picks rock if number of rounds divided by 3 is 0
        pick="Rock";
      } else if (sum%3==1) { //computer picks paper if number of rounds divided by 3 is 1
        pick="Paper";
      } else { //computer picks scissors if number of rounds divided by 3 is 2
        pick="Scissors";
      }
      if (player==(sum%3)) { //the condition that both sides pick the same things
        System.out.println("The computer picks "+pick+". It's a tie.");
      } else if (player==0 && (sum%3)==2||player==1 && (sum%3)==0||player==2 && (sum%3)==1) { //the condition that the user wins
        System.out.println("The computer picks "+pick+". You win!");
        win++; //number of winning rounds increase by 1
      } else if (player==0 && (sum%3)==1||player==1 && (sum%3)==2||player==2 && (sum%3)==0){ //the condition that the user loses
        System.out.println("The computer picks "+pick+". You lose.");
        lose++; //number of losing rounds increase by 1
      } else { //the condition that the user enters an invalid value
        System.out.println("Empty round. The number can only be 0, 1 or 2.");
      }
      sum++; //calculates the number of rounds the user has played by increasing sum by 1
    }
    System.out.println("You played "+(sum-1)+" round(s), won "+win+" round(s), lost "+lose+" round(s).Thanks for playing!");
    //produces an overall result of the game when user chooses to quit
  }
}
