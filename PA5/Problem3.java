/* Name: Julia Zhu
 * COSI 11A, Fall 2016, Section 2
 * Email: zzhu15@brandeis.edu
 * Date: 31 October 2016
 * PA 5 - This program produces a reverse Hangman game in which the user thinks of a word and the
  computer tries to guess the letters in that word.
 * Bugs: none
 */

import java.util.*;

public class Problem3 {
  public static void main (String[] args) {
    System.out.println("This program plays a game of reverse hangman.");
    System.out.println("You think up a word (by typing it on the computer) and I'll try to guess the letters.");     System.out.println();
    System.out.print("How many letters are in your word? ");
    Scanner console=new Scanner(System.in);
    int number=console.nextInt();
    System.out.print("Please enter the word for me to guess (letters only): ");
    String word=console.next();
    Random rand=new Random();
    hangMan(rand, console, number, word); //calls for the method that executes the game
 }

  public static void hangMan(Random rand, Scanner console, int number, String word) {
    String confirm="no"; //sets the base value of a string to be no to start the first round
    int lives=7; //sets the lives of the hangman to be 7
    int guess=0; //sets the number of right guess to be 0
    String fillInBlank=""; //sets the string of the word above the hangman to be blank
    String letters=""; //sets the string of all the guessed characters to be blank
    int random=0; //sets a value of a integer to be 0
    System.out.println();
    for (int i=0; i<number; i++) {
      System.out.print("- "); //prints the number of blanks above the hangman before the first round
    }
    System.out.println();
    for (int i=0; i<number; i++){
      fillInBlank+="-"; //covers every letter of the word with -
    }
    while (lives>0 && guess !=number){
      image(lives); //calls a method that prints the hangman image
      System.out.println();
      System.out.println("I've got "+guess+" of the "+number+" letters so far");
      random=rand.nextInt(26)+97; //produces a random number between 97 and 122
      random=repetitionCheck (letters, rand, random); //calls a method that checks if the character was repeated
      System.out.println("I guess: "+(char)(random-32));//prints a character by casting the random number into a character
      System.out.print("Is that letter in the word?");
      confirm=console.next();
      if (confirm.startsWith("n")) {//the condition that the guess is wrong
        lives--; //decreases the number of lives by 1
      } else { //the condition that the guess is right
        System.out.print("How many of that letter are in the word? ");
        int howMany=console.nextInt();
        guess++; //increases the number of right guesses by 1
      }
      System.out.println();
      letters+=(char)random; //puts all the appeared guesses into the string letters
      printWord(letters, fillInBlank, word, number); //calls a method that prints the word and blanks above the hangman
      System.out.println();
    }
    result(lives, guess, number); //calls a method that prints the result of the game
  }

  public static int repetitionCheck (String letters, Random rand, int random) {
    boolean a=true; //sets the value of a boolean to be true
    while (a) {
      a=false; //makes the while loop run only once
      for (int i=0; i<letters.length(); i++){
        while (letters.charAt(i)==(char)random) { //the condition that the guess is repeated
          random=rand.nextInt(26)+97; //produces a new random number
          a=true; //updates the boolean so the entire while loop is executed again
        }
      }
    }
    return random;
  }

  public static void printWord (String letters, String fillInBlank, String word, int number) {
    //prints the letter(s) and blanks by checking letters in the guesses with the word
    for (int i=0; i<letters.length(); i++){
      for(int j=0; j <fillInBlank.length(); j++) {
        if (letters.charAt(i)==word.charAt(j)) {
          fillInBlank=fillInBlank.substring(0,j)+word.charAt(j)+fillInBlank.substring(j+1,number);
        }
      }
    }
    for (int k=0; k<fillInBlank.length(); k++) { //prints the string one character a time with a space in between
      System.out.print(fillInBlank.charAt(k)+" ");
    }
  }

  public static void image(int lives) { //prints a specific image based on the number of lives
    System.out.println();
    if (lives==7) {
      System.out.println("+--+\n|  |\n|\n|\n|\n|\n+-----");
    } else if (lives==6) {
      System.out.println("+--+\n|  |\n|  o\n|\n|\n|\n+-----");
    } else if (lives==5) {
      System.out.println("+--+\n|  |\n|  o\n|  |\n|\n|\n+-----");
    } else if (lives==4) {
      System.out.println("+--+\n|  |\n|  o\n|  |\n|   \\\n|\n+-----");
    } else if (lives==3) {
      System.out.println("+--+\n|  |\n|  o\n|  |\n| / \\\n|\n+-----");
    } else if (lives==2) {
      System.out.println("+--+\n|  |\n|  o\n|  |\\\n| / \\\n|\n+-----");
    } else { //lives=1
      System.out.println("+--+\n|  |\n|  o\n| /|\\\n| / \\\n|\n+-----");
    }
  }

  public static void result(int lives, int guess, int number){
    if (lives>0 && guess==number) { //the condition that the computer won
      image(lives);
      System.out.println("I won.");
    } else { //the condition that the user won
      System.out.println();
      System.out.println("+--+\n|  |\n|  o\n| /|\\\n| / \\\n|\n+-----");
      System.out.println("You beat me this time.");
    }
  }
}
